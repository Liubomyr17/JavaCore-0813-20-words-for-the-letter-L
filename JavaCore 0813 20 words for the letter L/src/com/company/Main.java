package com.company;

/*
0813 20 words for the letter L
Create a lot of lines (Set <String>), put in it 20 words with the letter "L".
Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The Solution class should contain only two methods.
4. The createSet () method should create and return a set of HashSet.
5. A lot of the createSet () method should contain 20 words for the letter "L".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashSet<String> createSet() {
        HashSet<String> str = new HashSet<>();
        String ms = "йфяцічувскамепинртгоьшлбщдз";
        String name = " ";

        for (int i=0; i<20; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j=0; j<5; j++) {
                int k = (int)(Math.random()*ms.length());
                sb.append(ms.charAt(k));
                name = "Л" + sb.toString();
            }
            str.add(name);
        }
        return str;
    }
        public static void main(String[] args) throws IOException {
        }
    }




