package com.example.travelapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.travelapp.ui.theme.*
//
//class LoginActivity : ComponentActivity() {
//    private lateinit var databaseHelper: UserDatabaseHelper
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        databaseHelper = UserDatabaseHelper(this)
//        setContent {
//          TravelAppTheme() {
//              LoginScreen(this, databaseHelper)
//          }
//        }
//    }
//}
@Composable
fun LoginScreen(context: Context, databaseHelper: UserDatabaseHelper) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Muted),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
Hspace(size = 0)
        Image(painterResource(id = R.drawable.login), contentDescription = "", modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .height(300.dp), contentScale = ContentScale.FillBounds)
Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(40.dp)) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {

        CustomText(text = "Login", size = 32, weight = FontWeight.ExtraBold, color = Primary)
        Hspace(size = 12)

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier
                .fillMaxWidth()
        )
Hspace(size = 12)
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()

        )
        Hspace(size = 12)

        if (error.isNotEmpty()) {
            Text(
                text = error,
                color = MaterialTheme.colors.error,
            )
        }
        Hspace(size = 12)

        Button(
            onClick = {
                if (username.isNotEmpty() && password.isNotEmpty()) {
                    val user = databaseHelper.getUserByUsername(username)
                    if (user != null && user.password == password) {
                        error = "Successfully log in"
                        context.startActivity(
                            Intent(
                                context,
                                MainActivity::class.java
                            )
                        )
                        //onLoginSuccess()
                    }
                    else {
                        error =  "Invalid username or password"
                    }
                } else {
                    error = "Please fill all fields"
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
        ) {
            CustomText(text = "Login", weight = FontWeight.ExtraBold, size = 16, color = PureWhite)
        }
        Hspace(size = 10)

        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
//            TextButton(onClick = {context.startActivity(
//                Intent(
//                    context,
//                    RegisterActivity::class.java
//                )
//            )}
//            )
//            { CustomText(text = "Register", color = Primary, size = 14, weight = FontWeight.SemiBold, decor = TextDecoration.Underline) }
            TextButton(onClick = {
            })

            {

                CustomText(text = "Forgot Password?", color = Primary, size = 14, weight = FontWeight.SemiBold, decor = TextDecoration.Underline)
            }
        }
    }
}

    }
}
private fun startMainPage(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    ContextCompat.startActivity(context, intent, null)
}