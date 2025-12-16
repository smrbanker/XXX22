package com.practicum.xxx22.sharing.data.repository

import com.practicum.xxx22.sharing.data.EmailData

interface ExternalNavigatorRepository {
    fun shareLink(text:String)
    fun openLink(link:String)
    fun openEmail(email: EmailData)
}