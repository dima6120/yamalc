package com.dima6120.edit_anime_list_entry.usecase

import com.dima6120.core_api.model.UseCaseResult
import com.dima6120.core_api.model.anime.AnimeId

interface DeleteAnimeListEntryUseCase {

    suspend operator fun invoke(animeId: AnimeId): UseCaseResult<Unit>
}