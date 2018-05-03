package com.thanhviet.launchactivitybetter

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    btn_detail.setOnClickListener({ goToTomProfile() })
  }

  private fun goToTomProfile() {
    TomProfileActivityArgs(
        "Dr. Tom Pro",
        "Eat. Climbing. Love mouse.",
        R.drawable.ic_avatar_tom
    )
        .launch(this)
  }
}
