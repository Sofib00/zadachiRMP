//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
//public class Main {
//    //ф-я для 1 задачи 2 файл
//    public static int maxch(int a, int b) {
//        if (a == b) {
//            throw new IllegalArgumentException("Ошибка: числа равны.");
//        }
//        return (a > b) ? a : b;
//    }
//
//    //ф-я для 2 задачи 2 файл
//    public static double divide(double a, double b) {
//        if (b == 0) {
//            throw new ArithmeticException("Ошибка: Деление на ноль недопустимо.");
//        }
//        return a / b;
//    }
//    //ф-я для 3 задачи 2 файл
//    public static int convert(String str) {
//        return Integer.parseInt(str);
//    }
//    //ф-я для 4 задачи 2 файл
//    public static int vozrast(int a){
//        if(a>0 && a<150){
//            return a;
//        }else{
//            throw new IllegalArgumentException("Возраст неверный");
//        }
//    }
//    //ф-я для 5 задачи 2 файл
//    public static double square(double num) {
//        if (num < 0) {
//            throw new IllegalArgumentException("Невозможно вычислить квадратный корень");
//        }
//        return Math.sqrt(num);
//    }
//    //ф-я для 6 задачи 2 файл
//    public static int factorial(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Факториал не определён");
//        }
//        int res = 1;
//        for (int i = 1; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }
//    //ф-я для 7 задачи 2 файл
//    public static void zeros(int[] array) {
//        for (int value : array) {
//            if (value == 0) {
//                throw new IllegalArgumentException("Массив содержит нули");
//            }
//        }
//    }
//    //ф-я для 8 задачи 2 файл
//    public static double power(double base, int exp) {
//        if (exp < 0) {
//            throw new IllegalArgumentException("Степень не может быть отрицательной");
//        }
//        return Math.pow(base, exp);
//    }
//    //ф-я для 9 задачи 2 файл
//    public static String string(String input, int len) {
//        if (len > input.length()) {
//            throw new IllegalArgumentException("Длина обрезки превышает длину строки");
//        }
//        return input.substring(0, len);
//    }
//    //ф-я для 10 задачи 2 файл
//    public static int findel(int[] arr, int t) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == t) {
//                return i;
//            }
//        }
//        throw new IllegalArgumentException("Элемент " + t+ " не найден");
//    }
//
//    //ф-я для 11 задачи 2 файл
//    public static String toBinary(int num) {
//        if (num < 0) {
//            throw new IllegalArgumentException("Число не должно быть отрицательным");
//        }
//        return Integer.toBinaryString(num);
//    }
//    //ф-я для 12 задачи 2 файл
//    public static boolean isDivisible(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль невозможно");
//        }
//        return a % b == 0;
//    }
//
//    //ф-я для 14 задачи 2 файл
//    public static void password(String password) {
//        if (password == null || password.length() < 8) {
//            throw new IllegalArgumentException("Пароль должен содержать не менее 8 символов");
//        }
//    }
//    //ф-я для 15 задачи 2 файл
//    public static void Date(String date) {
//        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate.parse(date, forma);
//    }
//    //ф-я для 16 задачи 2 файл
//    public static String concatenate(String s1, String s2) {
//        if (s1 == null || s2 == null) {
//            throw new NullPointerException("Одна из строк пустая");
//        }
//        return s1 + s2;
//    }
//    //ф-я для 17 задачи 2 файл
//    public static int ostatok(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Делить на ноль нельзя");
//        }
//        return a % b;
//    }
//    //ф-я для 19 задачи 2 файл
//    public static double toFahrenheit(double celsi) {
//        if (celsi < -273.15) {
//            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля");
//        }
//        return celsi * 9 / 5 + 32;
//    }
//    //ф-я для 20 задачи 2 файл
//    public static void checkStr(String str) {
//        if (str == null || str.isEmpty()) {
//            throw new IllegalArgumentException("Строка не может быть пустой");
//        }
//    }




//    public static void main(String[] args) {

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
//        String validString = "123";
//        String invalidString = "abc";
//        try {
//            int result = convert(validString);
//            System.out.print("Результат: " + result);
//        } catch (NumberFormatException e) {
//            System.out.print("Ошибка: строка не может быть преобразована в число.  ");
//        }
//        try {
//            int result = convert(invalidString);
//            System.out.print("Результат: " + result);
//        } catch (NumberFormatException e) {
//            System.out.print("Ошибка: строка не может быть преобразована в число.");
//        }
        //задача 4
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите возраст: ");
//        int a = scanner.nextInt();
//        try {
//            vozrast(a);
//            System.out.print(a + " - возраст");
//        } catch (IllegalArgumentException e) {
//            System.out.print(e.getMessage());
//        }
        //задача 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = scanner.nextInt();
//        try {
//            square(a);
//            System.out.print(square(a) + " - корень");
//        } catch (IllegalArgumentException e) {
//            System.out.print(e.getMessage());
//        }
        //задача 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int a = scanner.nextInt();
