/*******************************************************************************
 * Copyright 2014-2017, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package sereneseasons.config;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import sereneseasons.api.config.ISyncedOption;
import sereneseasons.api.config.SyncedConfig;
import sereneseasons.core.SereneSeasons;
import sereneseasons.init.ModConfig;

public abstract class ConfigHandler
{
    public Configuration config;
    public final String description;

    protected ConfigHandler(File configFile, String description)
    {
        config = new Configuration(configFile);
        loadConfiguration();

        MinecraftForge.EVENT_BUS.register(this);
        this.description = description;
        ModConfig.configHandlers.add(this);
    }

    protected abstract void loadConfiguration();

    protected <T> void addSyncedValue(ISyncedOption option, T defaultValue, String category, String comment, T... args)
    {
        String value = "";

        if (defaultValue instanceof String)
        {
            value = config.getString(option.getOptionName(), category, defaultValue.toString(), comment);
        }
        else if (defaultValue instanceof Integer)
        {
            value = "" + config.getInt(option.getOptionName(), category, (Integer)defaultValue, (Integer)args[0], (Integer)args[1], comment);
        }
        else if (defaultValue instanceof Boolean)
        {
            value = "" + config.getBoolean(option.getOptionName(), category, (Boolean)defaultValue, comment);
        }
        else if (defaultValue instanceof Float)
        {
            value = "" + config.getFloat(option.getOptionName(), category, (Float)defaultValue, (Float)args[0], (Float)args[1], comment);
        }

        SyncedConfig.addOption(option, value);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(SereneSeasons.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
