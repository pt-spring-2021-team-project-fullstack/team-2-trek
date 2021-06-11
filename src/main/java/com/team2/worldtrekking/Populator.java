package com.team2.worldtrekking;

import com.team2.worldtrekking.models.Continent;
import com.team2.worldtrekking.models.Region;
import com.team2.worldtrekking.models.Trek;
import com.team2.worldtrekking.repositories.ContinentRepository;
import com.team2.worldtrekking.repositories.RegionRepository;
import com.team2.worldtrekking.repositories.TrekRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent Asia = new Continent(1L,"Asia","SouthEast","images/asia.jpg");
        Continent Africa = new Continent(2L,"Africa","MotherLand","images/africa.jpg");
        Continent Australia = new Continent(3L,"AussieLand","Eastern","images/aussie.jpg");
        Continent Europe = new Continent(4L,"Europe","East","images/europe.jpg");
        Continent NorthAmerica = new Continent(5L,"USA/Canada","West","images/northAmerica.jpg");
        Continent SouthAmerica = new Continent(6L,"SouthAmerica","SouthWest","images/southAmerica.jpg");

        continentRepo.save(SouthAmerica);
        continentRepo.save(Africa);
        continentRepo.save(Asia);
        continentRepo.save(Australia);
        continentRepo.save(Europe);
        continentRepo.save(NorthAmerica);

        Region MidWest = new Region(18L, "MidWest", NorthAmerica);
        Region Atlantic = new Region(7L, "Atlantic", NorthAmerica);
        Region Pacific = new Region(14L, "Pacific", NorthAmerica);
        Region Himalaya = new Region(1L, "Himalaya", Asia);
        Region Lapland = new Region(2L, "Lapland", Europe);
        Region FrenchSpeakingSwitzerland = new Region(3L, "French Speaking Region of Switzerland", Europe);
        Region EasternMali = new Region(4L, "Eastern Mali", Africa);
        Region Patagonia = new Region(5L, "Patagonia", SouthAmerica);
        Region Fiordland = new Region(6L, "Fiordland", Australia);
        Region Galicia = new Region(8L, "Galicia", Europe);
        Region CostaNorte = new Region(9L, "Costa Norte", SouthAmerica);
        Region SacredValley = new Region(10L, "Sacred Valley", SouthAmerica);
        Region Magallanes = new Region(11L, "Magallanes", SouthAmerica);
        Region Tibet = new Region(12L, "Tibet", Asia);
        Region Maghreb = new Region(13L, "Magrheb", Africa);
        Region NorthWest = new Region(15L, "NorthWest", Australia);
        Region WesternEurope = new Region(16L, "Western Europe", Europe);
        Region Highlands = new Region(17L, "Highlands", Europe);
        Region Guayana = new Region(18L, "Guayana", SouthAmerica);
        Region AfricaGreatLakes = new Region(18L, "Africa Great Lakes", Africa);
        Region GilgitBaltistan = new Region(19L, "Gilgit-Baltistan", Asia);
        Region Corsica = new Region(20L, "Corsica", Europe);

        regionRepo.save(Himalaya);
        regionRepo.save(Lapland);
        regionRepo.save(FrenchSpeakingSwitzerland);
        regionRepo.save(EasternMali);
        regionRepo.save(Patagonia);
        regionRepo.save(Fiordland);
        regionRepo.save(Atlantic);
        regionRepo.save(Galicia);
        regionRepo.save(CostaNorte);
        regionRepo.save(SacredValley);
        regionRepo.save(Magallanes);
        regionRepo.save(Tibet);
        regionRepo.save(Maghreb);
        regionRepo.save(Pacific);
        regionRepo.save(NorthWest);
        regionRepo.save(WesternEurope);
        regionRepo.save(Highlands);
        regionRepo.save(Guayana);
        regionRepo.save(AfricaGreatLakes);
        regionRepo.save(MidWest);
        regionRepo.save(GilgitBaltistan);
        regionRepo.save(Corsica);

        String description1 = "This ancient trade route has been open to foreign trekkers since 1977 and is one of the most beautiful hikes on the planet. The total length of the route varies between 100 and145 miles, and takes anywhere from 15 to 25 days to complete depending on your speed. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill. Leave your camping gear at home; there are cheap hotels all along the route.";
        String description2 = "The King's Trail (Kungsleden) in northern Sweden, is probably is one of the world’s most famous hiking trails. The trail is approximately 440 kilometers (270 miles) long, between Abisko in the north and Hemavan in the south and it passes through four national parks: Abisko, Stora Sjöfallet, Sarek and Pieljekaise.";
        String description3 = "Leading from Chamonix in France through the southern Valais to Zermatt in Switzerland, the Haute Route traverses some of the highest and most scenic country accessible to walkers anywhere in the Alps. The summer Haute Route walk (which takes a different course than the more famous winter ski-touring route) takes around two weeks to complete. It mainly involves \"pass hopping\" and demands a high level of fitness, with every section containing a high huff factor.";
        String description4 = "\"The land of the Dogon people\" is one of Africa's most breathtaking regions. A trek here can last anywhere between two and 10 days, and takes in the soaring cliffs of the Bandiagara escarpment inlaid with old abandoned cliff dwellings. Dogon villages dot the cliffs and are an extraordinary highlight of the journey. The Dogon are known for their masked stilt dancers, intricately carved doors and pueblo-like dwellings built into the side of the escarpment.";
        String description5 = "Discover icy, turquoise lakes with hidden swimming holes on one of the best hikes in the world. Travel past vast grasslands pummeled by the ruthless Patagonian winds. Then, soak in the panoramic views of the wilderness while hiking in the shadow of the legendary Fitz Roy. Tours in Patagonia feature everything from kayaking or horseback riding in the surroundings of Los Glaciares National Park to hiking in Torres Del Paine National Park to the south.";
        String description6 = "See the stunning subalpine scenery of New Zealand's South Island surrounding this medium three-day (32km) track. At the base of New Zealand's Southern Alps, the track passes through two national parks: Fiordland and Mt Aspiring. Highlights include the views from Harris Saddle and atop Conical Hill, from where you can see waves breaking on the distant beach. The main challenge for this popular hike is actually securing a place among the limited numbers who are allowed on the track at any time.";
        String description7 = "The Long Range Traverse is a demanding 35-kilometer trek in the remote Newfoundland backcountry of Gros Morne National Park. There are no marked or maintained trails on the hike, requiring trekkers to rely on advanced, confident map-and-compass navigation and other backcountry skills. The Long Range adventurer faces steep cliffs, dense \"tuckamore\" (alpine krummholz), swarming black flies, and roaming moose and caribou, but the intrepid souls who tackle this challenge are richly rewarded with a powerful sense of wildness and some of the most jaw-dropping landscapes to be found anywhere in the world. To preserve the wildness of the Long Range Traverse, permits are required and should be reserved well in advance by contacting Gros Morne National Park.";
        String description8 = "The Camino de Santiago, or the Way of Saint James, is an epic Catholic pilgrimage to the Spanish city of Santiago de Compostela. Although the Camino is actually a network of trails, its most popular route, the Camino Francés, spans from the city of Saint-Jean-Pied-de-Port at the base of the French Pyrenees to Santiago de Compostela in northwestern Spain.";
        String description9 = "The Lost City Trek in northern Colombia takes you 46km (28 miles) round trip through the jungles, hills and river valleys of the Sierra Nevada Mountains. Hidden in the Sierra Nevada National Park on Colombia’s north coast, the Lost City of Teyuna, known as the Ciudad Perdida, was off limits to visitors for years. But now, after Colombia’s dark period of paramilitary and drug-fuelled violence has come to an end, the pre-Colombian ruins are once more open and safe to visit. The indigenous inhabitants of the Sierra Nevada still hold these ruins sacred and carry out rituals there, but the site was not revealed to the outside world until tomb raiders stumbled across it in 1972. Today, it can only be reached on foot by a professionally led hike that takes four to six days to complete.";
        String description10 = "This 33km ancient trail was laid by the Incas and is currently traversed by thousands each year. The trail leads from the Sacred Valley to Machu Picchu winding its way up and down and around the mountains, taking three high passes en route. Views of white-tipped mountains and high cloud forest combine with the magic of walking from one cliff-hugging ruin to the next - understandably making this South America's most famous trail.";
        String description11 = "The W Trek is Torres del Paine's most famous hiking route, with views of the granite towers that give the park its name. In full, it's a four or five day hike that can be walked without carrying gear or food, between refugios or campsites. It can also be broken up into day hikes from comfortable hotel bases, or incorporated into longer, wilder treks.";
        String description12 = "Mount Kailash trekking tour is one of the most demanding and challenging treks in the world. This trek route in Tibet is widely known as the kora around the Mt.Kailash (6638m) which is sacred to four religions and a deeply numinous place. The average altitude of this trekking is nearly 5,000m, so it is a very great challenge and requires strong perseverance. It is a true test of the mind and spirit.";
        String description13 = "The Toubkal Circuit is one of Africa’s finest multi-day treks. Situated in Morocco’s Atlas mountains, it takes hikers on a 60 km (37.3 mi) loop around Jebel Toubkal, which at 4167 m (13,671 ft) is the highest peak in the Arab world. Along the way it traverses oasis valleys, mountain passes and panoramic ridges. Walking the same trails that the native Berbers have trodden for millennia, hikers will experience a memorable fusion of natural and cultural elements, the latter coming in the form of ancient villages and the legendary local hospitality.";
        String description14 = "The John Muir Trail passes through what many backpackers say is the finest mountain scenery in the United States. This is a land of 13,000-foot and 14,000-foot peaks, of lakes in the thousands, and of canyons and granite cliffs. The John Muir Trail is also a land blessed with the mildest, sunniest climate of any major mountain range in the world. The trail is 211 miles long and runs (mostly in conjunction with the PCT) from Yosemite Valley to Mount Whitney, in California. Winding through the famed Sierra Nevada, the JMT visits some of the crown jewels of America’s park system: Yosemite, John Muir and Ansel Adams Wildernesses, Kings Canyon and Sequoia National Parks.";
        String description15 = "Tasmania's prehistoric-looking wilderness is most accessible on the 80km, five- to six-day Overland Track. Snaking its way between Cradle Mountain and Lake St Clair (Australia's deepest natural freshwater lake), the well-defined path (boardwalked in parts) passes craggy mountains, beautiful lakes, extensive forests and moorlands. Those who want more can take numerous side walks leading to waterfalls, valleys and still more summits including Mt Ossa (1,617m), Tassie's highest.";
        String description16 = "The Tour Du Mont Blanc (TMB) is one of the most famous long-distance treks in the world—and for good reason. Every year, thousands of people complete the 105-mile-long trek, which has an impressive accumulated elevation gain and loss of around 32,800 feet. The TMB circumnavigates Mont Blanc, a glaciated massif that commands attention whether you’re climbing on it, hiking around it or gazing at it from the streets of Chamonix. At 15,777 feet, Mont Blanc is the tallest peak in Western Europe and is ranked 11th in the world in topographic prominence. The whole Massif Du Mont Blanc extends for about 25 miles and has 11 summits. The TMB will give you spectacular views of them from every angle.";
        String description17 = "A recent National Geographic feature ranked Iceland’s Laugavegurinn/ Fimmvörðuháls Pass, a 50-mile trail winding through Iceland’s southern highlands, among the world’s top 20 “dream trails” for its untouched wilderness and remarkable views. The pass stretches from Landmannalaugar to Thórsmörk and offers views of highland valleys, stunning glaciers, and the notorious Eyjafjallajökull volcano, which temporarily halted air travel between the United States and Iceland in 2010. Travellers who feel inspired by the surreal landscape aren’t alone; the region, and the valley of Thórsmörk in particular, are believed to have served as the inspiration behind J.R.R. Tolkien’s vision of Middle Earth.";
        String description18 = "The Roraima Trek is one of the highlights of Venezuela. Mount Roraima is the highest of the Pakaraima chain of tepui  plateaus in South America.  Its 31 km2 summit area is defended on all sides by tall cliffs rising 400 metres (1,300 ft). The mountain also serves as the triple border point of Venezuela,Brazil and Guyana, It lies in the southeastern corner of Venezuela's 30,000 square kilometres (12,000 sq mi) Canaima National Park. Bizarre rock formations, amazing landscapes and unique plants dominate the scenery. ";
        String description19 = "Africa’s tallest peak creates an instantly recognisable silhouette, rising all alone from the acacia forests and scrublands at the border of Kenya and Tanzania. At 5,896m, the world’s tallest freestanding mountain can certainly seem imposing but that doesn’t mean it’s out of reach. We offer a range of Kilimanjaro routes to suit every trekkers experience and fitness levels, getting you to the summit with the best team possible. While the climb will be difficult, it’s only when you’re sitting at the summit with the sprawling savanna far below that you realise the simple truth: it was all worth it. ";
        String description20 = "The Appalachian Trail is the longest hiking-only footpath in the world, ranging from Maine to Georgia. Use the interactive map below to explore the Trail, find shelters, locate parking and more. Completing the entire 2,190 miles of the Appalachian Trail (A.T.) in one trip is a mammoth undertaking. Each year, thousands of hikers attempt a thru-hike; only about one in four makes it all the way.";
        String description21 = "The Everest Base Camp trek is on many travellers’ bucket lists, and for good reason. The there-and-back route takes adventurous trekkers to the foot of Mount Everest (called Sagamartha in Nepali and Chomolungma in Tibetan), which is the highest mountain on earth. To actually reach the summit of Mount Everest is a legendary feat, which demands huge sacrifices. At 5,600 meters, Base Camp is no joke, but it does offer a much more achievable goal for people from all walks of life, who still want a glimpse of the world’s highest peak.";
        String description22 = "This corridor of ice leads to the colossal peak of K2 (8,611m), the world's second-highest peak. This incomparable trek traverses some of the most humbling scenery on the planet. What begins following icy rivers boldly goes to the guts of the glacier before leading to the granite pyramidal mountains including Paiju (6,610m), Uli Biaho (6,417m), Great Trango Tower (6,286m) and ultimately K2. If the 15 days does not floor you, take side trips to more moraine-covered glaciers.";
        String description23 = "Trekking this route is not for the faint of heart, or lungs. This high-altitude ball-buster crosses 11 passes over 14,000 feet along the Tibet-Bhutan border. Along the way you’ll visit magical Buddhist monasteries clinging to the sides of cliffs and pass through secluded villages full of windblown smiles. It takes about 24 days to complete, and the window of perfect weather is very small, mainly in October.";
        String description24 = "This demanding, 15-day (168km) slog through Corsica is legendary for the diversity of landscapes it traverses. There are forests, granite moonscapes, windswept craters, glacial lakes, torrents, peat bogs, snow-capped peaks, plains and névés (stretches of ice formed from snow). But it does not come easy: the path is rocky and sometimes steep, and includes rickety bridges and slippery rock faces - all part of the fun. Created in 1972, the GR20 links Calenzana, in the Balagne, with Conca, north of Porto Vecchio.";

        Trek trek1 = new Trek("Annapurna Circut", "Moderate", description1, "1000", "",true, Asia, "", Himalaya);
        Trek trek2 = new Trek("Kungsleden (The King's Trail)", "Moderate", description2, "2000", "",true, Europe, "", Lapland);
        Trek trek3 = new Trek("Haute Route", "Difficult", description3, "2400", "",true, Europe, "", FrenchSpeakingSwitzerland);
        Trek trek4 = new Trek("Pays Dogon", "Easy", description4, "1700", "",true, Africa, "", EasternMali);
        Trek trek5 = new Trek("Fitzroy Trek", "Easy", description5, "2300", "",true, SouthAmerica, "", Patagonia);
        Trek trek6 = new Trek("Routeburn Track", "Easy", description6, "1700", "",true, Australia, "", Fiordland);
        Trek trek7 = new Trek("Long Range Traverse", "Difficult", description7, "2600", "",true, NorthAmerica, "", Atlantic);
        Trek trek8 = new Trek("Camino de Santiago", "Easy", description8, "1500", "",true, Europe,"", Galicia);
        Trek trek9 = new Trek("Lost City of Teyuna", "Moderate", description9, "2100","",true, SouthAmerica, "", CostaNorte);
        Trek trek10 = new Trek( "Inca Trail", "Moderate", description10, "1900", "",true, SouthAmerica, "", SacredValley);
        Trek trek11 = new Trek( "Torres del Paine", "Moderate", description11, "2200", "",true, SouthAmerica, "", Magallanes);
        Trek trek12 = new Trek( "Mount Kailash", "Moderate", description12, "2900", "",true, Asia, "", Tibet);
        Trek trek13 = new Trek( "Toukbal Circut", "Moderate", description13, "2500", "",true, Africa, "", Maghreb);
        Trek trek14 = new Trek( "John Muir Trail", "Moderate", description14, "1400", "",true, NorthAmerica, "", Pacific);
        Trek trek15 = new Trek( "Overland Track", "Moderate", description15, "1700", "",true, Australia, "", NorthWest);
        Trek trek16 = new Trek( "Tour du Mont Blanc", "Moderate", description16, "1900", "",true, Europe, "", WesternEurope);
        Trek trek17 = new Trek( "Laugavegur", "Moderate", description17, "2100", "",true, Europe, "", Highlands);
        Trek trek18 = new Trek( "Mount Roraima", "Moderate", description18, "2200", "",true,SouthAmerica, "", Guayana);
        Trek trek19 = new Trek( "Kilimanjaro", "Strenuous", description19, "2300", "",true, Africa, "", AfricaGreatLakes);
        Trek trek20 = new Trek( "Appalachian Trail", "Strenuous", description20, "1800", "",true,NorthAmerica, "", MidWest);
        Trek trek21 = new Trek( "Everest Base Camp Trek", "Difficult", description21, "2500", "",true, Asia, "", Tibet);
        Trek trek22 = new Trek( "Baltoro Glacier and K2", "Difficult", description22, "2800", "",true, Asia, "", GilgitBaltistan);
        Trek trek23 = new Trek( "Snowman Trek", "Difficult", description23, "2400", "",true, Asia, "", Tibet);
        Trek trek24 = new Trek( "GR20", "Difficult", description24, "2300", "",true,Europe, "", Corsica);

        trekRepo.save(trek1);
        trekRepo.save(trek2);
        trekRepo.save(trek3);
        trekRepo.save(trek4);
        trekRepo.save(trek5);
        trekRepo.save(trek6);
        trekRepo.save(trek7);
        trekRepo.save(trek8);
        trekRepo.save(trek9);
        trekRepo.save(trek10);
        trekRepo.save(trek11);
        trekRepo.save(trek12);
        trekRepo.save(trek13);
        trekRepo.save(trek14);
        trekRepo.save(trek15);
        trekRepo.save(trek16);
        trekRepo.save(trek17);
        trekRepo.save(trek18);
        trekRepo.save(trek19);
        trekRepo.save(trek20);
        trekRepo.save(trek21);
        trekRepo.save(trek22);
        trekRepo.save(trek23);
        trekRepo.save(trek24);


    }
}