package ru.MylearnCh1J1L1;

import java.util.logging.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

//* Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

public class MainLesson2_1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(MainLesson2_1.class.getName());

        String currentPath = Paths.get("")
                .toAbsolutePath()
                .toString();

        String logsPath = currentPath + "\\mainlogs.txt";

        FileHandler fh = new FileHandler(logsPath);
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        int[] sortArray = new int[] {113, 76, 34, 5, 77, 111, 132, 1};
        System.out.println(Arrays.toString(sortArray));

        bubbleSort(sortArray, logger);
        System.out.println(Arrays.toString(sortArray));
    }

    public static void bubbleSort(int[] array, Logger logger) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.info(Arrays.toString(array));
                }
            }
        }
    }
}