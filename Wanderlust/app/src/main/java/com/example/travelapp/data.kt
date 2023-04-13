package com.example.travelapp

var abc = listOf<Detail>(
    Detail(
        R.drawable.bali,
        "Kodaikanal ",
        "Berijam Lake",
        " The most pristine of the three lakes in Kodai. This is a plastic free zone and it is beautiful and serene. The lake lies within a reserved forest region. You need to get permission to visit this lake. Permissions need to be obtained on the morning of the intended day of visit from the forest office. Usually the person who arranges the vehicle will arrange the permit. Moreover, in peak season, a limited number of vehicles are allowed in per day. Since this lake is used for providing drinking water no water sports activity is permitted. The route to Berijam lake is more scenic than the lake itself.",
        "Chettiar Park",
        "A beautiful park with many coloured flowers and greenery. An area of reclining back at peace with nature. It is a pretty place for clicking pictures; and also have swings for kids.",
        "Coakers Walk",
        "If you wish to catch the scenic valleys, the best time to visit the place would be before 2PM. But if you want to watch snow-like clouds (only in winter) beneath you form an ocean, reach the place between 3PM and 6PM. Try and catch the sunrise here or in the nearby Greenlands Hostel. A marvel. Also try out the telescope for Rs.5 near the main gate. This place is very near to the bus stand.",
        "Echo Point",
        " If you are on a trek for Dolphin's nose and still walk further, you finally reach the Echo Point where at the very edge if you scream facing the rising mountains on your right, your voice will echo. Of course, it doesn't echo just the way it shows in movies but its still a wonderful experience.",
        "Kodai Lake",
        "If you are going in winter, go boating in the evening, as it's an amazing experience to boat through fog settling on the lake. The lake is very near the bus stand. This is a star shaped lake and walking around it during the night is one of the best walking experience you can have in your life. Be cautious that there are lot of dogs around this lake and some places are extremely dark. Walk between 6 and 7 pm, then head back to your room. There is also option to hire bicycles, tandem bikes, horseriding all around the lake."
    ),
    Detail(
        R.drawable.bali,
        "Goa",
        "Arambol Beach",
        "A quiet and virgin beach in North Goa.The nature has gifted it a lot of beauty.There are many water sports available like paragliding,parasailing,many massage options,a very big beach market.",
        "Anjuna Beach",
        "Close to the Chapora Fort, its key attraction is a magnificent Albuquerque Mansion built in 1920, flanked by octagonal towers and an attractive Mangalore tile-roof. Anjuna was the second home (and main location) of the hippies in Goa in the 1960s and 1970s, after other destinations like Calangute got too \"crowded\" for them. It is still the venue of a (vastly-changed and more mainstream) flea market held each Wednesday. In the nearby village of Arpora, two colourful Saturday night bazaars are held in the non-monsoon seasons. This is still part of \"alternative\" Goa, though charter and other tourists also visit in increasing numbers to \"get a feel of the hippy years\".",
        "Palolem Beach",
        "A scenic beach in extreme south Goa with scenic rocks and islands off its shores. Good eating options. It is becoming pricey (by local standards) and getting a bit crowded, but still less crowded compared to other popular beaches.",
        "Bom Jesus Basilica (1605) ",
        "Built in 1605, this Basilica has the mortal remains of St. Francis Xavier, one of the patron Saints of Goa. It is known for its distinctive baroque architecture that has a display of architectural pieces in wood, stone, gold and granite. Francis Xavier died while aboard a ship and his body was taken to Malacca but it was decided that he should be buried in Goa. After 2 years, it was noticed that his body had not decomposed, that was no less than a miracle. After every 10 years, his body is put for public display in a silver casket designed in the 17th century.",
        "Shree Manguesh Shantadurgai Prasanna Temple",
        "The temple is dedicated to the deity of Lord Shiva. Shree Manguesh temple is located at Mangeshi in Priol, Ponda Taluka,1 kilometer from Mardol close to Nagueshi, 22 km from Panaji the capital of Goa and 26 km from Margao. Sri Mangesh temple is famous for its pristine glory, which attracts thousands of visitors every year.In Maha Shivratri Festival here you can see a very big fair.In 1560, anticipating the onslaught of the Portuguese, the devotees had moved Shree Manguesh Shantadurgai Prasanna Shivalinga from Kutthal to a safer place under a Hindu prince. Surrounded by hillocks and covered by forests, the Shivalinga was kept at a place, which now is known as Mangeshi.",
    ),Detail(
        R.drawable.bali,
        "Agra",
        "Taj Mahal",
        "The Taj Mahal is an immense mausoleum of white marble, built between 1631 and 1648 by order of the Mughal emperor Shah Jahan in memory of his favourite consort. Taj Mahal means Crown Palace. One of his wife's names was Mumtaz Mahal, Ornament of the Palace. The Taj is one of the most well preserved and architecturally beautiful tombs in the world, one of the masterpieces of Indian Muslim architecture, and one of the great sites of the world's heritage.",
        "Agra Fort",
        "The fort is similar in layout to the Red Fort in Delhi, but considerably better preserved, as much of Delhi Fort was razed by the British after the Mutiny. As much as palace as a defensive structure, it is also constructed mainly from red sandstone.",
        "Soami Bagh",
        "The white marble samadhi of the Radha Soami religion is currently under construction. It was started in 1904 and is not expected to be completed until sometime next century. You can see pietra dura inlaid marble work actually being worked on. Soami Bagh is 2km north of Agra and can be reached by bus or cycle.",
        "Mankameshwar Temple",
        "(At Rawatpara, near Agra Fort railway station. Near the raja ki mandi; a simple cycle rikshaw can take you there for a fare of 20/-.). Listen to the aarti, it purifies your soul. It is the MOST VISITED temple by LOCALS.....and during festive seasons its so crowded disrupting the traffic in the nerby areas",
        "Sikandra",
        "(10 km north of Agra on the Agra Delhi highway). Open from sunrise to sunset. The tomb of Akbar lies here in the centre of the large garden. Akbar started its construction himself but it was completed by his son Jehangir, who significantly modified the original plans which accounts for the somewhat cluttered architectural lines of the tomb. Four red sandstone gates lead to the tomb complex: one is Muslim, one Hindu, one Christian, and one is Akbar's patent mixture.",
    ),Detail(
        R.drawable.bali,
        "Paris",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
    ),Detail(
        R.drawable.bali,
        " ",
        " ",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
    ),
)
var selected = abc[0]

data class Detail(
    val image: Int,
    val place: String,
    val head1: String,
    val desc1: String,
    val head2: String,
    val desc2: String,
    val head3: String,
    val desc3: String,
    val head4: String,
    val desc4: String,
    val head5: String,
    val desc5: String
) {


}