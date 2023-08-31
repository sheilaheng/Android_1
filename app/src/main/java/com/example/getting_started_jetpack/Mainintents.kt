package com.example.getting_started_jetpack

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.PermissionChecker.checkSelfPermission
import com.example.getting_started_jetpack.ui.theme.Getting_started_jetpackTheme

class Mainintents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Myintets()

        }
    }
}

@Preview(showBackground = true)
@Composable

fun Myintets(){
    Column(

        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
            .padding(13.dp)
    ) {

        Spacer(modifier = Modifier.height(15.dp))

        val sms = LocalContext.current

        Button(onClick = {
            val phoneNumber = "0726476662"
            val messageText = "Hello it's been a while"

            val uri = Uri.parse("smsto:$phoneNumber")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", messageText)

            sms.startActivity(intent)

        },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()

            ) {
            Text(text = "LAUNCH SMS", fontSize = 20.sp)
        }
        //another button

        Spacer(modifier = Modifier.height(15.dp))
        val camera = LocalContext.current
        Button(onClick = {
            val takepictureintent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            camera.startActivity(takepictureintent)

        },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)


            ) {

            Text(text = "LAUNCH CAMERA", fontSize = 20.sp)

        }
        Spacer(modifier = Modifier.height(15.dp))

        val emaillaunch = LocalContext.current
        Button(onClick = {
              val email_intent = Intent(Intent.ACTION_SENDTO).apply {
                             data = Uri.parse("mailto:kwambokasheilah45@gmail.com")
                             putExtra(Intent.EXTRA_SUBJECT,"Subject")
                             putExtra(Intent.EXTRA_TEXT,"Body")


                         }
            val chooserIntent = Intent.createChooser(email_intent,"send Email")
            emaillaunch.startActivity(chooserIntent)
        },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "LAUNCH EMAIL", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(15.dp))
        val calllaunch = LocalContext.current

        Button(onClick = {


            val phoneNumber = "+254750500200"
            val callIntent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber"))

            if (checkSelfPermission("android.permission.CALL_PHONE") != PackageManager.PERMISSION_GRANTED) { requestPermissions(arrayOf("android.permission.CALL_PHONE"),1) }

            else { calllaunch.startActivity(callIntent)}

        },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "LAUNCH CALL", fontSize = 20.sp)

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "LAUNCH SIM TOOL-KIT", fontSize = 20.sp)

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "SHARE ", fontSize = 20.sp)

        }
    }
}
