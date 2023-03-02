package main;

import persistance.JpaPersistence;

public class App {

    public static void main(String[] args) {

        JpaPersistence jpaPersistence = new JpaPersistence();

        jpaPersistence.getEm().clear();

    }
}
