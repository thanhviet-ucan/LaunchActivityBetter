package com.thanhviet.launchactivitybetter

import android.content.Context
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Created by FRAMGIA\bui.dinh.viet on 02/05/2018.
 */

class TomProfileActivityArgsTest {

  var context: Context = mock(Context::class.java)

  @Test
  fun `test args serialization and de-serialization`() {
    val expectedArgs = TomProfileActivityArgs(
        "Zak Taccardi",
        "Eat. Sleep. Android.",
        R.drawable.ic_avatar_tom
    )

    // serialize args to intent
    val serializedIntent = expectedArgs.intent(context)
    // deserialize intent into args instance
    val actualArgs = TomProfileActivityArgs.deserializeFrom(serializedIntent)
    // verify de-serialized args are equal to original args
    assertThat(actualArgs)
        .isEqualTo(expectedArgs)
  }
}
