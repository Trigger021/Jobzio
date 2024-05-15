package com.example.jobzio.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jobzio.R
import com.example.jobzio.navigation.ABOUT_URL
import com.example.jobzio.navigation.CONTACT_URL
import com.example.jobzio.navigation.MORE_URL
import com.example.jobzio.ui.theme.JobZioTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

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
                painter = painterResource(id = R.drawable.h6),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(10.dp))

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "How can we help??") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search icon",
                    modifier = Modifier
                        .clickable { navController.navigate(CONTACT_URL) }
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .background(Color.White)
        )
        //End of  Search Bar

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Services Offered>>>",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Row1
Row {
Column {

    Image(
        painter = painterResource(id = R.drawable.a1),
        contentDescription = "Construction",
        modifier = Modifier
            .size(75.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
    Text(
        text = "construction",
        fontFamily = FontFamily.Cursive
    )
}

    Spacer(modifier = Modifier.width(10.dp))

    Column {

        Image(
            painter = painterResource(id = R.drawable.a2),
            contentDescription = "Carpentry",
            modifier = Modifier
                .size(75.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "carpentry",
            fontFamily = FontFamily.Cursive

        )
    }

    Spacer(modifier = Modifier.width(10.dp))

    Column {

        Image(
            painter = painterResource(id = R.drawable.h1),
            contentDescription = "Cleaning",
            modifier = Modifier
                .size(75.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "cleaning",
            fontFamily = FontFamily.Cursive

        )
    }

    Spacer(modifier = Modifier.width(10.dp))
    Column {

        Image(
            painter = painterResource(id = R.drawable.h7),
            contentDescription = "mechanic",
            modifier = Modifier
                .size(75.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "mechanic",
            fontFamily = FontFamily.Cursive

        )
    }

    Spacer(modifier = Modifier.width(10.dp))

}
        //End of Row1


        Spacer(modifier = Modifier.height(20.dp))
        //Row2

        Row {
            Column {

                Image(
                    painter = painterResource(id = R.drawable.h2),
                    contentDescription = "garbage",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "waste collection",
                    fontFamily = FontFamily.Cursive

                )
            }

            Spacer(modifier = Modifier.width(10.dp))



            Column {

                Image(
                    painter = painterResource(id = R.drawable.h9),
                    contentDescription = "Carpet",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "carpet wash",
                    fontFamily = FontFamily.Cursive

                )
            }

            Spacer(modifier = Modifier.width(10.dp))


            Column {

                Image(
                    painter = painterResource(id = R.drawable.h15),
                    contentDescription = "Plumbing",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "plumber",
                    fontFamily = FontFamily.Cursive

                )
            }

            Spacer(modifier = Modifier.width(10.dp))


            Column(
                modifier = Modifier.clickable { navController.navigate(MORE_URL) }
            ) {

                Image(
                    painter = painterResource(id = R.drawable.kammm),
                    contentDescription = "more",
                    modifier = Modifier
                        .size(75.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "MORE...",
                    fontFamily = FontFamily.Cursive

                )
            }

            Spacer(modifier = Modifier.width(10.dp))

        }
        //End of Row2

        Spacer(modifier = Modifier.height(150.dp))

        Button(onClick = {
            navController.navigate(ABOUT_URL)
        }) {
            Text(text = "About page:")
        }


    }
}



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
   JobZioTheme {
        HomeScreen(navController = rememberNavController())
    }
}