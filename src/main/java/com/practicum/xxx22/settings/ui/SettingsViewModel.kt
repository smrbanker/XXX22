package com.practicum.xxx22.settings.ui

import androidx.lifecycle.ViewModel
import com.practicum.xxx22.settings.domain.SwitchThemeInteractor
import com.practicum.xxx22.sharing.domain.SharingInteractor

class SettingsViewModel(private val sharingInteractor : SharingInteractor,
                        private val switchThemeInteractor : SwitchThemeInteractor) : ViewModel() {

    fun shareApp() = sharingInteractor.shareApp()
    fun openSupport() = sharingInteractor.openSupport()
    fun openTerms() = sharingInteractor.openTerms()
    fun getTheme():Boolean{
        return switchThemeInteractor.getSharedPreferencesThemeValue()
    }
    fun editTheme(checked:Boolean){
        switchThemeInteractor.sharedPreferencesEdit(checked)
    }
    fun switchTheme(checked: Boolean){
        switchThemeInteractor.switchTheme(checked)
    }
}