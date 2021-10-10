package com.chan.moviesearcher.data.repository

import com.chan.moviesearcher.data.entity.toDto
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.domain.MovieSearchUseCase
import com.chan.moviesearcher.domain.dto.MovieDto

internal class MovieSearchRepository(
    private val source: MovieDataSource,
) : MovieSearchUseCase {

    override suspend fun fetchMovies(start: Int, query: String): MovieDto =
        source.fetchMovies(start = start, query = query).toDto()
}