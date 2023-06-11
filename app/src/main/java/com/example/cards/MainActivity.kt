package com.example.cards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cards.ui.theme.CardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageAndText()
                }
            }
        }
    }
}

@Composable
fun ImageAndText() {
    Box(modifier = Modifier.background(Color.White))
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ){
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.size(96.dp)
        )
        Text(
            text = "Jensen Doe",
            fontSize = 52.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.padding(bottom = 2.dp))
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84)
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        PersonalInfo()

    }
}

@Composable
fun PersonalInfo() {
    Column(
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {

            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Text(text = "+11 (123) 444 555 666")
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Text(text = "@AndroidDev")
        }
        Row {
            Icon(
                Icons.Rounded.MailOutline,
                contentDescription = null,
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            Text(text = "jenDoe@gamil.com")
        }
        Spacer(modifier = Modifier.padding(vertical = 6.dp))

    }
}

//@Composable
//fun Layout() {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        ImageAndText()
//        Spacer(modifier = Modifier.padding(12.dp))
//        PersonalInfo()
//
//    }
//
//}