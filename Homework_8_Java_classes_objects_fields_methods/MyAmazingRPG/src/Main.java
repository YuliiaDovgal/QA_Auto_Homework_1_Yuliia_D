public class Main {
    public static void main(String[] args) {

        Character ladyIronHeart = new Character("Lady Iron Heart", 20, 20, 10);
        Character invisibleWoman = new Character("Invisible Woman", 20, 15, 10);


        ladyIronHeart.displayStatus();
        invisibleWoman.displayStatus();

        while (ladyIronHeart.isAlive() && invisibleWoman.isAlive()) {
            ladyIronHeart.attack(invisibleWoman);
            if (invisibleWoman.isAlive()) {
                invisibleWoman.attack(ladyIronHeart);
            }

            ladyIronHeart.displayStatus();
            invisibleWoman.displayStatus();
        }

        if (ladyIronHeart.isAlive()) {
            System.out.println(ladyIronHeart.name + " перемогла Invisible Woman!");
        } else {
            System.out.println(invisibleWoman.name + " перемогла Lady Iron Heart!");
        }

        System.out.println("Загальна кількість створених персонажів: " + Character.characterCount);
    }
}