//        try {
//            System.out.println(factorial(a));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 7
//        try {
//            int[] array = {1, 2, 3, 0, 5};
//            zeros(array);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 8
//        try {
//            System.out.println(power(2, 3));
//            System.out.println(power(5, -2));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 9
//        try {
//            System.out.println(string("Привет", 3));
//            System.out.println(string("Привет", 15));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 10
//        try {
//            int[] arr = {1, 2, 3, 4, 5};
//            int index = findel(arr, 3);
//            System.out.println("Элемент найден на индексе: " + index);
//            findel(arr, 6);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 11
//        try {
//            System.out.println(toBinary(10));
//            System.out.println(toBinary(-5));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 12
//        try {
//            System.out.println(isDivisible(10, 2));
//            System.out.println(isDivisible(10, 0));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 14
//        try {
//            password("secure123");
//            password("123");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 15
//        try {
//            Date("25.12.2025"); // Всё хорошо
//            Date("31/02/2023"); // Исключение
//        } catch (DateTimeParseException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 16
//        try {
//            System.out.println(concatenate("Hello", "Pasha"));
//            System.out.println(concatenate(null, "fdf,l,"));
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
        //задача 17
//        try {
//            System.out.println(ostatok(10, 3));
//            System.out.println(ostatok(10, 0));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
        //задание 19
//        try {
//            System.out.println(toFahrenheit(-274));
//            System.out.println(toFahrenheit(0));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
        //задание 20
