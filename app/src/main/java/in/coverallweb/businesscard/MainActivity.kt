package `in`.coverallweb.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import `in`.coverallweb.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    BusinessCard("Android")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    Box {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Image",
                modifier = modifier
                    .width(100.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
            Text(
                text = "Cover All",
                fontSize = 30.sp,
                fontWeight = FontWeight(700),
                modifier = modifier.padding(top = 10.dp)
            )

            Text(
                text = "Web and App Solutions",
                modifier = modifier.padding(top = 4.dp)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier
                .fillMaxSize()
                .padding(30.dp)
        ) {
            Column {
                Row(
                    modifier = modifier.padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_email),
                        contentDescription = null
                    )
                    Text(
                        text = "connect@coverallweb.in",
                        modifier=modifier.padding(start=10.dp)
                    )
                }
                Row(
                    modifier = modifier.padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_phone),
                        contentDescription = null
                    )
                    Text(
                        text = "+91 XXXXX XXXXX",
                        modifier=modifier.padding(start=10.dp)
                    )
                }
                Row(
                    modifier = modifier.padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null
                    )
                    Text(
                        text = "@coverallweb.in",
                        modifier=modifier.padding(start=10.dp)
                    )
                }
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard("Android")
    }
}