package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {

   lateinit var  textView:TextView
    lateinit var editText:TextView
    lateinit var button:Button

    var logger=Logger.getLogger("main-activity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.layout)

        textView =findViewById<TextView>(R.id.textView2)
        editText =findViewById<TextView>(R.id.editTextTextEmailAddress2)
        button=findViewById(R.id.button2)

        button.setOnClickListener({view-> logger.log(Level.INFO,"EditText"+editText?.text)
            editText.setText("aaaaaaaaaaa")
            editText.setBackgroundColor(0xFFFF87FFF.toInt())
        })
    }
}

