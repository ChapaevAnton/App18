package com.example.app18

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.constraintlayout5.*
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.view_all.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.view_all)

        //TODO 20.5
//        val button1 = findViewById<Button>(R.id.main_view_button1)
//        button1.setOnClickListener{
//            val name = getString(R.string.main_view_my_name)
//            Toast.makeText(this, getString(R.string.main_view_my_text, name), Toast.LENGTH_LONG).show()
//        }


//        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
//        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
//        val checkBox = findViewById<CheckBox>(R.id.checkBox)
//        val switch1 = findViewById<SwitchCompat>(R.id.switch1)
//
//        radioGroup.setOnCheckedChangeListener { _, checkedId ->
//            if (checkedId == R.id.radioButton1)
//                Toast.makeText(this, "ВКЛ", Toast.LENGTH_SHORT).show()
//            else
//                Toast.makeText(this, "ВЫКЛ", Toast.LENGTH_SHORT).show()
//        }
//        toggleButton.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked)
//                Toast.makeText(this, "ВКЛ", Toast.LENGTH_SHORT).show()
//            else
//                Toast.makeText(this, "ВЫКЛ", Toast.LENGTH_SHORT).show()
//        }
//        checkBox.setOnClickListener {
//            if (checkBox.isChecked)
//                Toast.makeText(this, "ВКЛ", Toast.LENGTH_SHORT).show()
//            else
//                Toast.makeText(this, "ВЫКЛ", Toast.LENGTH_SHORT).show()
//        }
//
//        switch1.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked)
//                Toast.makeText(this, "ВКЛ", Toast.LENGTH_SHORT).show()
//            else
//                Toast.makeText(this, "ВЫКЛ", Toast.LENGTH_SHORT).show()
//        }

        //TODO 20.3 https://habr.com/ru/post/307798/

//        val textView = findViewById<TextView>(R.id.textView1)

//        val name: SpannableString = SpannableString(getString(R.string.main_view_my_name))
//        name.setSpan(
//            ForegroundColorSpan(getColor(R.color.black)),
//            2,
//            4,
//            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
//        textView.text=name


//        textView1.text = resources.getQuantityText(R.plurals.month, 55)

//        val name = getString(R.string.main_view_my_name)
//        textView.text = getString(R.string.main_view_my_text,name)

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

    fun clickButton(view: View) {
        val name = getString(R.string.main_view_my_name)
        Toast.makeText(this, getString(R.string.main_view_my_text, name), Toast.LENGTH_LONG).show()
    }
}