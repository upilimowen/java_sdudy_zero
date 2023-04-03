package ru.MylearnCh1J1L1;
import java.util.*;

public class MainLesson3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        randFillList(20, 100, intList);

        printArrayList(", ", intList);

        removeEven(intList);
        printArrayList(", ", intList);
    }

    public static void removeEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void printArrayList(String sep, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i));
                break;
            }
            System.out.print(list.get(i) + sep);
        }
    }

    public static void randFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }
}