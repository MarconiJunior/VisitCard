package com.example.visitcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visitcard.ui.theme.VisitCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    VisitGreeting("Marconi Junior", "Mobile Developer in Learning")
                }
            }
        }
    }
}



@Composable
fun VisitGreeting(fullName: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val imageSize = 100.dp
    val imagePadding = 220.dp

    Surface(color = Color(0xFF073042)) {

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .padding(top = imagePadding)
                    .height(imageSize)
                    .width(imageSize)

            )

            Text(
                text = fullName,
                fontSize = 35.sp,
                modifier = Modifier
                    .padding(top = 16.dp),
                color = Color(255,255,255)
            )

            Text(
                text = title,
                fontSize = 18.sp,
                color = Color(0xFF3ddc84),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(bottom = 145.dp)
            )
            VisitGreetingInformations("(31) 9 9939-7039", "@marconi_2004", "junior@brumafe.com")
        }

    }
}


@Composable
fun VisitGreetingInformations(phone: String, socialMedia: String, email: String, modifier: Modifier = Modifier) {
    val dividerColor = Color(255,255,255)

    Divider(
        color = dividerColor,
        thickness = 1.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
    )
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Spacer(modifier = Modifier.width(60.dp))
        Icon(
            Icons.Default.Phone,
            contentDescription = "Phone Icon",
            tint = Color(0xFF3ddc84),
            modifier = Modifier
                .size(24.dp)
        )
        Spacer(modifier = Modifier.width(25.dp))
        Text(
            text = phone,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(1f),
            color = Color(255,255,255)
        )
    }
    Divider(
        color = dividerColor,
        thickness = 1.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
    )

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Spacer(modifier = Modifier.width(60.dp))
        Icon(
            Icons.Default.Share,
            contentDescription = "Social Media Icon",
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(25.dp))
        Text(
            text = socialMedia,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(1f),
            color = Color(255,255,255)
        )
    }
    Divider(
        color = dividerColor,
        thickness = 1.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
    )

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Spacer(modifier = Modifier.width(60.dp))
        Icon(
            Icons.Default.Email,
            contentDescription = "Email Icon",
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(25.dp))
        Text(
            text = email,
            fontSize = 18.sp,
            modifier = Modifier
                .weight(1f),
            color = Color(255,255,255)
        )
    }
}



@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    VisitCardTheme {
        VisitGreeting("Marconi Junior", "Mobile Developer in Learning")
    }
}