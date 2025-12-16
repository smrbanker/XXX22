package com.practicum.xxx22.settings.data

interface SwitchThemeRepository {
    fun switchTheme(darkThemeEnabled: Boolean)
    fun sharedPreferencesEdit(checked :Boolean)
    fun getSharedPreferencesThemeValue():Boolean
}