package ru.netology.nmedia.repository

import arrow.core.Either
import kotlinx.coroutines.flow.Flow
import ru.netology.nmedia.dto.Post

interface PostRepository {
    val data: Flow<List<Post>>
    val newerCount: Flow<Int>
    fun requestNewer(latestId: Long): Flow<Either<Exception, Nothing>>
    suspend fun getAll()
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun likeById(id: Long)
    suspend fun dislikeById(id: Long)
    suspend fun readAll()
}
