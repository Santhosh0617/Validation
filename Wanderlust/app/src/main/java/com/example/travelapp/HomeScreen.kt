package com.example.travelapp

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Home(context: Context) {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .verticalScroll(rememberScrollState())

    ) {

        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = "Wanderlust Travel"
        )

        Spacer(modifier = Modifier.height(20.dp))

        // 01
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
//                    .clickable {
//                    context.startActivity(
//                        Intent(context, BaliActivity::class.java)
//
//                    )
//                    },
            elevation = 8.dp
        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.bali), contentDescription = "",
                    modifier = Modifier
                        .height(150.dp)
                        .scale(scaleX = 1.2F, scaleY = 1F)
                )

                Text(
                    text = stringResource(id = R.string.place_1),
                    fontSize = 18.sp
                )


                Text(
                    text = stringResource(id = R.string.description),
                    fontWeight = FontWeight.Light,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = stringResource(id = R.string.plan), color = androidx.compose.ui.graphics.Color.Gray,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        //02
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clickable {
                    context.startActivity(
                        Intent(context, ParisActivity::class.java)

                    )
                },
            elevation = 8.dp
        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.paris), contentDescription = "",
                    modifier = Modifier
                        .height(150.dp)
                        .scale(scaleX = 1.2F, scaleY = 1F)
                )

                Text(
                    text = stringResource(id = R.string.place_2),
                    fontSize = 18.sp
                )


                Text(
                    text = stringResource(id = R.string.description),
                    fontWeight = FontWeight.Light,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = stringResource(id = R.string.plan), color = androidx.compose.ui.graphics.Color.Gray,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //03
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clickable {
                    context.startActivity(
                        Intent(context, SingaporeActivity::class.java)

                    )
                },
            elevation = 8.dp
        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.singapore), contentDescription = "",
                    modifier = Modifier
                        .height(150.dp)
                        .scale(scaleX = 1.2F, scaleY = 1F)
                )

                Text(
                    text = stringResource(id = R.string.place_3),
                    fontSize = 18.sp
                )


                Text(
                    text = stringResource(id = R.string.description),
                    fontWeight = FontWeight.Light,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = stringResource(id = R.string.plan), color = androidx.compose.ui.graphics.Color.Gray,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}