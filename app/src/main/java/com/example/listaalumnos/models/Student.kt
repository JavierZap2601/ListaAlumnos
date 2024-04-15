package com.example.listaalumnos.models

import androidx.annotation.DrawableRes

data class Student (
    val id: Int,
    val name: String,
    val mail: String,
    val career: String,
    val plan: String,
    @DrawableRes val image: Int
)