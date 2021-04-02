package io.github.siyual_park.database

interface Patch<T> {
    fun apply(entity: T): T
}
