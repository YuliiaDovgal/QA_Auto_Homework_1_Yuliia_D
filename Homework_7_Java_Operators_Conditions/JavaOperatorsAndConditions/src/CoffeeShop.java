import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ціни на напої
        int priceEspresso = 3;
        int priceLatte = 4;
        int priceCappuccino = 5;

        // Запитуємо кількість кожного напою
        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();

        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();

        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        // Розраховуємо загальну вартість замовлення
        int totalCost = (espresso * priceEspresso) + (latte * priceLatte) + (cappuccino * priceCappuccino);

        // Виводимо загальну вартість замовлення
        System.out.println("Загальна вартість замовлення: " + totalCost + " доларів");
    }
}

