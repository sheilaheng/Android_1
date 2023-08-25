package com.example.getting_started_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_jetpack.ui.theme.Getting_started_jetpackTheme

class MpesalistviewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

private val mpesaList = mutableListOf("Send Money","Withdraw Cash","Buy Airtime","Loans and Savings","Lipa na M-pesa","My account")
private val listModifier = Modifier
    .fillMaxSize()
    .padding(1.dp)
    .background(Color.Black)

private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 30.sp, color = Color.White)


@Preview(showBackground = true)
@Composable

fun Mpesalist(){
    LazyColumn(modifier = listModifier){
        items(mpesaList) {
            mpesa ->
            Text(text = mpesa, style = textStyle)

        }

    }

}