package com.mars.zeusstudy1_3

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_go_test).setOnClickListener {
            startActivity(Intent().apply {
                component = ComponentName("com.mars.plugin", "com.mars.plugin.PluginActivity")
            })
        }
    }
}