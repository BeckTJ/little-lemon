package com.lcaccess.littlelemon

import android.content.SharedPreferences
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Profile(navController: NavController, sharedPreferences: SharedPreferences) {
    var firstName = sharedPreferences.getString("FirstName", "").toString()
    var lastName = sharedPreferences.getString("LastName", "").toString()
    var userEmail = sharedPreferences.getString("UserEmail", "").toString()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column() {
            Image(
                painter = (painterResource(R.drawable.logo)),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp)
                    .size(40.dp)
            )
            Column(modifier = Modifier.padding(top = 75.dp, bottom = 50.dp)) {
                Text(
                    text = "Profile Information",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 45.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Column(modifier = Modifier.padding(bottom = 150.dp)) {
                    Column(modifier = Modifier.padding(25.dp)) {
                        Text("First Name")
                        Text(
                            text = firstName,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .border(1.dp, color = Color.Black)
                                .size(width = 500.dp, height = 50.dp)
                                .padding(15.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(25.dp)) {
                        Text("Last Name")
                        Text(
                            text = lastName,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .border(1.dp, color = Color.Black)
                                .size(width = 500.dp, height = 50.dp)
                                .padding(15.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(25.dp)) {
                        Text("Email Address")
                        Text(
                            text = userEmail,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .border(1.dp, color = Color.Black)
                                .size(width = 500.dp, height = 50.dp)
                                .padding(15.dp)
                        )
                    }
                }
                Button(
                    modifier = Modifier.padding(horizontal = 100.dp, vertical = 50.dp),
                    onClick = { navController.navigate("Onboarding") }) {
                    Text("Log Out")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileView() {

}