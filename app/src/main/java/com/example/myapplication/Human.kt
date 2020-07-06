package com.example.myapplication

import android.util.Log

class Human :Animal,Thinkable{
    constructor(name: String, age :Int, think :String):super(name, age,think){
    }

    override  fun say(){
        Log.d("kotlintest", "私の名前は" + name + "です")
        Log.d("kotlintest", "私の年齢は" + age + "です")
    }

    override fun think() {
        Log.d("kotlintst", "私は" + hobby + "について考える")
    }

}