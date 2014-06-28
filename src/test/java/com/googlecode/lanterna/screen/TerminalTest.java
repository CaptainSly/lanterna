/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 *
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010-2014 Martin
 */
package com.googlecode.lanterna.screen;

import com.googlecode.lanterna.TestTerminalFactory;
import java.io.IOException;

/**
 *
 * @author martin
 */
public class TerminalTest {

    public static void main(String[] args) throws IOException {
        Screen screen = new TestTerminalFactory(args).createScreen();
        ScreenWriter writer = new ScreenWriter(screen);
        screen.startScreen();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("Hello world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString(" ello world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("  llo world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("   lo world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("    o world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("      world!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("       orld!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("        rld!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("         ld!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("          d!");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("           !");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        writer.setPosition(10, 10).putString("            ");
        screen.refresh();
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
        }
        screen.stopScreen();
    }
}
