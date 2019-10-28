/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        try {
            final int max_loteria = 49;
            final int min_loteria = 1;

            int valor = RND.nextInt(max_loteria - min_loteria + 1) + min_loteria;

            System.out.print("Numero primitiva.......:");
            int talla = SCN.nextInt();
            //mensaje
            System.out.printf("Numero primitiva......: %s%n", talla);
        } catch (Exception e) {
            final int max_loteria = 49;
            final int min_loteria = 1;

            int loteria = RND.nextInt(max_loteria - min_loteria + 1) + min_loteria;

            System.out.println("ERROR: Entrada incorrecta");
        } finally {
            //borrar buffer
            SCN.nextLine();
        }
    }
}
