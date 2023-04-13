package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}
@Preview
@Composable
fun PlaceOne() {
    Column(modifier = Modifier
        .background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.bali), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Relaxation\n" )
        CustomText(text ="Day 1:" )
//
//                    "Arrive in Bali and check into your hotel or accommodation.\n" +
//                    "Spend the day relaxing and getting acclimated to the island.\n" +
//                    "If you have time, explore the nearby area or head to the beach.\n" +
//                    "\n" +
//
//                    "Day 2: Ubud Tour\n" +
//
//                    "Start your day early and head to Ubud, a cultural and artistic hub in Bali.\n" +
//                    "Visit the Monkey Forest and the Ubud Palace.\n" +
//                    "Take a tour of the Tegalalang Rice Terrace, a beautiful UNESCO World Heritage Site.\n" +
//                    "End your day with a traditional Balinese dance performance.\n" +
//                    "\n" +
//                    "Day 3: Temple Hopping\n" +
//
//                    "Visit some of Bali's most famous temples, such as Tanah Lot and Uluwatu.\n" +
//                    "Take in the stunning views of the ocean and cliffs.\n" +
//                    "Enjoy a sunset dinner at one of the many restaurants near the temples.\n" +
//                    "\n" +
//                    "Day 4: Waterfalls and Beaches\n" +
//
//                    "Take a day trip to Bali's beautiful waterfalls, such as Tegenungan or Gitgit.\n" +
//                    "Spend the afternoon at one of Bali's world-renowned beaches, like Seminyak or Nusa Dua.\n" +
//                    "\n" +
//                    "Day 5: Island Hopping\n" +
//
//                    "Take a day trip to one of Bali's neighboring islands, such as Nusa Lembongan or Gili Islands.\n" +
//                    "Snorkel or scuba dive in the clear waters and relax on the beach.\n" +
//                    "\n" +
//                    "Day 6: Cultural Activities\n" +
//                    "Visit a traditional Balinese village and learn about the island.\n" +
//            "\n" +
//                    "Day 7: Departure\n" +
//                    "Explore the surrounding area and take in the stunning sunset views.\n" +
//                    "Have dinner at a local restaurant before returning to your accommodation."



    }
}

