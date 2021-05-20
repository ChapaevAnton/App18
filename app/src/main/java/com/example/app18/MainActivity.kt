package com.example.app18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.view_all)

        //TODO app20
//        val rootContent = findViewById<LinearLayout>(R.id.root_content) //корневой layout
//        val textView = TextView(this)
//        rootContent.addView(textView.apply {
//            text = "hello world!!!"
//            setTextColor(ContextCompat.getColor(context, R.color.black))
//        })

        //TODO app18-19

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


//        val rootContent = findViewById<LinearLayout>(R.id.root_content) //корневой layout
//        var count = 1 //счетчик элемента
//        val list: List<View> = List(100) {//заполняю список нумерованными элементами
//            val item = layoutInflater.inflate(R.layout.frame_item, rootContent, false) //элемент
//            val iconText = item.findViewById<TextView>(R.id.icon_text) //текст на элементе
//            iconText.setText("$count")  //передаем значение счетчика
//            count++ //увеличиваем счетчик
//            item //возвращаем готовый элемент
//        }
//
//        list.forEach { rootContent.addView(it) } //добавляем элемент в корневой layout

    }
}