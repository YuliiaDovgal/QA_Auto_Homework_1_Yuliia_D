import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть тип страви (1 - закуска, 2 - основна страва, 3 - десерт, 4 - напій): ");
        int dishType = scanner.nextInt();
        String dish;

        switch (dishType) {
            case 1:
                dish = "Закуска: Грецький салат";
                break;
            case 2:
                dish = "Основна страва: Грибний крем суп";
                break;
            case 3:
                dish = "Десерт: Тарт з яблуками ";
                break;
            case 4:
                dish = "Напій: Лимонад";
                break;
            default:
                dish = "Невірний вибір. Будь ласка, оберіть число від 1 до 4.";
                break;
        }

        System.out.println(dish);

        }
    }


