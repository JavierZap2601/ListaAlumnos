package com.example.listaalumnos.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listaalumnos.models.Student

@Composable
fun StudentCard(student: Student){
    Card(modifier = Modifier.padding(8.dp)){
        Row(modifier = Modifier.fillMaxWidth()){
            Image(
                modifier = Modifier
                    .height(150.dp)
                    .width(120.dp),
                painter = painterResource(id = student.image),
                contentDescription = "Student Image",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = student.id.toString() + " | " + student.name,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )

                Text(
                    text = student.mail,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )
                Text(
                    text = student.career,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )
                Text(
                    text = student.plan,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )
                //StudentDataView(student.console, student.price)


            }

        }
    }
}


