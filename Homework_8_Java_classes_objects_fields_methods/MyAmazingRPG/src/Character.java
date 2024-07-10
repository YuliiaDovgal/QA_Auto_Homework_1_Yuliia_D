public class Character {

    String name;
    int health;
    int strength;
    int defense;
    static int characterCount = 0;


    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }


    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
        other.takeDamage(damage);
        System.out.println(this.name + " атакує " + other.name + " та завдає " + damage + " шкоди.");
    }


    public void takeDamage(int damage) {
        this.health -= damage;
    }

    
    public boolean isAlive() {
        return this.health > 0;
    }


    public void displayStatus() {
        System.out.println("Ім'я: " + this.name + ", Здоров'я: " + this.health + ", Сила: " + this.strength + ", Захист: " + this.defense);
    }
}



