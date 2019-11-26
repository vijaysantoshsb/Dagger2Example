package com.example.dagger2example

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, SimpleDataModule::class])
interface AppInterface
{
    fun inject(target: MainActivity)
}