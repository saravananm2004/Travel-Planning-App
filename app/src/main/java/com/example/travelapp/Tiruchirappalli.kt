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

class Tiruchirappalli : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5()
                }
            }
        }
    }
}

@Composable
fun Greeting5() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_6),
        )
        Image(
            painterResource(id = R.drawable.tiruchirappalli), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color = Color.Black,
            text = "Day 1: Arrival and Exploration\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Check-in to hotel (₹1,200 - ₹2,000 per night),Visit Rock Fort Temple (₹50 - ₹100 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore Tiruchirappalli Museum (₹50 - ₹100 per person),Walk around Srirangam Temple (free entry).\n" +
                    "\n" +
                    "Day 2: Local Sightseeing\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Jambukeswarar Temple (₹50 - ₹100 per person),Explore Uraiyur Temple (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Puliyancholai Waterfalls (free entry),Relax at hotel.\n" +
                    "\n" +
                    "Day 3: Thanjavur Day Trip\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Travel to Thanjavur (₹500 - ₹1,000),Visit Brihadeeswara Temple (₹50 - ₹100 per person).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Explore Thanjavur Palace (₹50 - ₹100 per person),Return to Tiruchirappalli.\n" +

                    "\n" +

                    "Day 4: Religious Sites\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Srirangam Ranganathaswamy Temple (free entry),Explore Tiruvanaikaval Temple (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Vayalur Murugan Temple (free entry),Relax at hotel.\n" +
                    "\n" +
                    "Day 5: Nature and Scenic Views\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Visit Kallanai Dam (free entry),Explore Mukkombu Dam (free entry).\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Visit Grand Anicut (free entry),Enjoy boat ride (₹200 - ₹500 per person).\n" +
                    "\n" +
                    "Day 6: Shopping and Leisure\n\n" +

                    "Morning (9:00 AM - 12:00 PM): Shop for local handicrafts,Explore Tiruchirappalli Market.\n\n" +
                    "Afternoon (1:00 PM - 5:00 PM): Relax at hotel or explore nearby areas,Enjoy local cuisine.\n" +
                    "\n" +
                    "Day 7: Departure\n\n" +

                    "Morning: Check-out from hotel.\n\n"+
                    "Afternoon: Depart from Tiruchirappalli."
        )
    }
}

