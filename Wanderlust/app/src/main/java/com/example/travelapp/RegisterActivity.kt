package com.example.travelapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.travelapp.ui.theme.Muted
import com.example.travelapp.ui.theme.Primary
import com.example.travelapp.ui.theme.PureWhite
import com.example.travelapp.ui.theme.TravelAppTheme

//class RegisterActivity : ComponentActivity() {
//    private lateinit var databaseHelper: UserDatabaseHelper
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        databaseHelper = UserDatabaseHelper(this)
//        setContent {
//            TravelAppTheme() {
//                RegistrationScreen(this, databaseHelper)
//            }
//        }
//    }
//}

@Composable
fun RegistrationScreen(context: Context, databaseHelper: UserDatabaseHelper) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Muted),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Hspace(size = 0)

        Image(
            painterResource(id = R.drawable.register), contentDescription = "", modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .height(300.dp), contentScale = ContentScale.FillBounds
        )
        Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(40.dp)) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {

                CustomText(
                    text = "Register",
                    size = 32,
                    weight = FontWeight.ExtraBold,
                    color = Primary
                )


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
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
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
                        if (username.isNotEmpty() && password.isNotEmpty() && email.isNotEmpty()) {
                            val user = User(
                                id = null,
                                firstName = username,
                                lastName = null,
                                email = email,
                                password = password
                            )
                            databaseHelper.insertUser(user)
                            error = "User registered successfully"
                            // Start LoginActivity using the current context
//                            context.startActivity(
//                                Intent(
//                                    context,
//                                    LoginActivity::class.java
//                                )
//                            )

                        } else {
                            error = "Please fill all fields"
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                ) {
                    CustomText(
                        text = "Register",
                        weight = FontWeight.ExtraBold,
                        size = 16,
                        color = PureWhite
                    )
                }
                Hspace(size = 10)


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CustomText(
                        text = "Already have an account?", size = 16
                    )
                    TextButton(onClick = {
//                        context.startActivity(
//                            Intent(
//                                context,
//                                LoginActivity::class.java
//                            )
//                        )
                    })

                    {
                        CustomText(text = "Log in", size = 18, weight = FontWeight.SemiBold, color = Primary)
                    }
                }
            }
        }
    }
}

private fun startLoginActivity(context: Context) {
//    val intent = Intent(context, LoginActivity::class.java)
//    ContextCompat.startActivity(context, intent, null)
}
