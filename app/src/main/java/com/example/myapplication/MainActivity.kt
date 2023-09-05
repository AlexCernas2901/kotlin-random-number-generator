package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val btnGenerate = findViewById<Button>(R.id.btnGenerate)
		val txtvArrayGenerated = findViewById<TextView>(R.id.txtvArrayGenerated)
		val txtvLowerNumber = findViewById<TextView>(R.id.txtvLowerNumber)
		val txtvAverage = findViewById<TextView>(R.id.txtvAverage)
		val txtvHigherNumber = findViewById<TextView>(R.id.txtvHigherNumber)

		btnGenerate.setOnClickListener {

		}
	}
}