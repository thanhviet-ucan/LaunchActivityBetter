package com.thanhviet.launchactivitybetter

import android.content.Context
import android.content.Intent

/**
 * Arguments to launch [TomDetailActivity]
 */
private const val NAME_KEY = "name_key"
private const val SHORT_BIO_KEY = "short_bio_key"
private const val PROFILE_PHOTO_ID = "profile_photo_id_drawable"

data class TomProfileActivityArgs(
    var name: String,
    var shortBio: String,
    var profilePhotoUrl: Int
) : ActivityArgs {

  override fun intent(activity: Context): Intent = Intent(
      activity, TomDetailActivity::class.java
  ).apply {
    putExtra(NAME_KEY, name)
    putExtra(SHORT_BIO_KEY, shortBio)
    putExtra(PROFILE_PHOTO_ID, profilePhotoUrl)
  }

  companion object {
    fun deserializeFrom(intent: Intent): TomProfileActivityArgs {
      return TomProfileActivityArgs(
          name = intent.getStringExtra(NAME_KEY),
          shortBio = intent.getStringExtra(SHORT_BIO_KEY),
          profilePhotoUrl = intent.getIntExtra(PROFILE_PHOTO_ID, 0)
      )
    }
  }
}