//        try {
//            checkStr("");
//            checkStr(null);
//            checkStr("Hello");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//Третий файл
//задача 1
//        class Person {
//            String name;
//            int age;
//            public Person(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//            public void display() {
//                System.out.println("Имя: " + name + ", Возраст: " + age);
//            }
//            public static void main(String[] args) {
//                Manager manager = new Manager("Паша", 48, 1000000, 843);
//                manager.display();
//            }
//        }
//class Worker extends Person {
//    double salary;
//    public Worker(String name, int age, double salary) {
//        super(name, age);
//        this.salary = salary;
//    }
//    public void display() {
//        super.display();
//        System.out.println("Зарплата: " + salary);
//    }
//}
//class Manager extends Worker {
//    int numbers;
//    public Manager(String name, int age, double salary, int numbers) {
//        super(name, age, salary);
//        this.numbers = numbers;
//    }
//    public void display() {
//        super.display();
//        System.out.println("Количество подчинённых: " + numbers);
//    }
//}
//задача 2
//interface Animal {
//    void Sound();
//}
//class Dog implements Animal {
//    public void Sound() {
//        System.out.println("гав");
//    }
//}
//class Cat implements Animal {
//    public void Sound() {
//        System.out.println("мяу");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Animal[] animals = {new Dog(), new Cat()};
//        for (Animal animal : animals) {
//            animal.Sound();
//        }
//    }
//}
//задача 3
//abstract class Transport {
//    abstract void move();
//}
//
//class Car extends Transport {
//    void move() {
//        System.out.println("Машина едет");
//    }
//}
//class Bike extends Transport {
//    void move() {
//        System.out.println("Велосипед едет.");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Transport car = new Car();
//        Transport bike = new Bike();
//        car.move();
//        bike.move();
//    }
//}
//задача 6
//class BankAccount {private String accountNumber;
//    private double balance;
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//    public void withdraw(double amount) {
//        if (amount > 0 && balance >= amount) {
//            balance -= amount;
//        }
//    }
//    public double getBalance() {
//        return balance;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("123456", 1000);
//        account.deposit(500);
//        account.withdraw(200);
//        System.out.println("Баланс: " + account.getBalance());
//    }
//}
//задача 7
//class Counter {
//    private static int count = 0;
//    public Counter() {
//        count++;
//    }
//    public static int getCount() {
//        return count;
//    }
//    public static void main(String[] args) {
//        new Counter();
//        new Counter();
//        System.out.println("Кол-во объектов: " + Counter.getCount());
//    }
//}
//задача 8
//abstract class Shape {
//    abstract double getArea();
//}
//class Circle extends Shape {
//    double radius;
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//class Rectangle extends Shape {
//    double width, height;
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//    double getArea() {
//        return width * height;
//    }
//    public static void main(String[] args) {
//        Shape circle = new Circle(5);
//        Shape rectangle = new Rectangle(4, 6);
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
//    }
//}
//задача 9
//class Animal {
//    void move() {
//        System.out.println("Животное идёт");
//    }
//}
//class Fish extends Animal {
//    void move() {
//        System.out.println("Рыба плывет");
//    }
//}
//class Bird extends Animal {
//    void move() {
//        System.out.println("Птица летит");
//    }
//}
//class Dog extends Animal {
//    void move() {
//        System.out.println("Собака бежит");
//    }
//    public static void main(String[] args) {
//        Animal[] movingAnimals = {new Fish(), new Bird(), new Dog()};
//        for (Animal animal : movingAnimals) {
//            animal.move();
//        }
//    }
//}
//задача 11
//class Product {
//    String name;
//    double price;
//    int quantity;
//
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//}
//class Store {
//    private List<Product> products = new ArrayList<>();
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//    public void removeProduct(String name) {
//        products.removeIf(product -> product.name.equals(name));
//    }
//    public Product searchProduct(String name) {
//        for (Product product : products) {
//            if (product.name.equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//    public static void main(String[] args) {
//        Store store = new Store();
//        store.addProduct(new Product("рыба", 45, 5));
//        store.addProduct(new Product("молоко", 90, 10));
//        store.addProduct(new Product("баклажан", 69, 15));
//        Product product = store.searchProduct("баклажан");
//        if (product != null) {
//            System.out.println("Найден товар: " + product.name + ", Цена: " + product.price + ", Количество: " + product.quantity);
//        }
//        store.removeProduct("рыба");
//    }
//}
//задача 12
//interface PaymentSystem {
//    void pay(double amount);
//    void refund(double amount);
//}
//class CreditCard implements PaymentSystem {
//    public void pay(double amount) {
//        System.out.println("Оплата картой. Сумма: " + amount);
//    }
//    public void refund(double amount) {
//        System.out.println("Возврат на карту. Сумма: " + amount);
//    }
//}
//class PayPal implements PaymentSystem {
//    public void pay(double amount) {
//        System.out.println("Оплата через PayPal. Сумма: " + amount);
//    }
//    public void refund(double amount) {
//        System.out.println("Возврат через PayPal. Сумма: " + amount);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        PaymentSystem paymentSystem = new PayPal();
//        paymentSystem.pay(5);
//        paymentSystem.refund(65);
//        PaymentSystem paymentSystem2 = new CreditCard();
//        paymentSystem.pay(48);
//        paymentSystem.refund(93);
//    }
//}
//задача 13
//class UniqueID {
//    private static int count = 0;
//    public static String generateID() {
//        count++;
//        return "ID" + count;
//    }
//    public static void main(String[] args) {
//        System.out.println("Уникальный идентификатор: " + UniqueID.generateID());
//        System.out.println("Уникальный идентификатор: " + UniqueID.generateID());
//    }
//}
//задача 14
//class Point {
//    int x, y;
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//class Rectangle {
//    Point pLeft;
//    Point pRight;
//    public Rectangle(Point pLeft, Point bottomRight) {
//        this.pLeft = pLeft;
//        this.pRight = bottomRight;
//    }
//    public double calculateArea() {
//        int width = Math.abs(pLeft.x - pRight.x);
//        int height = Math.abs(pLeft.y - pRight.y);
//        return width * height;
//    }
//    public static void main(String[] args) {
//        Point pLeft = new Point(6, 9);
//        Point pRight = new Point(5, 7);
//        Rectangle rectangle = new Rectangle(pLeft, pRight);
//        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
//    }
//}
//задача 16
class Matrix {
    private int[][] data;
    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
    }
    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }
    public int getElement(int row, int col) {
        return data[row][col];
    }
    public Matrix add(Matrix other) {
        int rows = data.length;
        int cols = data[0].length;
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 1);
        matrix2.setElement(0, 1, 2);
        matrix2.setElement(1, 0, 3);
        matrix2.setElement(1, 1, 4);
        Matrix sum = matrix1.add(matrix2);
        System.out.println("сложение: ");
        System.out.println(sum.getElement(0, 0) + " " + sum.getElement(0, 1));
        System.out.println(sum.getElement(1, 0) + " " + sum.getElement(1, 1));
    }
}
//задача 17
class Player {
    String name;
    int health;
    public Player(String name) {
        this.name = name;
        this.health = 100;
    }
    public void attack(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.name);
        enemy.health -= 10;
    }
    public static void main(String[] args) {
        Player player = new Player("Игрок");
        Enemy enemy = new Enemy("Противник");
        player.attack(enemy);
        System.out.println("Здоровье противника: " + enemy.health);
    }
}
class Enemy {
    String name;
    int health;
    public Enemy(String name) {
        this.name = name;
        this.health = 50;
    }
}
class Weapon {
    String type;
    public Weapon(String type) {
        this.type = type;
    }
    public void use() {
        System.out.println("Использую оружие: " + type);
    }
}
//задача 19
//class Device {
//    String brand;
//    public Device(String brand) {
//        this.brand = brand;
//    }
//    public void turnOn() {
//        System.out.println("Включено");
//    }
//    public void turnOff() {
//        System.out.println("Выключено");
//    }
//}
//class Laptop extends Device {
//    public Laptop(String brand) {
//        super(brand);
//    }
//    public void browseInternet() {
//        System.out.println("Поиск в инете");
//    }
//}
//class Smartphone extends Device {
//    public Smartphone(String brand) {
//        super(brand);
//    }
//    public void takePhoto() {
//        System.out.println("Фото сделано");
//    }
//    public static void main(String[] args) {
//        Smartphone smartphone = new Smartphone("ипхон");
//        smartphone.turnOn();
//        smartphone.takePhoto();
//    }
//}




