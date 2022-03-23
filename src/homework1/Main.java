package homework1;

public class Main {

    public static void main(String[] args) {
        printThreeWorlds();
        chekSumSign();
        printColor ();
        compareNumbers ();
    }

    public static void printThreeWorlds () {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void chekSumSign () {
        int a = 3;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int value = 23;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println ("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers () {
        int a = 5;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

