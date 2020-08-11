package com.test.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mod.loger.showLog

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    "123".showLog()
  }
}