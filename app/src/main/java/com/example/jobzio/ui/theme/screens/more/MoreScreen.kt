package com.example.jobzio

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jobzio.navigation.ADD_SERVICES_URL
import com.example.jobzio.navigation.VIEW_SERVICES_URL
import com.example.jobzio.ui.theme.JobZioTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavHostController){
    Column {

        val mContext = LocalContext.current

        TopAppBar(
            title = { Text(text = "Cleaning",color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription ="back",
                        tint = Color.Black)

                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications ,
                        contentDescription ="notification",
                        tint = Color.Black)

                }


                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search ,
                        contentDescription ="search",
                        tint = Color.Black)

                }
            }
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        )
        {
            Text(
                text = "Types Of Services:",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp),
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Spacer(modifier = Modifier.width(15.dp))

                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.a3),
                                contentDescription = "baby",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Baby sitting",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "113 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "From Ksh.800",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0705643646".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call ")}

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("heezydoopzy@gmail.com")
                            )
                            shareIntent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                "Requesting for a reliable and responsible baby sitter who will take care of my child for me"
                            )

                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email ")

                        }
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.h18),
                                contentDescription = "dog",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Dog walking",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "152 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "From Ksh.500",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0705643646".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call ")}

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("heezydoopzy@gmail.com")
                            )
                            shareIntent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                "Requesting for a dog walker to walk and help exercise my dog"
                            )

                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email ")

                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))

                }

            }
            // End of Row

            Row {

                Spacer(modifier = Modifier.width(15.dp))

                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.h17),
                                contentDescription = "paint",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "House painter",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "113 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "From Ksh13,000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0705643646".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call ")}

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("heezydoopzy@gmail.com")
                            )
                            shareIntent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                "Requesting for a skilled personel in house painting and decorations"
                            )

                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email ")

                        }
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)

                    ) {

                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.h16),
                                contentDescription = "electricity",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Electrician",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "favourite",
                            tint = Color.Cyan,
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "152 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "From Ksh.2,000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0705643646".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call ")}

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("heezydoopzy@gmail.com")
                            )
                            shareIntent.putExtra(
                                Intent.EXTRA_SUBJECT,
                                "Requesting for a dog walker to walk and help exercise my dog"
                            )

                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email ")

                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))

                }

            }
            // End of Row

            Spacer(modifier = Modifier.height(40.dp))

            Button(onClick = {
                navController.navigate(ADD_SERVICES_URL)
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Add others")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(VIEW_SERVICES_URL)
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "view others")
            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun MoreScreenPreview(){
    JobZioTheme {
        MoreScreen(navController = rememberNavController())
    }
}





