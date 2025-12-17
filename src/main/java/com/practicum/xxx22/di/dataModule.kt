package com.practicum.xxx22.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.practicum.xxx22.media.data.AppDatabase
import com.practicum.xxx22.search.data.NetworkClient
import com.practicum.xxx22.search.data.network.RetrofitNetworkClient
import com.practicum.xxx22.search.data.network.iTunesAPI
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single <Retrofit> {
        Retrofit.Builder()
            .baseUrl("https://itunes.apple.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single <iTunesAPI> {
        get<Retrofit>().create(iTunesAPI::class.java)
    }

    single {
        androidContext()
            .getSharedPreferences("save_list2", Context.MODE_PRIVATE)
    }

    factory { Gson() }

    single<NetworkClient> {
        RetrofitNetworkClient(get(), androidContext())
    }

    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "database102.db")
            .build()
    }
}