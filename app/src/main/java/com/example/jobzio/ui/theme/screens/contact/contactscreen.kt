package com.example.jobzio.ui.theme.screens.contact

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jobzio.R
import com.example.jobzio.ui.theme.JobZioTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        val mContext = LocalContext.current

        //Box Layout
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.contact),
                contentDescription = "contact",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(30.dp))

        //CALL
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0705643646".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "CALL us via")
        }


        Spacer(modifier = Modifier.height(30.dp))


        //EMAIL
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("heezydoopzy@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello JobZio,I would like to {...} ")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "EMAIL us via")
        }

        Spacer(modifier = Modifier.height(30.dp))

        //SMS
        Button(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0705643646".toUri()
            smsIntent.putExtra("sms_body","Hello JobZio,i would like to request for {...}")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SMS us via")
        }

    }
}



@Composable
@Preview(showBackground = true)
fun ContactScreenPreview(){
    JobZioTheme {
        ContactScreen(navController = rememberNavController())
    }
}