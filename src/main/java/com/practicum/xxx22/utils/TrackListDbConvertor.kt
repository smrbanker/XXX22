package com.practicum.xxx22.utils

import com.practicum.xxx22.media.data.db.entity.TrackListEntity
import com.practicum.xxx22.search.domain.Track

class TrackListDbConvertor {

    fun map(track: Track): TrackListEntity {
        return TrackListEntity(track.trackId, track.trackName, track.artistName, track.trackTime, track.artworkUrl100, track.collectionName, track.releaseDate, track.primaryGenreName, track.country, track.previewUrl)
    }

    fun map(track: TrackListEntity): Track {
        return Track(track.trackId, track.trackName, track.artistName, track.trackTime, track.artworkUrl100, track.collectionName, track.releaseDate, track.primaryGenreName, track.country, track.previewUrl)
    }
}