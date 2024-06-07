package com.example.contactcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Contactcard(){  // Set the contactcard() function in the column wise and made 2 section
    Column (modifier = Modifier
        // .fillMaxWidth()
        .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column ( // set the image in the column wise
            modifier = Modifier.padding(),

            ){
            val image = painterResource(R.drawable.bg_android)
            Image(painter = image, contentDescription = null)
        }

        Column (modifier = Modifier // set the both  text in the column wise
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Row {     // set the seperate text in the row wise
                Text(text = stringResource(R.string.Kunal),
                    modifier = Modifier.padding(),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Row {
                Text(                     // set the seperate text in the row wise
                    text = stringResource(R.string.android),
                    modifier = Modifier.padding(),
                    fontSize = 20.sp,
                    color = Color(0xFF04582A),

                    )
            }
        }
    }
}
