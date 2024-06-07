package com.example.contactcard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

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
