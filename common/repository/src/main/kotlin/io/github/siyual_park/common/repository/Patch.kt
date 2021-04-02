package io.github.siyual_park.common.repository

interface Patch<T> {
    fun apply(entity: T): T
}
