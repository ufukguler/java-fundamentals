package com.dersler.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * created by: ufuk on 5.11.2020 20:55
 */
public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        tryWithResource();
        multiResource();
    }

    static void tryWithResource() {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    static void multiResource() {
        try (Scanner scanner = new Scanner(new File("test.txt"));
             PrintWriter printWriter = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
                printWriter.print(line);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(e.getMessage());
        }
    }
}
