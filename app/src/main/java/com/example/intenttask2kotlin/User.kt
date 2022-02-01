package com.example.intenttask2kotlin

import java.io.Serializable

class User(var name: String, var lastName: String): Serializable {

    override fun toString(): String {
        return "User(name=$name, lastName=$lastName)"
    }

}