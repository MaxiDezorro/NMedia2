package ru.netology.nmedia2.util

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

object SringArg : ReadWriteProperty<Bundle, String?> {
    override fun getValue(thisRef: Bundle, property: KProperty<*>): String? {
        return thisRef.getString(property.name)
    }

    override fun setValue(thisRef: Bundle, property: KProperty<*>, value: String?) {
        return thisRef.putString(property.name, value)

    }

}