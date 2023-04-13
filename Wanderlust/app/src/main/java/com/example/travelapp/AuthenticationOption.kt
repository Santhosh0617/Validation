package com.example.travelapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelapp.ui.theme.*

//
@Composable
fun AuthenticationView(register: () -> Unit, login: () -> Unit) {
    TravelAppTheme() {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround

            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.height(24.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.paris),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(
                                Primary
                            ),
                            modifier = Modifier.height(46.dp)
                        )
                        CustomText(text = "Wanderlust")
                        CustomText(text = "A Personalized Travel Planning and Tracking App")

                    }
                    Image(
                        painter = painterResource(id = R.drawable.paris),
                        contentDescription = null
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    ButtonSecondary(title = "Signup", onClick = register)
                    Spacer(modifier = Modifier.height(12.dp))
                    ButtonPrimary(title = "Login", onClick = login)
                }
            }
        }
    }
}

@Preview
@Composable
fun AuthPrev() {
    AuthenticationView(register = { /*TODO*/ }) {

    }
}
