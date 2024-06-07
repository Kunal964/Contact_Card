package com.example.contactcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactcard.ui.theme.ContactCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactCardTheme {
               Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                   ContactInfo()
               }

                }
            }
        }
    }
@Composable
fun ContactInfo() {  // Create a parent function who align the contactcard() and contactdetails() function in the column wise
    Column(modifier = Modifier
        .background(colorResource(id = R.color.teal_200))
        .fillMaxSize()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Contactcard()
        Contactdetails()
    }
}


@Preview(showBackground = true)
@Composable
fun Cardpreview(){
    ContactCardTheme{
        ContactInfo()
    }

}
