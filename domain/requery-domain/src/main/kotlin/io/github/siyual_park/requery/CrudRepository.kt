package io.github.siyual_park.requery

import io.github.siyual_park.database.CrudRepository
import io.github.siyual_park.database.Entity
import io.github.siyual_park.database.Patch
import io.requery.BlockingEntityStore
import kotlin.reflect.KClass

class CrudRepository<T : Entity<ID>, ID>(
    private val entityStore: BlockingEntityStore<T>,
    private val clazz: KClass<T>
) : CrudRepository<T, ID> {
    override fun create(entity: T): T = entityStore.runInTransaction {
        entityStore.insert(entity)
    }

    override fun createAll(entities: Iterable<T>): List<T> = entityStore.runInTransaction {
        entityStore.insert(entities).toList()
    }

    override fun updateById(id: ID, patch: Patch<T>): T = entityStore.runInTransaction {
        entityStore.findByKey(clazz.java, id)?.let {
            update(it, patch)
        }
    }

    override fun update(entity: T, patch: Patch<T>): T = entityStore.runInTransaction {
        entityStore.update(patch.apply(entity))
    }

    override fun upsert(entity: T): T = entityStore.runInTransaction {
        entityStore.upsert(entity)
    }

    override fun upsertAll(entities: Iterable<T>): List<T> = entityStore.runInTransaction {
        entityStore.upsert(entities).toList()
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
