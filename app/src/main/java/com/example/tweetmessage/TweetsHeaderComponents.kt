package com.example.tweetmessage

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TweetHeader() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        UserName()
        ProfileName()
        TweetTime()
        //Spacer(modifier = Modifier.size(100.dp)) //Lazy Solution XD
        OptionsTweetIcon()
    }
}

@Composable
fun UserName() {
    Text(
        text = "Pato",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = Color.White,
        modifier = Modifier.padding(horizontal = 4.dp)
    )
}

@Composable
fun ProfileName() {
    Text(
        text = "@prixxirp",
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        color = Color.LightGray,
        modifier = Modifier.padding(horizontal = 4.dp)
    )
}

@Composable
fun TweetTime() {
    Text(
        text = "4h",
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        color = Color.LightGray,
        modifier = Modifier.padding(horizontal = 4.dp)
    )
}

@Composable
fun OptionsTweetIcon() {
    val activity = LocalContext.current as Activity
    Icon(painter = painterResource(id = R.drawable.ic_dots),
        contentDescription = "Options",
        tint = Color.White,
        modifier = Modifier
            .clickable { activity.finish() }
    )
}




