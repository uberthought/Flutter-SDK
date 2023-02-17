package com.moengage.sampleapp

 import com.moengage.core.LogLevel
 import com.moengage.core.MoEngage
 import com.moengage.core.config.FcmConfig
 import com.moengage.core.config.LogConfig
 import com.moengage.core.config.NotificationConfig
 import com.moengage.core.model.SdkState
 import com.moengage.flutter.MoEInitializer
import io.flutter.app.FlutterApplication

class SampleApplication : FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
         val moEngage: MoEngage.Builder = MoEngage.Builder(this, "DAO6UGZ73D9RTK8B5W96TPYN")
             .configureNotificationMetaData(
                 NotificationConfig(
                     R.drawable.icon,
                     R.drawable.ic_launcher,
                     notificationColor = -1,
                     isMultipleNotificationInDrawerEnabled = false,
                     isBuildingBackStackEnabled = true,
                     isLargeIconDisplayEnabled = true
                 )
             )
             .configureLogs(LogConfig(LogLevel.VERBOSE, true))
             .configureFcm(FcmConfig(true))
         MoEInitializer.initialiseDefaultInstance(applicationContext, moEngage, SdkState.ENABLED)
    }
}