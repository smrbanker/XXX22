package com.practicum.xxx22.settings.domain

import com.practicum.xxx22.settings.data.SwitchThemeRepository

class SwitchThemeInteractorImpl(private val repository : SwitchThemeRepository):
    SwitchThemeInteractor {

    override fun switchTheme(darkThemeEnabled: Boolean) {
        return repository.switchTheme(darkThemeEnabled)
    }
    override fun sharedPreferencesEdit(checked: Boolean) {
        return repository.sharedPreferencesEdit(checked)
    }
    override fun getSharedPreferencesThemeValue():Boolean {
        return repository.getSharedPreferencesThemeValue()
    }
}