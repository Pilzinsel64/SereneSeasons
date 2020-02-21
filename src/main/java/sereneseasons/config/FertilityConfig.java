package sereneseasons.config;

public class FertilityConfig
{
	public static General general_category = new General();
	public static SeasonFertility seasonal_fertility = new SeasonFertility();

	public static class General
	{
		public boolean seasonal_crops = true;
		
		public boolean crops_break = false;
		
		public boolean ignore_unlisted_crops = false;
		
		public boolean crop_tooltips = true;
		
		public int greenhouse_glass_max_height = 7;
	}

	public static class SeasonFertility
	{
        public String [] spring_crops = new String[]
        {
            "minecraft:potato",
            "minecraft:carrot",
            "minecraft:sapling",
            "minecraft:nether_wart",
            "minecraft:tallgrass",
            "minecraft:grass",
            "minecraft:red_mushroom",
            "minecraft:brown_mushroom",

            "harvestcraft:cauliflowerItem",
            "harvestcraft:coffeebeanItem",
            "harvestcraft:garlicItem",
            "harvestcraft:beanItem",
            "harvestcraft:rhubarbItem",
            "harvestcraft:strawberryItem",
            "harvestcraft:oatsItem",
            "harvestcraft:celeryItem",
            "harvestcraft:peasItem",
            "harvestcraft:broccoliItem",
            "harvestcraft:cabbageItem",
            "harvestcraft:spinachItem",
            "harvestcraft:zucchiniItem",
            "harvestcraft:tealeafItem",
            "harvestcraft:sweetpotatoItem",
            "harvestcraft:turnipItem",
            "harvestcraft:leekItem",
            "harvestcraft:brusselsproutItem",
            "harvestcraft:asparagusItem",
            "harvestcraft:barleyItem",
            "harvestcraft:onionItem",
            "harvestcraft:parsnipItem",
            "harvestcraft:cauliflowerseedItem",
            "harvestcraft:coffeeseedItem",
            "harvestcraft:garlicseedItem",
            "harvestcraft:beanseedItem",
            "harvestcraft:rhubarbseedItem",
            "harvestcraft:strawberryseedItem",
            "harvestcraft:oatsseedItem",
            "harvestcraft:celeryseedItem",
            "harvestcraft:peasseedItem",
            "harvestcraft:broccoliseedItem",
            "harvestcraft:cabbageseedItem",
            "harvestcraft:spinachseedItem",
            "harvestcraft:zucchiniseedItem",
            "harvestcraft:teaseedItem",
            "harvestcraft:sweetpotatoseedItem",
            "harvestcraft:turnipseedItem",
            "harvestcraft:leekseedItem",
            "harvestcraft:brusselsproutseedItem",
            "harvestcraft:asparagusseedItem",
            "harvestcraft:barleyseedItem",
            "harvestcraft:onionseedItem",
            "harvestcraft:parsnipseedItem",
            "harvestcraft:scallionItem",
            "harvestcraft:scallionseedItem",
            "harvestcraft:kaleItem",
            "harvestcraft:kaleseedItem",
            "harvestcraft:chickpeaItem",
            "harvestcraft:flaxItem",
            "harvestcraft:jicamaItem",
            "harvestcraft:kohlrabiItem",
            "harvestcraft:lentilItem",
            "harvestcraft:quinoaItem",
            "harvestcraft:chickpeaseedItem",
            "harvestcraft:flaxseedItem",
            "harvestcraft:jicamaseedItem",
            "harvestcraft:kohlrabiseedItem",
            "harvestcraft:lentilseedItem",
            "harvestcraft:quinoaseedItem",

            "Growthcraft|Rice:grc.rice",
            "jaffa:kaleCrop",
            "witchery:seedswormwood",
            "witchery:garlic",
            "Natura:NetherBerryBush",
        };

