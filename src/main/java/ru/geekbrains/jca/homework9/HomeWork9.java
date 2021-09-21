package ru.geekbrains.jca.homework9;

public class HomeWork9 {
    public static void main(String[] args) {

        String [][] arr1 = new String[4][4];
        arr1[0][0] = "1";
        arr1[0][1] = "1";
        arr1[0][2] = "1";
        arr1[0][3] = "1";
        arr1[1][0] = "1";
        arr1[1][1] = "1";
        arr1[1][2] = "1";
        arr1[1][3] = "ggvdfgb";
        arr1[2][0] = "1";
        arr1[2][1] = "1";
        arr1[2][2] = "3";
        arr1[2][3] = "3";
        arr1[3][0] = "1";
        arr1[3][1] = "1";
        arr1[3][2] = "1";
        arr1[3][3] = "1";



        print2dArray(arr1); // Для проверки момента поимки Exception

        method2dArray(arr1);

        System.out.println("\n");

        print2dArray(arr1); // Для проверки момента поимки Exception


    }

    static void method2dArray(String[][] arr) {
        int  Sum = 0;

        if (arr.length != 4 ) {                           // MyArraySizeException
            throw new MyArraySizeException();
        }
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (arr[y].length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }

        for (int y = 0; y < arr.length; y++) {            // Преобразование в элеменов массива в int и сложение всех элементов, MyArrayDataException
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    int element = Integer.parseInt(arr[y][x]); // Преобразование в элеменов массива в int
                    Sum = Sum + element;                  // Суммирование элементов массива
                } catch (NumberFormatException exception) {
                    System.out.println("In element Array [" + y + "][" + x + "] conversion failed"); // 1 вариант. Вывод в консоль номера элемента массива в котором не удалось преобразование в инт
                    throw new MyArrayDataException("In element Array [" + y + "][" + x + "] conversion failed"); // 2 вариант. Вывод сообщения с номером элемента массива в котором не удалось преобразование в инт
                }
            }
        }

        System.out.println("Sum of element 2d Array = " + Sum); // Вывод суммы всех элементов массива

    }

    static void  print2dArray(String[][] arr) { // метод вывода 2д массива для проверки момента поимки Exception
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
    }



}
