package com.example.tweetmessage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TweetMessage() {
    Text(
        text = "In this photo we can see myself with my wife, I love her a lot, she is wonderful and I love her so much, thanks to everybody for reading this tweet, take care and be happy my friend",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        color = Color.White,
        modifier = Modifier.padding(horizontal = 20.dp)
    )
}

@Composable
fun TweetImage() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Photo of the tweet",
        modifier = Modifier
            .padding(20.dp)
            .clip(RoundedCornerShape(32.dp))
    )
}