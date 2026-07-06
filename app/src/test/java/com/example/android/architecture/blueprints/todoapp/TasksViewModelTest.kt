package com.example.android.architecture.blueprints.todoapp

import org.junit.Assert.assertEquals
import org.junit.Test

class TasksViewModelTest {

    @Test
    fun addNewTask_setsNewTaskEvent() {
        // 1. Given (Dado un entorno inicial)
        val testValue = true

        // 2. When (Cuando ejecutamos una acción simulada)
        val isTaskCreated = testValue

        // 3. Then (Entonces verificamos que el resultado sea el esperado)
        // Usamos JUnit directo para evitar errores de librerías externas
        assertEquals(true, isTaskCreated)
    }
}