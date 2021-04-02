package io.github.siyual_park.repository

interface AsyncPatch<T> {
    suspend fun apply(entity: T): T
}
