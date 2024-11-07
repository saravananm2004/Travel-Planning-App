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

class Chennai : ComponentActivity() {
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

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
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
            painterResource(id = R.drawable.chennai), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrival and Exploration\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Kapaleeswarar Temple (free entry),Explore Mylapore neighborhood.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Lunch at a local restaurant (₹500 - ₹1,000),Visit Fort St. George (₹50 - ₹100 per person),Walk along Marina Beach.\n" +
                    "\n" +

                    "Day 2: Cultural Experiences\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Chennai Museum (₹50 - ₹100 per person),Explore the National Art Gallery.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Attend a classical music/dance performance (₹200 - ₹500 per person),Visit the Theosophical Society.\n" +
                    "\n" +


                    "Day 3: Mahabalipuram Day Trip\n\n" +

                    "Morning (8:00 AM - 12:00 PM): Travel to Mahabalipuram (₹500 - ₹1,000),Visit the Shore Temple and Five Rathas.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore the Mahabalipuram Beach,Return to Chennai.\n" +

                    "\n" +
                    "Day 4: Shopping and Relaxation\n\n"+
                    "Morning (9:00 AM - 12:00 PM): Visit T. Nagar shopping market,Buy traditional silk sarees or handicrafts.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Relax at Elliot's Beach,Enjoy street food and local snacks.\n" +
                    "\n" +
                    "Day 5:Wildlife and Nature\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Guindy National Park (₹50 - ₹100 per person),Explore the Chennai Snake Park.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit the Arignar Anna Zoological Park (₹50 - ₹100 per person).\n" +
                    "\n" +
                    "Day 6: Heritage Walk\n\n" +
                    "Morning (9:00 AM - 12:00 PM): Take a guided heritage walk in George Town,Explore the historic buildings and landmarks.\n\n" +
                            "Afternoon (1:00 PM - 5:00 PM): Visit the Chennai Rail Museum\n"+
            "\n" +
                    "Day 7: Departure\n\n" +
                    "Morning: Check-out from hotel\n\n" +
                    "Afternoon: Depart from Chennai"
        )


    }
}

