package com.example.st10384980keanobarendseassignment1imad5112

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.GenerateAge)
        val Clear = findViewById<Button>(R.id.Clear)
        val editText = findViewById<EditText>(R.id.EnterAge)
        val results = findViewById<TextView>(R.id.Results)


        button.setOnClickListener {
            var input = editText.text.toString()


            //If the GenerateAge button is clicked without enter a text a Error will populate
            if(input.isEmpty()) {
                results.text = "Please enter your Age"
                return@setOnClickListener
            }





            //Users can Enter their Age and a Celebrity will populate
            var number = input.toInt()
            var celebrity= when(number){
                50-> "Michael Jackson"
                22-> "Aaliyah Haughton"
                95-> "Stan Lee"
                25-> "2Pac"
                83-> "Tina Turner"
                53-> "George Michael"
                41-> "Kobe Bryant"
                40-> "Paul Walker"
                48-> "Whitney Houston"
                80-> "Jessica Walter"
                else-> "Please try using a different Age"
            }
            results.text = celebrity

            //If the User enters a number that is outside the Age Bracket of 20 and 100, then a Error will populate
            val age = number.toInt()
            if (age < 20) {
                results.text = "Too young, Please enter an Age older than 20"
            } else if (age > 100)
                results.text = "Too old, Please enter an Age younger than 100"




        }








        //Users can clear their Text with this Clear Button
        Clear.setOnClickListener {
            editText.text.clear()
        }



    }
    //GEEKS FOR GEEKS, NATIONAL SUPPORT SESSION, HANDBOOK,




}