package com.practicum.xxx22.search.data

import com.practicum.xxx22.search.domain.Track

interface HistoryRepository {
    fun trackWrite(historyListID: MutableList<Track>)
    fun trackClear()
    fun trackRead(): Array<Track>
}