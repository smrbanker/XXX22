package com.practicum.xxx22.search.data

import com.practicum.xxx22.search.data.dto.Response

interface NetworkClient {
    suspend fun doRequest(dto: Any): Response
}