        public String [] summer_crops = new String[]
        {
            "minecraft:melon_seeds",
            "minecraft:wheat_seeds",
            "minecraft:reeds",
            "minecraft:cocoa",
            "minecraft:cactus",
            "minecraft:sapling",
            "minecraft:nether_wart",
            "minecraft:tallgrass",
            "minecraft:grass",
            "minecraft:red_mushroom",
            "minecraft:brown_mushroom",
            "simplecorn:kernels",

            "harvestcraft:coffeebeanItem",
            "harvestcraft:beanItem",
            "harvestcraft:blueberryItem",
            "harvestcraft:cornItem",
            "harvestcraft:chilipepperItem",
            "harvestcraft:radishItem",
            "harvestcraft:tomatoItem",
            "harvestcraft:grapeItem",
            "harvestcraft:raspberryItem",
            "harvestcraft:peasItem",
            "harvestcraft:cottonItem",
            "harvestcraft:tealeafItem",
            "harvestcraft:sweetpotatoItem",
            "harvestcraft:spiceleafItem",
            "harvestcraft:riceItem",
            "harvestcraft:seaweedItem",
            "harvestcraft:waterchestnutItem",
            "harvestcraft:okraItem",
            "harvestcraft:pineappleItem",
            "harvestcraft:kiwiItem",
            "harvestcraft:sesameseedsItem",
            "harvestcraft:curryleafItem",
            "harvestcraft:bambooshootItem",
            "harvestcraft:cantaloupeItem",
            "harvestcraft:gingerItem",
            "harvestcraft:soybeanItem",
            "harvestcraft:barleyItem",
            "harvestcraft:cucumberItem",
            "harvestcraft:mustardseedsItem",
            "harvestcraft:onionItem",
            "harvestcraft:peanutItem",
            "harvestcraft:bellpepperItem",
            "harvestcraft:lettuceItem",
            "harvestcraft:coffeeseedItem",
            "harvestcraft:beanseedItem",
            "harvestcraft:blueberryseedItem",
            "harvestcraft:cornseedItem",
            "harvestcraft:chilipepperseedItem",
            "harvestcraft:radishseedItem",
            "harvestcraft:tomatoseedItem",
            "harvestcraft:grapeseedItem",
            "harvestcraft:raspberryseedItem",
            "harvestcraft:peasseedItem",
            "harvestcraft:cottonseedItem",
            "harvestcraft:teaseedItem",
            "harvestcraft:sweetpotatoseedItem",
            "harvestcraft:spiceleafseedItem",
            "harvestcraft:riceseedItem",
            "harvestcraft:seaweedseedItem",
            "harvestcraft:waterchestnutseedItem",
            "harvestcraft:okraseedItem",
            "harvestcraft:pineappleseedItem",
            "harvestcraft:kiwiseedItem",
            "harvestcraft:sesameseedsseedItem",
            "harvestcraft:curryleafseedItem",
            "harvestcraft:bambooshootseedItem",
            "harvestcraft:cantaloupeseedItem",
            "harvestcraft:gingerseedItem",
            "harvestcraft:soybeanseedItem",
            "harvestcraft:barleyseedItem",
            "harvestcraft:cucumberseedItem",
            "harvestcraft:mustardseedItem",
            "harvestcraft:onionseedItem",
            "harvestcraft:peanutseedItem",
            "harvestcraft:bellpepperseedItem",
            "harvestcraft:lettuceseedItem",
            "harvestcraft:cactusfruitItem",
            "harvestcraft:cactusfruitseedItem",
            "harvestcraft:candleberryItem",
            "harvestcraft:candleberryseedItem",
            "harvestcraft:gigapickleItem",
            "harvestcraft:gigapickleseedItem",
            "harvestcraft:agaveItem",
            "harvestcraft:amaranthItem",
            "harvestcraft:cassavaItem",
            "harvestcraft:greengrapeItem",
            "harvestcraft:juteItem",
            "harvestcraft:kenafItem",
            "harvestcraft:kohlrabiItem",
            "harvestcraft:milletItem",
            "harvestcraft:mulberryItem",
            "harvestcraft:sisalItem",
            "harvestcraft:taroItem",
            "harvestcraft:agaveseedItem",
            "harvestcraft:amaranthseedItem",
            "harvestcraft:cassavaseedItem",
            "harvestcraft:greengrapeseedItem",
            "harvestcraft:juteseedItem",
            "harvestcraft:kenafseedItem",
            "harvestcraft:kohlrabiseedItem",
            "harvestcraft:milletseedItem",
            "harvestcraft:mulberryseedItem",
            "harvestcraft:sisalseedItem",
            "harvestcraft:taroseedItem",

            "Growthcraft|Apples:grc.appleSeeds",
            "Growthcraft|Apples:grc.appleSapling",
            "Growthcraft|Apples:grc.appleLeaves",
            "Growthcraft|Hops:grc.hopSeeds",
            "Growthcraft|Hops:grc.hops",
            "Growthcraft|Milk:grcmilk.SeedThistle",
            "Growthcraft|Milk:grcmilk.Thistle",
            "Growthcraft|Rice:grc.rice",
            "witchery:seedsmandrake",
            "witchery:seedswormwood",
            "Natura:NetherBerryBush",
        };

