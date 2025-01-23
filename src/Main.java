//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    //ф-я для 1 задачи 2 файл
    public static int maxch(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Ошибка: числа равны.");
        }
        return (a > b) ? a : b;
    }

    //ф-я для 2 задачи 2 файл
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль недопустимо.");
        }
        return a / b;
    }

    public static void main(String[] args) {

        //первый файл
        //задача 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        if(num%2==0)
//        {
//            System.out.print("число четное");
//        }else{
//            System.out.print("число нечетное");
//        }
        //задача 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.print("Введите третье число: ");
//        int c = scanner.nextInt();
//        if(a>b&&a>c){
//            System.out.print(a+" - большее из чисел");
//        }else if(b>a && b>c){
//            System.out.print(b+" - большее из чисел");
//        }else{
//            System.out.print(c+" - большее из чисел");
//        }
        //задача 3
//        int num = 5;
//        for(int i = 1; i<11; i++){
//            System.out.print(num + " * " + i +" = " + (num*i) + " ");
//        }
        //задача 4
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число для суммы чисел: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i<n+1; i++){
//            sum+=i;
//        }
//        System.out.print(sum + " - сумма чисел");
        //задача 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите кол-во чисел Фибоначчи: ");
//        int n = scanner.nextInt();
//        int a = 0;
//        int b = 1;
//        for(int i =1; i<n+1; i++){
//            System.out.print(a+" ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
        //задача 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//        if (n <= 1) {
//            System.out.println("Число не простое");
//        } else {
//            boolean flag = true;
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println("Число простое");
//            } else {
//                System.out.println("Число не простое");
//            }
//        }
        //задача 7
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//        for(int i = n; i>0; i--){
//            System.out.print(i + " ");
//        }
        //задача 8
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("введите начало диапазона: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int B = scanner.nextInt();
//        int sum = 0;
//        if(A>B){
//            System.out.print("начало диапазона не может быть больше конца");
//        }else{
//            for(int i = A; i<=B; i++){
//                if(i%2==0){
//                    sum+=i;
//                }
//            }
//            System.out.print(sum + " - сумма нечетных чисел");
//        }
        //задача 9
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        StringBuilder rev = new StringBuilder(str);
//        rev.reverse();
//        System.out.println(rev.toString());
        //задача 10
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        String str = scanner.nextLine();
//        System.out.print(str.length());
        //задача 11
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число для нахождения факториала: ");
//        int a = scanner.nextInt();
//        int f = 1;
//        for(int i=1; i<a+1; i++){
//            f*=i;
//        }
//        System.out.print(f);
        //задача 12
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        String num = scanner.nextLine();
//        int sum = 0;
//        for (int i = 0; i < num.length(); i++) {
//            char c = num.charAt(i);
//            if (Character.isDigit(c)) {
//                sum += c - '0';
//            }
//        }
//        System.out.println("Сумма цифр числа: " + sum);
        //задача 13
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        String normstr = str.toLowerCase().replaceAll("\\s+", "");
//        int left = 0;
//        int right = normstr.length() - 1;
//        boolean isPalindrom = true;
//        while (left < right) {
//            if (normstr.charAt(left) != normstr.charAt(right)) {
//                isPalindrom = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if (isPalindrom) {
//            System.out.println("палиндром");
//        } else {
//            System.out.println("не палиндром");
//        }
        //задача 14
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] arr=new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        int max = 0;
//        for(int i = 0; i<size; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.print(max);
        //задача 15
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] arr=new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for(int i = 0; i<size; i++){
//            sum+=arr[i];
//        }
//        System.out.print(sum);
        //задание 16
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] arr=new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Элемент " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        int sump = 0;
//        int summ = 0;
//        for(int i = 0; i<size; i++){
//            if(arr[i]>0){
//                sump+=arr[i];
//            }else{
//                summ+=arr[i];
//            }
//        }
//        System.out.print(sump + " - сумма положительных чисел ");
//        System.out.print(summ + " - сумма отрицательных чисел");
        //задача 17
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("введите начало диапазона: ");
//        int A = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int B = scanner.nextInt();
//        for(int n = A; n<=B; n++){
//            boolean flag = true;
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println(n + " - число простое");
//            }
//        }
        //задача 18
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine().toLowerCase();
//        int vCount = 0;
//        int cCount = 0;
//        for (char ch : str.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if ("аеёиоуэюяы".indexOf(ch) != -1) {
//                    vCount++;
//                } else {
//                    cCount++;
//                }
//            }
//        }
//        System.out.print("Количество гласных: " + vCount);
//        System.out.print("Количество согласных: " + cCount);
        //задача 19
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        String[] words = str.split(" ");
//        StringBuilder rev = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            rev.append(words[i]);
//            if (i != 0) {
//                rev.append(" ");
//            }
//        }
//        System.out.print(rev.toString());
        //задача 20
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int num = scanner.nextInt();
//        int originalnum = num;
//        int sum = 0;
//        int digits = String.valueOf(num).length();
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, digits);
//            num /= 10;
//        }
//        if (sum == originalnum) {
//            System.out.print(originalnum + " является числом Армстронга.");
//        } else {
//            System.out.print(originalnum + " не является числом Армстронга.");
//        }

        //второй файл
        //задача 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        int b = scanner.nextInt();
//        try {
//            int max = maxch(a, b);
//            System.out.println("Максимальное число: " + max);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        //задача 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите делимое: ");
//        double a = scanner.nextDouble();
//        System.out.print("Введите делитель: ");
//        double b = scanner.nextDouble();
//        try {
//            double result = divide(a, b);
//            System.out.println("Результат деления: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        //задача 3
        git add .git commit -m "Merge changes from remote repository"
    }
}