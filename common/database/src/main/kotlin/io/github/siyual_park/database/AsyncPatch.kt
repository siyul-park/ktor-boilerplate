package io.github.siyual_park.database

interface AsyncPatch<T> {
    suspend fun apply(entity: T): T
}
