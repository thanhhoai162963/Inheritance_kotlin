package com.example.kethua_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dog = Dog()
        Log.d("bbb",dog.talk())
        Log.d("bbb",dog.id.toString())
    }
}

open class Animal(var id:Int = 0){
    open fun talk() {}
}
class Dog(var ID:Int = 12,val color:String = "",var weight:Int = 0) : Animal(){
    init {
        super.id = ID
    }

    override fun talk() {
        Log.d("bbb","gau gau")
    }
}
class Cat : Animal{
    constructor(id: Int) : super(id)
}