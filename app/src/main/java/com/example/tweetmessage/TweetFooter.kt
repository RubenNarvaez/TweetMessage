package com.example.tweetmessage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun TweetFooter() {
    Row(Modifier.fillMaxWidth().padding(24.dp), horizontalArrangement = Arrangement.Start) {
        MessageIcon()
        LikeIcon()
        RetweetIcon()
    }
}

@Composable
fun MessageIcon() {
    var messageState by remember { mutableStateOf(true) }
    Button(
        onClick = { messageState = !messageState },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF171D27),
        ),
    ) {
        val iconResource: Int
        val text: String
        if (messageState) {
            iconResource = R.drawable.ic_chat
            text = "1"
        } else {
            iconResource = R.drawable.ic_chat_filled
            text = "2"
        }
        Icon(
            painter = painterResource(id = iconResource),
            contentDescription = "Description",
            tint = Color.LightGray,
        )
        Text(text = text, color = Color.LightGray)
    }
}


@Composable
fun LikeIcon() {
    var likeState by remember { mutableStateOf(true) }
    Button(
        onClick = { likeState = !likeState },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF171D27),
        ),
    ) {
        val iconResource: Int
        val text: String
        val iconColor: Color
        if (likeState) {
            iconResource = R.drawable.ic_like
            text = "1"
            iconColor = Color.LightGray
        } else {
            iconResource = R.drawable.ic_like_filled
            text = "2"
            iconColor = Color.Red
        }
        Icon(
            painter = painterResource(id = iconResource),
            contentDescription = "Description",
            tint = iconColor,
        )
        Text(text = text, color = Color.LightGray)
    }
}


@Composable
fun RetweetIcon() {
    var retweetState by remember { mutableStateOf(true) }
    Button(
        onClick = { retweetState = !retweetState },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF171D27),
        ),
    ) {
        val iconResource: Int
        val text: String
        val iconColor: Color
        if (retweetState) {
            iconResource = R.drawable.ic_rt
            text = "1"
            iconColor = Color.LightGray
        } else {
            iconResource = R.drawable.ic_rt
            text = "2"
            iconColor = Color.Green
        }
        Icon(
            painter = painterResource(id = iconResource),
            contentDescription = "Description",
            tint = iconColor,
        )
        Text(text = text, color = Color.LightGray)
    }
}
