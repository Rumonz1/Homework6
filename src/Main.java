public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Задание 2
        for (int t = 10; t >= 1; t--) {
            System.out.println("Итерация цикла " + t);
        }
        //Задание 3
        for (int y = 0; y <= 17; y++)
            if (y % 2 == 0 && y != 0) {
                System.out.println("Итерация цикла чётных чисел " + y);
            }
        //Задание 4
        for (int u = 10; u >= -10; u--) {
            System.out.println("Итерация цикла " + u);
        }
        //Задание 1.2
        for (int year = 1904; year <= 2096; year = year + 4)
            if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            }
        //Задание 2.2
        for (int n = 7; n <= 98; n = n + 7) {
            System.out.println(n);
        }
        //Задание 3.2
        for (int m = 1; m <= 512; m = m * 2) {
            System.out.println(m);
        }

    }
}