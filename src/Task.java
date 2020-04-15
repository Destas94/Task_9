import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Введённые элементы массива, умноженные на 2:");
        for (int i = 0; i < size; i++) {
            array[i] = array[i]*2;
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
