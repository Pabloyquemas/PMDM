package com.pgonrod.pmdm2022.ut01.ex06.domain

interface UserRepository {

    fun saveUser(user: User)
    fun getUser()
}