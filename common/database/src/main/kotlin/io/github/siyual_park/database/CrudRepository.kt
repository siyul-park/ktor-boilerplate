package io.github.siyual_park.database

interface CrudRepository<T : Entity<ID>, ID> {
    fun create(entity: T): T

    fun createAll(entity: Iterable<T>): List<T>

    fun updateById(id: ID, patch: Patch<T>): T

    fun update(entity: T, patch: Patch<T>): T

    fun upsert(entity: T): T

    fun upsertAll(entity: Iterable<T>): List<T>

    fun findByIdOrFail(id: ID): T

    fun existsById(id: ID): Boolean

    fun findById(id: ID): T?

    fun findAllByIdIn(ids: Iterable<ID>): List<T>

    fun findAll(): List<T>

    fun count(): Long

    fun deleteById(id: ID)

    fun delete(entity: T)

    fun deleteAllByIdIn(ids: Iterable<ID>)

    fun deleteAll(entities: Iterable<T>)

    fun deleteAll()
}
