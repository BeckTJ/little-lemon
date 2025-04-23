package com.lcaccess.littlelemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lcaccess.littlelemon.ui.theme.Primary1

@Composable
fun Onboarding(navController: NavController){
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var userEmail by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(
                painter = (painterResource(R.drawable.logo)),
                contentDescription = "logo",
                modifier = Modifier.fillMaxWidth()
                    .padding(25.dp)
                    .size(40.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.background(Primary1)
                    .fillMaxWidth()
                    .height(200.dp),) {
                Text(
                    text = "Let's get to know you",
                    color = Color.White,
                    fontSize = 32.sp,
                )
            }
            Column(modifier = Modifier.padding(50.dp)) {
                Text(text = "Personal Information", fontSize = 18.sp, fontWeight = FontWeight.Bold,)

                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    TextField(
                        modifier = Modifier.padding(5.dp)
                            .border(BorderStroke(1.dp, color = Color.Black)),
                        onValueChange = { firstName = it },
                        label = { Text("First Name") },
                        value = firstName
                    )
                    TextField(
                        modifier = Modifier.padding(5.dp)
                            .border(BorderStroke(1.dp, color = Color.Black)),
                        onValueChange = { lastName = it },
                        label = { Text("Last Name") },
                        value = lastName
                    )
                    TextField(
                        modifier = Modifier.padding(5.dp)
                            .border(BorderStroke(1.dp, color = Color.Black)),
                        onValueChange = { userEmail = it },
                        label = { Text("Email Address") },
                        value = userEmail,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                    Button(onClick = {navController.navigate(Home.route)}) {
                        Text(text = "Register")
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun OnboardingView(){

}
