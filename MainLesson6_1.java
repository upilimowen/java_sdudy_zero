package ru.MylearnCh1J1L1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainLesson6_1 {
    public static void main(String[] args) {

        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Laptop("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Laptop("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Laptop("Notebook 4", 64, "linux", 90000, "Lenovo"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}