package com.thanhviet.launchactivitybetter

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tom_detail.*

/**
 * Created by FRAMGIA\bui.dinh.viet on 02/05/2018.
 */
@SuppressLint("Registered")
class TomDetailActivity : AppCompatActivity() {

  private val args by lazy {
    TomProfileActivityArgs.deserializeFrom(intent)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_tom_detail)
    avatar.setImageResource(args.profilePhotoUrl)
    name.setText(args.name)
    bio.setText(args.shortBio)
  }
}