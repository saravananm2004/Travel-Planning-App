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

class Coimbatore : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4()
                }
            }
        }
    }
}

@Composable
fun Greeting4() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_5),
        )
        Image(
            painterResource(id = R.drawable.coimbatore), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1: Arrival and Exploration\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Check-in to hotel (₹1,200 - ₹2,000 per night),Visit Perur Pateeswarar Temple (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore Coimbatore Museum (₹50 - ₹100 per person),Walk around VOC Park (free entry).\n" +
                    "\n" +
                    "Day 2: Nature and Scenic Views\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Marudamalai Temple (free entry),Explore Botanical Garden (₹10 - ₹20 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Parambikulam Wildlife Sanctuary (₹200 - ₹500 per person),Relax at hotel.\n" +
                    "\n" +
                    "Day 3: Local Sightseeing\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Gedee Car Museum (₹50 - ₹100 per person),Explore Coimbatore Arts and Crafts Museum (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Kovai Kondattam Amusement Park (₹500 - ₹1,000 per person),Shop for local handicrafts.\n" +

                    "\n" +
                    "Day 4: Ooty Day Trip\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Travel to Ooty (₹1,000 - ₹2,000),Visit Ooty Lake (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore Botanical Garden (₹10 - ₹20 per person),Return to Coimbatore.\n" +
                    "\n" +
                    "Day 5: Pollachi Day Trip\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Travel to Pollachi (₹500 - ₹1,000),Visit Pollachi Ayyappan Temple (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore Anamalai Wildlife Sanctuary (₹200 - ₹500 per person),Return to Coimbatore.\n" +
                    "\n" +
                    "Day 6: Relaxation and Leisure\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Relax at hotel or explore nearby areas.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Coimbatore Golf Course (₹500 - ₹1,000 per person),Enjoy local cuisine.\n" +
                    "\n" +
                    "Day 7: Departure\n\n" +

                    "Morning: Check-out from hotel.\n\n"+
                    "Afternoon: Depart from Coimbatore."
        )
    }
}

