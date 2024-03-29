package com.example.getting_started_jetpack

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Logininterface()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable

fun Logininterface(){

    val username by remember {
        mutableStateOf("")
    }

    val password by remember{
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ,
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()


    ) {

        Text(text = "Welcome back Please Login", color = Color.Blue, fontSize = 15.sp)

        OutlinedTextField(
            value = username,
            leadingIcon = { Icon  (Icons.Default.Person,contentDescription = "Username" ) },
            onValueChange = { username },
            label = { Text(text = "Username") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = password,
            onValueChange = { password },
            leadingIcon = { Icon  (Icons.Default.Lock,contentDescription = "Username" ) },
            label = { Text(text = "password") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(17.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()

            ) {

            Text(text = "LOGIN")

        }

    }
}