package io.github.siyual_park.repository

interface Patch<T> {
    fun apply(entity: T): T
}
