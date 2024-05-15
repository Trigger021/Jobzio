package com.example.jobzio.ui.theme.screens.About


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jobzio.R
import com.example.jobzio.ui.theme.JobZioTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        //Box Layout
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.about),
                contentDescription = "about",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = ">>>At JobZio...,\n" +
                " we believe your time is valuable. That's why we connect you with skilled, reliable handymen ready to tackle your to-do list, big or small.  We take the hassle out of home maintenance and repairs, so you can focus on what matters most.",
            fontWeight = FontWeight.Bold,
            fontSize = TextUnit.Unspecified

        )


        Spacer(modifier = Modifier.height(50.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.mission),
                contentDescription = "mission",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = ">>>At JobZio...,\n" +
                " our mission is to empower homeowners (or make life easier for busy people) by connecting them with trusted, skilled handymen. We strive to simplify home maintenance  and deliver exceptional service  so you can focus on what truly matters.",
            fontWeight = FontWeight.Bold,
            fontSize = TextUnit.Unspecified

        )


        Spacer(modifier = Modifier.height(50.dp))


    }

}



@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    JobZioTheme {
        AboutScreen(navController = rememberNavController())
    }
}