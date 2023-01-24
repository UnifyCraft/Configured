/*
 * This file is a part of the Configured library
 * Copyright (C) 2023 Deftu (https://deftu.xyz)
 *
 * DO NOT remove or alter copyright notices, or remove this file header.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.test

import xyz.deftu.configured.Config
import xyz.deftu.configured.options.dsl.*
import java.awt.Color
import java.io.File
import kotlin.properties.Delegates

class TestConfigDsl(
    configDir: File
) : Config(
    directory = File(configDir, "TestMod DSL"),
    title = "Test Mod"
) {
    var testSwitch = false
    var testText = ""
    var testPercentage = 0f
    var testInteger = 0
    lateinit var testColor: Color
    lateinit var testFile: File

    init {
        switch(::testSwitch, false) {
            name = "Test Switch"
            description = "This is a switch"
        }

        text(::testText, "This is a text") {
            name = "Test Text"
            description = "This is a text field"
        }

        percentage(::testPercentage, 50f) {
            name = "Test Percentage"
            description = "This is a percentage"
            min = 0
            max = 100
        }

        integer(::testInteger, 5) {
            name = "Test Integer"
            description = "This is an integer"
            min = 0
            max = 10
        }

        color(::testColor, Color.RED) {
            name = "Test Color"
            description = "This is a color"
        }

        file(::testFile, File("./config")) {
            name = "Test File"
            description = "This is a file"
        }
    }
}
