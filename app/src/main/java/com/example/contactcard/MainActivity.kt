package com.example.contactcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
@Composable
fun Contactcard(){  // Set the contactcard() function in the column wise and made 2 section
    Column (modifier = Modifier
       // .fillMaxWidth()
        .padding(vertical = 16.dp),
       verticalArrangement = Arrangement.Center

    ) {
        Column ( // set the image in the column wise
            modifier = Modifier.padding(start = 110.dp),

        ){
            val image = painterResource(R.drawable.bg_android)
            Image(painter = image, contentDescription = null)
        }

        Column (modifier = Modifier // set the both  text in the column wise
            .fillMaxWidth()
        )
        {
            Row {     // set the seperate text in the row wise
                Text(text = stringResource(R.string.Kunal),
                    modifier = Modifier.padding(start = 95.dp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    )
            }

            Row {
                Text(                     // set the seperate text in the row wise
                    text = stringResource(R.string.android),
                    modifier = Modifier.padding(start = 58.dp),
                    fontSize = 20.sp,
                    color = Color(0xFF04582A),

                )
            }
        }
    }
}

@Composable
fun Contactdetails(){ // set the contactdetails() function in the row wise
    Row(modifier = Modifier.padding(vertical = 16.dp),
        verticalAlignment = Alignment.Bottom
        )
    {
        Column (modifier = Modifier.padding(bottom = 30.dp) // set the  both icon and text in the column wise
        ) {
            Row { // set the one icon and one text in the row wise
                Icon(painter = painterResource(R.drawable.baseline_contact_phone_24), contentDescription = null, modifier = Modifier.padding(10.dp))
                Text(text = stringResource(id = R.string.phone_no),
                    modifier = Modifier.padding(10.dp))
            }
            Row { // set the one icon and one text in the row wise
                Icon(painter = painterResource(id = R.drawable.baseline_contact_mail_24), contentDescription = null , modifier = Modifier.padding(10.dp))
                Text(text = stringResource(id = R.string.email_id),
                    modifier = Modifier.padding(10.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Cardpreview(){
    ContactCardTheme{
        ContactInfo()
    }

}
