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

package com.test;

import xyz.deftu.configured.Config;
import xyz.deftu.configured.options.annnotations.*;

import java.awt.*;
import java.io.File;

public class TestConfigAnnotation extends Config {
    @SwitchOption(name = "Test Switch", description = "This is a switch")
    public boolean testSwitch = false;

    @TextOption(name = "Test Text")
    public String testText = "This is a text";

    @PercentageOption(name = "Test Percentage", description = "This is a percentage", min = 0, max = 100)
    public float testPercentage = 50;

    @IntegerOption(name = "Test Integer", description = "This is an integer", min = 0, max = 10)
    public int testInteger = 5;

    @DropdownOption(name = "Test Dropdown", description = "This is a dropdown", options = {"Option 1", "Option 2", "Option 3"})
    public int testDropdown = 0;

    @ColorOption(name = "Test Color", description = "This is a color")
    public Color testColor = Color.RED;

    @FileOption(name = "Test File", description = "This is a file")
    public File testFile = new File("./config");

    @ButtonOption(name = "Test Button", description = "This is a button", text = "Click me!")
    public void button() {
        System.out.println("Button clicked!");
    }

    @OptionCategory("Category 2 Eletric Boogaloo")
    @SwitchOption(name = "Test Switch 2", description = "This is a switch, again")
    public boolean testSwitch2 = true;

    @OptionCategory("Category 2 Eletric Boogaloo")
    @ColorOption(name = "Test Color 2", description = "This is a color", alpha = true)
    public Color testColor2 = Color.RED;

    @OptionCategory("Category 2 Eletric Boogaloo")
    @TextOption(name = "Test Text 2", description = "This is a text 2", limit = 40)
    public String testText2 = "This is a text 2";

    @OptionCategory("Category 2 Eletric Boogaloo")
    @TextOption(name = "Test Text 3", description = "This is a text 3", protectedText = true)
    public String testText3 = "This is a text 3";

    public TestConfigAnnotation(File configDir) {
        super(new File(configDir, "TestMod Annotation"), "Test Mod");
    }
}
