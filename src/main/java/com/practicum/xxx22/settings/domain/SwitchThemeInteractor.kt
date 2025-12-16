package com.practicum.xxx22.settings.domain

interface SwitchThemeInteractor {
    fun switchTheme(darkThemeEnabled : Boolean)
    fun sharedPreferencesEdit(checked : Boolean)
    fun getSharedPreferencesThemeValue() : Boolean
}