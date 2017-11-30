package com.example.alumno.master1.dummy

import com.example.alumno.master1.Contactos
import com.example.alumno.master1.Leer
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.ArrayList
import java.util.HashMap

object DummyContent {

    val ITEMS: MutableList<DummyItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    init {}

    fun clearItems() {
        ITEMS.clear()
    }

    fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id,item)
    }

    fun createDummyItem(c : Contactos ): DummyItem {
        return DummyItem(c.nombre, "" + c.telefono, makeDetails(c))
    }

    private fun makeDetails(c: Contactos): String {
        val builder = StringBuilder()
        builder.append("Numero de telefono de "+c.nombre + " \n\n - ").append(c.telefono)
        return builder.toString()
    }

    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}

