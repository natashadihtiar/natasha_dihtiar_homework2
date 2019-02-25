package natashadihtiar;


import java.util.Scanner;

public class Main {


    private static void Example_2() {
        // Создаём экземпляр класса Scanner для считывания данных, введенных пользователем
        System.out.println("\nПример 2\n");

        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.println("В каком году была основана Одесса? ");

        number = scanner.nextDouble();
        if (number == 1794)
            System.out.println("Правильно, Одесса была основана в 1794 году.");
        else
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году. ");

    }

    private static void Example_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПример 1\n");

        double number1, number2;
        double result;

        System.out.println("Введите делимое: ");
        number1 = scanner.nextDouble();

        System.out.println("Введите делитель: ");
        number2 = scanner.nextDouble();

        if (number2 == 0)
            System.out.println("Делитель не может равняться нулю!");

        else {
            result = number1 / number2;
            System.out.println(number1 + " : " + number2 + " = " + result);
        }

    }
    private static void Example_3() {
        System.out.println("\nПример 3\n");
        Scanner scanner = new Scanner(System.in);

        double sum;
        Scanner scanner = new Scanner(System.in);

        double c = 0;
        System.out.println("Введите стоимость покупки ");
        sum = scanner.nextInt();
        if (sum > 1000) {
            c = sum * 0.95;
            System.out.println("Стоимость покупки с учетом скидки 5% составляет: " + c);
        }
        else
            if (sum > 500) {
                c = sum * 0.97;
                System.out.println("Стоимость покупки с учетом скидки 3% составляет: " + c);
            }
            else
                if (sum <= 500 && sum > 0)
                    System.out.println("Скидки нет! Стоимость покупки составляет: " + sum);
                else
                    System.out.println("Введено некорректное значение суммы покупки!");
    }

    private static void Example_4() {
        System.out.println("\nПример 4\n");
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Введите число, чтобы проверить является ли оно целым: ");
        number = scanner.nextInt();

        if(number%2==0){
            System.out.println("Число: " +  number + " четное.");}

        else
            System.out.println("Число: " + number + " нечетное.");}


    private static void Example_5() {
        System.out.println("\nПример 5\n");
        Scanner scanner = new Scanner(System.in);

        double number, difference;

        System.out.println("Введите число, чтобы проверить леится ли оно нацело на 3: ");
        number = scanner.nextDouble();

        if(number%3==0){

            difference = number/3;
            System.out.println("Число: " +  number + " на три делится нацело = " + difference);}

        else
            System.out.println("Число: " + number + " на 3 нацело не делится.");
    }



    private static void Example_7() {
        System.out.println("\nПример 7\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое трехзначное число: ");

        int hundreds = 0, decimals = 0, ones = 0;
        ones = number%10;
        decimals = number/10%10;
        hundreds = number/100%10;
        System.out.println(ones > hundreds ? "Последняя цифра больше первой" : (ones < hundreds ? "Первая цифра больше последней" : "Первая цифра равна последней"));
        System.out.println(decimals > hundreds ? "Вторая цифра больше первой" : (decimals < hundreds ? "Первая цифра больше второй" : "Первая цифра равна второй"));
        System.out.println(ones < decimals ? "Вторая цифра больше последней" : (ones > decimals ? "Последняя цифра больше второй" : "Последняя цифра равна второй"));
        System.out.println();
    }


    private static void Example_8() {
        System.out.println("\nПример 8\n");
        Scanner scanner = new Scanner(System.in);

        int number, square, cube;

        int hundreds = 0, decimals = 0, ones = 0;

        System.out.println("Введите целое трехзначное число: ");
        number = scanner.nextInt();
        ones = number / 1 % 10;
        decimals = number / 10 % 10;
        hundreds = number / 100 % 10;

        square = (int) Math.pow (number, 2);
        cube = (int) Math.pow(ones, 3) + (int) Math.pow(decimals,3) + (int) Math.pow( hundreds, 3 );

        if( square == cube){
            System.out.println("Квадрат числа: " + number + " равен сумме кубов его цифр ");}

        else
            System.out.println("Квадрат числа: " + number + " не равен сумме кубов его цифр ");

    }

    private static void Example_9() {
        System.out.println("\nПример 9\n");
        Scanner scanner = new Scanner(System.in);

        double number1, number2;
        double sum, comp;

        System.out.println("Введите два числа, которые не равны между собой");
        System.out.println("Введите первое число: ");
        number1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        number2 = scanner.nextDouble();

        sum = (number1+number2)/2;
        comp = (number1 * number2)*2;

        if( number1 < number2 ) {
            number1 = sum;
            number2 = comp;
            System.out.println("Первое число равно половине суммы данных чисел = " + sum+ " а второе число равно удвоенному произведению данных чисел = " + comp);
        }

        else  {
            number1 = comp;
            number2 = sum;
            System.out.println("Первое число равно удвоенному произведению данных чисел = " + comp + " а второе число равно половине суммы данных чисел = " + sum);
        }}



    private static void Example_6() {
        System.out.println("\nПример 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nСтоимость 1 минуты разговора = 2 гривны.");

        Scanner sscanner = new Scanner(System.in);

        int minute;
        double price, sum;
        System.out.println("\nВведите количество минут (целое число):\n");
        minute = sscanner.nextInt();

        System.out.println("\nВведите номер дня недели: 1-2-3-4-5-6-7\n");
        String myDay = scanner.next();

        price = minute*2;

        int day = Integer.parseInt(myDay);

        if(day==6 || day==7) {

            System.out.println("\nПредоставляется скидка 20%\n");
            sum = price - ((price * 20) / 100);
            System.out.println("Стоимость разговора: " + sum);
        }

        else
        {
            System.out.println("\nСкидка не предоставляется");
            System.out.println("\nСтоимость разговора: " + price);
        }
    }


    private static void Example_10() {
        System.out.println("\nПример 10");
        System.out.println("\n Решение уравнения вида: ax^3 + bх = 0 для произвольных а, b. ");
        Scanner scanner = new Scanner(System.in);

        double a, b;
        double x1, x2, x3;
        double difference;


        System.out.println("\n Введите значение а: ");
        a = scanner.nextDouble();

        System.out.println("\n Введите значение b: ");
        b = scanner.nextDouble();

        x1 = 0;
        difference = - b - a;
        if (difference > 0) {
            x2 = Math.sqrt(difference);
            x3 = -Math.sqrt(difference);
            System.out.println("\n Корни уравнения: x1 = " + x1 + "; x2 =  " + x2 + "; x3 = " + x3);
        } else if (difference == 0) {
            x2 = 0;
            System.out.println("\n Корни уравнения: x1 =  " + x1 + "; x2 =  " + x2);
        } else
            System.out.println("\n  Корень уравнения: x1 = " + x1);
    }


    public static void main(String[] args) {
        Example_1();
        Example_2();
        Example_3();
        Example_4();
        Example_5();
        Example_6();
        Example_7();
        Example_8();
        Example_9();
        Example_10();
    }
}
