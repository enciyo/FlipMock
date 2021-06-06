package com.enciyo.flippermocknetworkplugin.plugin

import com.enciyo.flippermocknetworkplugin.interceptor.FlipMockInterceptor
import com.facebook.flipper.core.FlipperPlugin

interface FlipMockPlugin : FlipperPlugin {

    val interceptor: FlipMockInterceptor

    companion object {
        const val TAG = "MyLogger"
        const val PLUGIN_ID = "flipper-plugin-enciyo-flipmock"
        const val RUN_IN_BACKGROUND = false
        fun getInstance(): FlipMockPlugin = MockPlugin()
    }
}
