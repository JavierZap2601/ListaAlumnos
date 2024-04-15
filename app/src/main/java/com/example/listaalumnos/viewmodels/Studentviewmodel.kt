package com.example.listaalumnos.viewmodels

import androidx.lifecycle.ViewModel
import com.example.listaalumnos.R
import com.example.listaalumnos.models.Student

class Studentviewmodel: ViewModel() {

    init{
        //constructor
    }

    fun getStudentList(): ArrayList<Student>{
        val student: Student = Student(19475,"Edson de Jesus Maya Mendez", "edson.maya@iest.edu.mx", "Licenciatura en Ingenieria en Sistemas y Negocios Digitales", "(Plan 2020)", R.drawable.stockphoto)
        var studentList: ArrayList<Student> = ArrayList<Student>()
        studentList.add(student)
        studentList.add(Student(19508,"Aylin Alvarez Hernandez","aylin.alvarez@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(19523,"Yoeselin Alejandra Mojica Ahumada","yoselin.mojica@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(19666,"Sebastian Rubio Quiroz","sebastian.rubio@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(21637,"Josue David Arreola Aguilera","josue.arreola@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(21767,"Maria Fernanda Villareal Mar","maria.villareal02@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(22098,"Gerardo Torres Garcia","gerardo.torres@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(22154,"Luis Javier Zapata Perales","luis.zapata01@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(22180,"Alfonso Madero Benitez","alfonso.madero@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(22208,"David Alejandro Rivera Luna","david.rivera@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))
        studentList.add(Student(22210,"Raymundo Gutierrez Guerrero","raymundo.gutierrez@iest.edu.mx","Licenciatura en Ingenieria en Sistemas y Negocios Digitales","",R.drawable.stockphoto))

        return studentList
    }
}