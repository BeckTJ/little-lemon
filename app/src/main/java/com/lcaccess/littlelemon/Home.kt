package com.lcaccess.littlelemon

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(25.dp), horizontalAlignment = Alignment.End) {
            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = "profile",
                modifier = Modifier.clickable { navController.navigate("Profile") }
                    .height(75.dp))
        }
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "logo"
        )
    }
}