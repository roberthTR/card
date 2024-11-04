package com.rvs.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface (color = Color.Green) {
            }
        }
    }
}
@Composable
fun item2(fullname:String,title:String, modifier: Modifier=Modifier){
    Column (verticalArrangement =  Arrangement.Center,
        modifier = modifier)  {
        Text(
            text = fullname,
            fontSize = 40.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = title,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun contact(number: String, network:String, email:String , modifier: Modifier=Modifier){

    Column(verticalArrangement =  Arrangement.Center,
        modifier = modifier) {
        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)){
                Icon(Icons.Rounded.Phone,
                    tint = Color.Blue,
                    contentDescription = null
                    )
                Text(
                    text = number,
                    textAlign = TextAlign.Center
                )
        }
        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)) {
            Icon(Icons.Rounded.Share, tint = Color.Blue, contentDescription = null)
            Text(
                text = network,
                )
        }
        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)){
            Icon(Icons.Rounded.Email, tint = Color.Blue, contentDescription = null )
            Text(
                text = email,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun item1(fullname:String,title:String,number: String, network:String, email:String , modifier: Modifier=Modifier){
    val image = painterResource(R.drawable.ypi1)
    Column{
        Spacer(modifier = Modifier.padding(20.dp))
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(200.dp)
                .width(140.dp)
                .align(Alignment.CenterHorizontally)
        )
        item2(fullname = fullname,
            title = title,
            modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally))

        contact(number = number, network = network , email = email,
                modifier = Modifier
                    .padding(70.dp)
                    .align(alignment = Alignment.CenterHorizontally)
        )


    }

}


@Preview(showBackground = true)
@Composable
fun cardPreview(){
    item1(fullname = "Roberth Torres", title = "Android Developer Senior", number = "982212762", network = "@roberthTR", email = "roberthtr81@gmail.com" )
}