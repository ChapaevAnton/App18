package com.example.app18

import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        val root = findViewById<ViewGroup>(R.id.root)
//        val view = layoutInflater.inflate(R.layout.item, root, false)
//        view.visibility = View.INVISIBLE
//        val view1 = layoutInflater.inflate(R.layout.item, root, false)
//        view1.isEnabled = false
//        val view2 = layoutInflater.inflate(R.layout.item, root, false)
//        view2.setBackgroundColor(resources.getColor(R.color.red, theme))
//        val view3 = layoutInflater.inflate(R.layout.item, root, false)
//        view3.setOnClickListener {}
//        root.addView(view)
//        root.addView(view1)
//        root.addView(view2)
//        root.addView(view3)


        val root = findViewById<LinearLayout>(R.id.root)
        val view4 = layoutInflater.inflate(R.layout.frame_item, root, true)



    }
}