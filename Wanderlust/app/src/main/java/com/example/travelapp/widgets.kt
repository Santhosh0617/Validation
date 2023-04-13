package com.example.travelapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.Primary
import com.example.travelapp.ui.theme.PureDark


@Composable
fun Hspace(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun Wspace(size:Int){
    Spacer(modifier = Modifier.width(size.dp))
}


@Composable
fun CustomText(text:String, size: Int=14, weight: FontWeight = FontWeight.Normal, color: Color = PureDark, decor: TextDecoration = TextDecoration.None){
    Text(
        fontSize = size.sp,
        fontWeight = weight,
        fontFamily = FontFamily.Cursive,
        text = text,
        textDecoration= decor,
        color = color
    )
}



@Composable
fun ButtonPrimary(title: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Primary, contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(12),
    ) {
        Text(
            text = title, fontSize = 16.sp, fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun ButtonSecondary(title: String, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        border = BorderStroke(1.dp, Primary),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent, contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(12),
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            color = Primary,
            fontWeight = FontWeight.SemiBold
        )
    }
}
