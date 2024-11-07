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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class Kodaikanal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_2),
        )
        Image(
            painterResource(id = R.drawable.kodaikanal), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Exploration\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Check-in to hotel (₹1,500 - ₹2,500 per night),Visit Kodaikanal Lake (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Boat ride on Kodaikanal Lake (₹100 - ₹200 per person),,Walk around Bryant Park (free entry).\n" +


                    "\n" +
                    "Day 2: Nature and Scenic Views\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Pillar Rocks (₹10 - ₹20 per person),Explore Devil's Kitchen.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Guna Caves (₹10 - ₹20 per person),Enjoy valley views at Moir Point.\n" +


                    "\n" +
                    "Day 3: Waterfalls and Trekking\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Silver Cascade Falls (free entry),Trek to Dolphin's Nose.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Bear Shola Falls (free entry),Relax at hotel.\n" +


                    "\n" +

                    "Day 4: Local Sightseeing\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Kodaikanal Solar Observatory (₹10 - ₹20 per person),Explore Kurinji Andavar Temple.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Coaker's Walk (free entry),Shop for local handicrafts.\n" +


                    "\n" +
                    "Day 5: Relaxation and Leisure\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Relax at hotel or explore nearby areas.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Kodaikanal Golf Course (₹500 - ₹1,000 per person),Enjoy horse riding (₹500 - ₹1,000 per person).\n" +

                    "\n" +
                    "Day 6: Trekking and Picnic\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Trek to Perumal Peak.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Picnic at Perumal Peak,Return to hotel.\n" +

                    "\n" +
                    "Day 7: Departure\n\n" +

                    "Morning: Check-out from hotel.\n\n" +
                    "Afternoon: Depart from Kodaikanal."
        )
    }
}

