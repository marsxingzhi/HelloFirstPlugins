package com.mars.hello.first.plugins.hook13

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TargetActivity : Activity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
    }
}