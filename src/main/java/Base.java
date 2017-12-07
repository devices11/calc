import java.util.Scanner;

/**
 * @author Valentin Izotov
 * @see Scanner - import class for input
 */

public class base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter program:" + "\n" + "1 - Calculator" + "\n" + "2 - String array");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                calc();
                break;
            case 2:
                getMaxString();
                break;
            default:
                System.out.print("Please enter 1 or 2");
        }
    }
            //метод калькулятор
    private static double calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");   // Вывод на консоль текста Enter the first number:
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the next number: ");    //Вывод на консоль текста Enter the next number:
        double nextNumber = scanner.nextDouble(); //Ввод с консоли второго числа

        System.out.print("Enter the operation: ");
        char action = scanner.next().charAt(0);

        scanner.close(); // закрытие метода ввода

        switch (action){
            case '+':
                System.out.print("Addition: ");
                System.out.printf("%.4f", firstNumber + nextNumber);
                break;
            case '-':
                System.out.print("Subtraction: ");
                System.out.printf("%.4f", firstNumber - nextNumber);
                break;
            case '*':
                System.out.print("Multiplication: ");
                System.out.printf("%.4f", firstNumber * nextNumber);
                break;
            case '/':
                System.out.print("Division: ");
                System.out.printf("%.4f", firstNumber / nextNumber);
                break;
            default:
                System.out.print("Please enter + or - or * or / ");
        }

        return 0;
    }


//             задание 2: Поиск максимального элемента в массиве
    private static void getMaxString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array: ");
        int lengthArray = scanner.nextInt();    // задаем длинну массива

        System.out.println("Enter words: ");
        String array[] = new String[lengthArray];   // создаем массив с введенной длинной
        for (int words = 0; words < lengthArray; words++){       // наполняем массив
        array[words] = scanner.next();
        }
        scanner.close(); // закрытие метода ввода

        int maxLengthString = 0;
        for(int str = 0; str < array.length; str++) {
            if (array[str].length() > maxLengthString) {
                maxLengthString = str;
            }
        }
        System.out.println("String array: " + array[maxLengthString]);
    }
}
