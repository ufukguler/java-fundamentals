package com.dersler.basics;

/**
 * created by: ufuk on 5.11.2020 21:09
 */
public class TryWithResourcesAutoCloseable implements AutoCloseable {
    public TryWithResourcesAutoCloseable() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        try (TryWithResourcesAutoCloseable fr = new TryWithResourcesAutoCloseable();) {

            fr.test();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally block");
        }
    }

    private void test() {
        System.out.println("test method");
    }

    @Override
    public void close() throws Exception {
        System.out.println("resource closed");
    }
}
