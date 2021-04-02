package io.github.siyual_park.common.repository

interface AsyncPatch<T> {
    suspend fun apply(entity: T): T
}
