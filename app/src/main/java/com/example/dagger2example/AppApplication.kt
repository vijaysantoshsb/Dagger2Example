package com.example.dagger2example

import android.app.Application

class AppApplication : Application() {
    lateinit var appInterface: AppInterface

    override fun onCreate() {
        super.onCreate()
        appInterface = initDagger(this)
    }

    private fun initDagger(app: Application): AppInterface =
        DaggerAppInterface.builder()
            .appModule(AppModule(app))
            .build()
}