package com.example.birthdaygreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaygreeting.ui.theme.BirthdayGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayGreetingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Happy Birthday Sam",
                        from = "Wilson"
                    )

                }
            }
        }
    }
}

@Composable
//its used to create user interface
fun GreetingText(message: String, from: String) {
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,
        modifier = Modifier.padding(8.dp)
    )
    Text(
        text = from,
        fontSize = 32.sp,
        modifier = Modifier.padding(8.dp)
    )
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.happy_birthday)

    Image(
        painter = image,
        contentDescription = "My Birthday",
        contentScale = ContentScale.Crop,
        alpha = 0.5F,
        modifier = Modifier.padding(8.dp)
    )

    GreetingText(
        message = message,
        from= from
    )


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BirthdayGreetingTheme {
        // GreetingText("Happy Birthday Frank", "Wilson")
        GreetingImage(
            message = "Happy Birthday",
            from = "Wilson"

        )

    }
}