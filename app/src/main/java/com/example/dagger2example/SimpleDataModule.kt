package com.example.dagger2example

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SimpleDataModule {
    @Provides
    @Singleton
    fun sendSampleData(): String = "Vijay Santosh"
}