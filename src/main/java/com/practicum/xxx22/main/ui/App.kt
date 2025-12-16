package com.practicum.xxx22.main.ui

import android.app.Application
import com.practicum.xxx22.di.dataModule
import com.practicum.xxx22.di.interactorModule
import com.practicum.xxx22.di.repositoryModule
import com.practicum.xxx22.di.viewModelModule
import com.practicum.xxx22.settings.data.SwitchThemeRepository
import com.practicum.xxx22.settings.domain.SwitchThemeInteractor
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(dataModule, repositoryModule, interactorModule, viewModelModule)
        }

        val sharedPreferencesInteractor : SwitchThemeInteractor by inject()
        val darkThemeAll : SwitchThemeRepository by inject()
        val darkTheme = darkThemeAll.getSharedPreferencesThemeValue()
        sharedPreferencesInteractor.switchTheme(darkTheme)
    }
}