package com.practicum.xxx22.di

import android.content.Context
import android.media.MediaPlayer
import com.practicum.xxx22.media.data.FavouriteRepositoryImpl
import com.practicum.xxx22.media.domain.db.FavouriteRepository
import com.practicum.xxx22.player.data.MediaPlayerRepositories
import com.practicum.xxx22.player.data.MediaPlayerRepositoriesImpl
import com.practicum.xxx22.search.data.HistoryRepository
import com.practicum.xxx22.search.data.HistoryRepositoryImpl
import com.practicum.xxx22.search.data.dto.SearchHistoryImpl
import com.practicum.xxx22.search.data.dto.TrackDto
import com.practicum.xxx22.search.data.network.TracksConverterImpl
import com.practicum.xxx22.search.data.network.TracksRepositoryImpl
import com.practicum.xxx22.search.domain.api.SearchHistory
import com.practicum.xxx22.search.domain.api.TracksConverter
import com.practicum.xxx22.search.domain.api.TracksRepository
import com.practicum.xxx22.settings.data.SwitchThemeRepository
import com.practicum.xxx22.settings.data.SwitchThemeRepositoryImpl
import com.practicum.xxx22.sharing.data.repository.ExternalNavigatorRepository
import com.practicum.xxx22.sharing.data.repository.ExternalNavigatorRepositoryImpl
import com.practicum.xxx22.sharing.data.repository.SharingRepository
import com.practicum.xxx22.sharing.data.repository.SharingRepositoryImpl
import com.practicum.xxx22.utils.TrackDbConvertor
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

val repositoryModule = module {

    single(qualifier = named("save")) {
        androidContext().getSharedPreferences("key_for_save", Context.MODE_PRIVATE)
    }

    single(qualifier = named("switch")) {
        androidContext().getSharedPreferences("key_for_switch", Context.MODE_PRIVATE)
    }

    factory { MediaPlayer() }

    factory<MediaPlayerRepositories> {
        MediaPlayerRepositoriesImpl(get())
    }

    factory<SearchHistory<TrackDto>>{
        SearchHistoryImpl(get(qualifier = named("save")), get(), get())
    }

    factory<TracksConverter> {
        TracksConverterImpl()
    }

    factory<HistoryRepository> {
        HistoryRepositoryImpl(get(), get())
    }

    factory<TracksRepository> {
        TracksRepositoryImpl(get(), get())
    }

    factory<SwitchThemeRepository> {
        SwitchThemeRepositoryImpl(get(qualifier = named("switch")))
    }

    factory<ExternalNavigatorRepository> {
        ExternalNavigatorRepositoryImpl(get())
    }

    factory<SharingRepository> {
        SharingRepositoryImpl(get())
    }

    factory { TrackDbConvertor() }

    single<FavouriteRepository> {
        FavouriteRepositoryImpl(get(), get())
    }
}