package io.github.siyual_park.common.repository

interface AsyncCrudRepository<T : Entity<ID>, ID> {
    suspend fun create(entity: T): T

    suspend fun createAll(entity: Iterable<T>): List<T>

    suspend fun updateById(id: ID, patch: Patch<T>): T

    suspend fun update(entity: T, patch: Patch<T>): T

    suspend fun upsert(entity: T): T

    suspend fun upsertAll(entity: Iterable<T>): List<T>

    suspend fun findByIdOrFail(id: ID): T

    suspend fun existsById(id: ID): Boolean

    suspend fun findById(id: ID): T?

    suspend fun findAllByIdIn(ids: Iterable<ID>): List<T>

    suspend fun findAll(): List<T>

    suspend fun count(): Long

    suspend fun deleteById(id: ID)

    suspend fun delete(entity: T)

    suspend fun deleteAllByIdIn(ids: Iterable<ID>)

    suspend fun deleteAll(entities: Iterable<T>)

    suspend fun deleteAll()
}
