package Question_3;

import java.util.Scanner;
import java.util.Arrays;

public class question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number_lines = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int number_columns = scanner.nextInt();
        int[][] a = new int[number_lines][number_columns];
        System.out.println("Enter values in the matrix: ");
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter k: "); //диапазон ввода [от 0; до number_lines-1]
        int k = scanner.nextInt(); // к-я строка
        System.out.println("Find the lines k: ");
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                System.out.println(a[k][j] + "\t"); //вывод столбцов при заданном k
            }
            System.out.println();
        }
        System.out.println("Find the columns p: "); //диапазон ввода [от 0; до number_columns-1]
        System.out.print("Enter p: ");
        int p = scanner.nextInt(); // p-й столбец
        for (int i = 0; i < number_lines; i++) {
            for (int j = 0; j < number_columns; j++) {
                System.out.println(a[j][p] + "\t"); //вывод столбцов при заданном р
            }
            System.out.println();
        }
    }
}



