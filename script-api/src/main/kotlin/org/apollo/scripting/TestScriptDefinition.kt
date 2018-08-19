package org.apollo.scripting

import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.annotations.KotlinScriptFileExtension

@KotlinScript
@KotlinScriptFileExtension("test.kts")
abstract class TestScriptDefinition(val name: String) {
    fun printName() {
        println(name)
    }
}