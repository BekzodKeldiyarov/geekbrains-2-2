package com.bekzodkeldiyarov.geekbrains;

public class Main {
    public static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"}};

// ----------------------------------------------------------
        String[][] arrayDateException = new String[][]{
                {"fhfhhfh12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"}};

//  ----------------------------------------------------------
        String[][] arraySizeException = new String[][]{
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"},
                {"12", "34", "56", "78"}};
//  ---------------------------------------------------------
        twoDimensionArray(array);
//        Разкомментируйте строчку ниже чтобы проверить задачу на ArraySizeException
//        twoDimensionArray(arraySizeException);
//        Разкомментируйте строчку ниже чтобы проверить задачу на ArrayDateException
//        twoDimensionArray(arrayDateException);
    }

    public static void twoDimensionArray(String[][] array) {
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException("Размер массива должен быть равен " + ARRAY_SIZE);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                try {
                    int a = Integer.parseInt(array[i][j]);
                    sum += a;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно элемент " + array[i][j] + " конвертировать в число");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        System.out.println("Сумма всех чисел массива равна: " + sum);
    }


}
