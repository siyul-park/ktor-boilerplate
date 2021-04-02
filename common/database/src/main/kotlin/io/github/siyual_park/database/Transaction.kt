package io.github.siyual_park.database

interface Transaction {
    fun begin()
    fun commit()
    fun rollback()
}
