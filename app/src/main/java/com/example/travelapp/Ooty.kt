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

class Ooty : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_3),
        )
        Image(
            painterResource(id = R.drawable.ooty), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1: Arrival and Exploration\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Check-in to hotel (₹1,500 - ₹2,500 per night),Visit Ooty Lake (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Boat ride on Ooty Lake (₹100 - ₹200 per person),Walk around Botanical Garden (₹10 - ₹20 per person).\n" +
                    "\n" +
                    "Day 2: Nature and Scenic Views\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Doddabetta Peak (₹10 - ₹20 per person),Explore Tea Museum (₹10 - ₹20 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Lamb's Rock (free entry),Enjoy valley views at Wenlock Downs.\n" +
                    "\n" +
                    "Day 3: Waterfalls and Trekking\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Pykara Falls (free entry),Trek to Pykara Lake.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Shooting Point (free entry),Relax at hotel.\n" +

                    "\n" +
                    "Day 4: Local Sightseeing\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Ooty Rose Garden (₹10 - ₹20 per person),Explore Thread Garden (₹10 - ₹20 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Government Museum (₹10 - ₹20 per person),Shop for local handicrafts.\n" +
                    "\n" +
                    "Day 5: Coonoor Day Trip\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Travel to Coonoor (₹500 - ₹1,000),Visit Sim's Park (₹10 - ₹20 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Dolphin's Nose,Return to Ooty.\n" +
                    "\n" +
                    "Day 6: Relaxation and Leisure\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Relax at hotel or explore nearby areas.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Ooty Golf Course (₹500 - ₹1,000 per person),Enjoy horse riding (₹500 - ₹1,000 per person).\n" +
                    "\n" +
                    "Day 7: Departure\n\n" +

                    "Morning: Check-out from hotel.\n\n "+
                    "Afternoon: Depart from Ooty."
        )
    }
}

