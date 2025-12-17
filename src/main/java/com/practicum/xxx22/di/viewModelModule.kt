package com.practicum.xxx22.di

import com.practicum.xxx22.media.ui.create.MediaViewModelCreatePlaylist
import com.practicum.xxx22.media.ui.playlist.MediaViewModelPlaylist
import com.practicum.xxx22.media.ui.track.MediaViewModelTrack
import com.practicum.xxx22.player.ui.PlayerViewModel
import com.practicum.xxx22.search.ui.HistoryViewModel
import com.practicum.xxx22.search.ui.SearchViewModel
import com.practicum.xxx22.settings.ui.SettingsViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        HistoryViewModel(get())
    }

    viewModel {
        SearchViewModel(get())
    }

    viewModel {
        SettingsViewModel(get(), get())
    }

    viewModel {
        PlayerViewModel(get(), get(), get())
    }

    viewModel {
        MediaViewModelTrack(androidContext(),get())
    }

    viewModel { (playlist: String) ->
        MediaViewModelPlaylist(androidContext(), get())
    }

    viewModel {
        MediaViewModelCreatePlaylist(get())
    }

}