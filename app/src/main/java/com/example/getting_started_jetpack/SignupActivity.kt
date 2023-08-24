package com.example.getting_started_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

          }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable




fun signup(){
    val  firstname by remember{
        mutableStateOf("")
    }
    val lastnamne by remember {
        mutableStateOf("")
    }
    val phonenumber by remember {
        mutableStateOf("")
    }
    val email by remember {
        mutableStateOf("")
    }
    val password by remember{
        mutableStateOf("")
    }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ,
        modifier = Modifier
            .background(color = Color.Cyan)
            .fillMaxSize()
            ){

        Text(text = "CREATE AN ACCOUNT", color = Color.Black, fontSize = 30.sp)

        OutlinedTextField(
            value = firstname,
            leadingIcon = { Icon  (Icons.Default.Person,contentDescription = "Username" ) },
            onValueChange = { firstname },
            label = { Text(text = "Enter First Name") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = lastnamne,
            leadingIcon = { Icon  (Icons.Default.Person,contentDescription = "Username" ) },
            onValueChange = {lastnamne},
            label = { Text(text = "Enter Last Name") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = phonenumber,
            leadingIcon = { Icon  (Icons.Default.Phone,contentDescription = "Username" ) },
            onValueChange = {phonenumber },
            label = { Text(text = "Enter Phone Number") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            leadingIcon = { Icon  (Icons.Default.Email,contentDescription = "Username" ) },
            onValueChange = { email },
            label = { Text(text = "Enter Email") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password },
            leadingIcon = { Icon  (Icons.Default.Lock,contentDescription = "Username" ) },
            label = { Text(text = "Enter password") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ },

            modifier = Modifier.fillMaxWidth()
        ) {

                Text(text = "SIGNUP", fontSize = 20.sp)
        }
    }
}


