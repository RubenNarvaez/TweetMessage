package com.example.tweetmessage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF171D27))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ProfileImage()
            Tweet()
            Divider(Modifier.background(Color.White).height(2.dp))

        }
    }
}

@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(
            id = R.drawable.profile
        ),
        contentDescription = "Profile Image",
        modifier = Modifier
            .clip(CircleShape)
            .size(64.dp)
    )
}

@Composable
fun Tweet() {
    Column {
        TweetHeader()
        TweetMessage()
        TweetImage()
        TweetFooter()

    }
}
