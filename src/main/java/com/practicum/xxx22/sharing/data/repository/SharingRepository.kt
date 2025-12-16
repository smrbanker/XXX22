package com.practicum.xxx22.sharing.data.repository

import com.practicum.xxx22.sharing.data.EmailData

interface SharingRepository {
    fun getShareAppLink():String
    fun getSupportEmailData(): EmailData
    fun getTermsLink():String
}