        public String [] autumn_crops = new String[]
        {
            "minecraft:carrot",
            "minecraft:pumpkin_seeds",
            "minecraft:wheat_seeds",
            "minecraft:beetroot_seeds",
            "minecraft:sapling",
            "minecraft:nether_wart",
            "minecraft:grass",
            "minecraft:red_mushroom",
            "minecraft:brown_mushroom",

            "harvestcraft:cornItem",
            "harvestcraft:artichokeItem",
            "harvestcraft:beetItem",
            "harvestcraft:cranberryItem",
            "harvestcraft:eggplantItem",
            "harvestcraft:grapeItem",
            "harvestcraft:whitemushroomItem",
            "harvestcraft:blackberryItem",
            "harvestcraft:oatsItem",
            "harvestcraft:ryeItem",
            "harvestcraft:peasItem",
            "harvestcraft:spinachItem",
            "harvestcraft:tealeafItem",
            "harvestcraft:sweetpotatoItem",
            "harvestcraft:gingerItem",
            "harvestcraft:wintersquashItem",
            "harvestcraft:onionItem",
            "harvestcraft:cornseedItem",
            "harvestcraft:artichokeseedItem",
            "harvestcraft:beetseedItem",
            "harvestcraft:cranberryseedItem",
            "harvestcraft:eggplantseedItem",
            "harvestcraft:grapeseedItem",
            "harvestcraft:whitemushroomseedItem",
            "harvestcraft:blackberryseedItem",
            "harvestcraft:oatsseedItem",
            "harvestcraft:ryeseedItem",
            "harvestcraft:peasseedItem",
            "harvestcraft:spinachseedItem",
            "harvestcraft:teaseedItem",
            "harvestcraft:sweetpotatoseedItem",
            "harvestcraft:gingerseedItem",
            "harvestcraft:wintersquashseedItem",
            "harvestcraft:onionseedItem",
            "harvestcraft:rutabagaItem",
            "harvestcraft:rutabagaseedItem",
            "harvestcraft:amaranthItem",
            "harvestcraft:arrowrootItem",
            "harvestcraft:elderberryItem",
            "harvestcraft:greengrapeItem",
            "harvestcraft:huckleberryItem",
            "harvestcraft:jicamaItem",
            "harvestcraft:kohlrabiItem",
            "harvestcraft:quinoaItem",
            "harvestcraft:amaranthseedItem",
            "harvestcraft:arrowrootseedItem",
            "harvestcraft:elderberryseedItem",
            "harvestcraft:greengrapeseedItem",
            "harvestcraft:huckleberryseedItem",
            "harvestcraft:jicamaseedItem",
            "harvestcraft:kohlrabiseedItem",
            "harvestcraft:quinoaseedItem",

            "Growthcraft|Apples:grc.appleSeeds",
            "Growthcraft|Apples:grc.appleSapling",
            "Growthcraft|Apples:grc.appleLeaves",
            "Growthcraft|Grapes:grc.grapeSeeds",
            "Growthcraft|Grapes:grc.grapes",
            "Growthcraft|Hops:grc.hopSeeds",
            "Growthcraft|Hops:grc.hops",
            "Growthcraft|Milk:grcmilk.SeedThistle",
            "Growthcraft|Milk:grcmilk.Thistle",
            "Growthcraft|Rice:grc.rice",
            "witchery:seedsartichoke",
            "witchery:seedsbelladonna",
            "Natura:NetherBerryBush",
            "etfuturum:beetroot_seeds",
            "ganyssurface:beetrootSeeds",
            "simplecorn:kernels",
        };

        public String [] winter_crops = new String[]
        {
            "minecraft:sapling",
            "minecraft:nether_wart",
            "minecraft:red_mushroom",
            "minecraft:brown_mushroom",
            "witchery:seedssnowbell",
            "Natura:NetherBerryBush",
        };
	}
}
