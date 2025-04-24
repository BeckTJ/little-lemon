package com.lcaccess.littlelemon

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lcaccess.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LittleLemonTheme {
                var context = applicationContext
                val sharedPreferences by lazy { getSharedPreferences("UserPref", Context.MODE_PRIVATE)}
                AppNav(sharedPreferences,context)
            }
        }
    }
}
