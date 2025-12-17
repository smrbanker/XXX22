package com.practicum.xxx22.search.domain

data class Playlist(
    val playlistId : Int?,
    val playlistName : String,
    val playlistDescription : String?,
    val playlistImage : String?,
    val playlistList: String?,
    val playlistCount : Int = 0
)