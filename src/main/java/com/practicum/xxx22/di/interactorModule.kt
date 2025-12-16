package com.practicum.xxx22.di

import com.practicum.xxx22.media.domain.db.FavouriteInteractor
import com.practicum.xxx22.media.domain.impl.FavouriteInteractorImpl
import com.practicum.xxx22.player.domain.MediaPlayerInteractor
import com.practicum.xxx22.player.domain.MediaPlayerInteractorImpl
import com.practicum.xxx22.search.domain.HistoryInteractor
import com.practicum.xxx22.search.domain.HistoryInteractorImpl
import com.practicum.xxx22.search.domain.TracksInteractorImpl
import com.practicum.xxx22.search.domain.api.TracksInteractor
import com.practicum.xxx22.settings.domain.SwitchThemeInteractor
import com.practicum.xxx22.settings.domain.SwitchThemeInteractorImpl
import com.practicum.xxx22.sharing.domain.SharingInteractor
import com.practicum.xxx22.sharing.domain.SharingInteractorImpl
import org.koin.dsl.module

val interactorModule = module {

    factory<TracksInteractor> {
        TracksInteractorImpl(get())
    }

    factory<HistoryInteractor> {
        HistoryInteractorImpl(get())
    }

    factory<SwitchThemeInteractor> {
        SwitchThemeInteractorImpl(get())
    }

    factory<SharingInteractor> {
        SharingInteractorImpl(get(), get())
    }

    factory<MediaPlayerInteractor> {
        MediaPlayerInteractorImpl(get())
    }

    single<FavouriteInteractor> {
        FavouriteInteractorImpl(get())
    }

}