package com.example.task4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import kotlin.jvm.Throws

var x: Int = 0 //
var y: Int = 0


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ap2 = findViewById<Button>(R.id.twopoints)
        val ap3 = findViewById<Button>(R.id.threepoints)
        val afp = findViewById<Button>(R.id.freethrow)
        val bp2 = findViewById<Button>(R.id.twopoints2)
        val bp3 = findViewById<Button>(R.id.threepoints2)
        val bfp = findViewById<Button>(R.id.freethrow2)
        val reset = findViewById<Button>(R.id.reset)
        val aScore = findViewById<TextView>(R.id.aScore)
        val bScore = findViewById<TextView>(R.id.bScore)


        ap2.setOnClickListener {

            Points(aScore, "A", 2)
        }

        bp2.setOnClickListener {

            Points(bScore, "B", 2)
        }

        ap3.setOnClickListener {

            Points(aScore, "A", 3)
        }

        bp3.setOnClickListener {

            Points(bScore, "B", 3)
        }

        afp.setOnClickListener {

            Points(aScore, "A", 1)

        }

        bfp.setOnClickListener {

            Points(bScore, "B", 1)

        }
        reset.setOnClickListener{
            x=0
            y=0
            aScore.setText(""+x)
            bScore.setText(""+y)
        }
    }

    fun Points(view: TextView, z: String, points: Int) {
        if (z == "A") {
            x += points
            view.setText("" + x)
        } else if (z == "B") {
            y += points
            view.setText("" + y)
        } else
            throw Exception("Team not found")
    }

    override fun onClick(p0: View?) {}


}