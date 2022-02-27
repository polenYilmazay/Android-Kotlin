package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startButton: Button =findViewById(R.id.start)
        //var showArticle:TextView=findViewById(R.id.textView)
        var showDice:ImageView=findViewById(R.id.imageView2)

        showDice.setImageResource(R.drawable.dice1)

        startButton.setOnClickListener{

            var random=(1..6).random()

            //Toast.makeText(this,"The key has been pressed",Toast.LENGTH_SHORT).show()
            //showArticle.text=random.toString()

            when(random){
                1-> showDice.setImageResource(R.drawable.dice1)
                2-> showDice.setImageResource(R.drawable.dice2)
                3-> showDice.setImageResource(R.drawable.dice3)
                4-> showDice.setImageResource(R.drawable.dice4)
                5-> showDice.setImageResource(R.drawable.dice5)
                6-> showDice.setImageResource(R.drawable.dice6)
            }

            /*
            if(random==1)
                showArticle.text="1"
            else if(random==2)
                showArticle.text="2"
            else if(random==3)
                showArticle.text="3"
                */

        }


    }
}