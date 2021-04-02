package io.github.siyual_park.requery

import io.github.siyual_park.database.CrudRepository
import io.github.siyual_park.database.Entity
import io.github.siyual_park.database.Patch

class CrudRepository<T : Entity<ID>, ID> : CrudRepository<T, ID> {
    override fun create(entity: T): T {
        TODO("Not yet implemented")
    }

    override fun createAll(entity: Iterable<T>): List<T> {
        TODO("Not yet implemented")
    }

    override fun updateById(id: ID, patch: Patch<T>): T {
        TODO("Not yet implemented")
    }

    override fun update(entity: T, patch: Patch<T>): T {
        TODO("Not yet implemented")
    }

    override fun upsert(entity: T): T {
        TODO("Not yet implemented")
    }

    override fun upsertAll(entity: Iterable<T>): List<T> {
        TODO("Not yet implemented")
    }

    override fun findByIdOrFail(id: ID): T {
        TODO("Not yet implemented")
    }

    override fun existsById(id: ID): Boolean {
        TODO("Not yet implemented")
    }

    override fun findById(id: ID): T? {
        TODO("Not yet implemented")
    }

    override fun findAllByIdIn(ids: Iterable<ID>): List<T> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<T> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: ID) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: T) {
        TODO("Not yet implemented")
    }

    override fun deleteAllByIdIn(ids: Iterable<ID>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<T>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}
