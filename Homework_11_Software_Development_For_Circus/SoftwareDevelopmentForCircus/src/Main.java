public class Main {
    public static void main(String[] args) {
        Circus<CircusPerformer> circus = new Circus<>();

        circus.loadFromFile("MyCircus.txt");

        circus.listPerformers().forEach(performer ->
            System.out.println("Performer: " + performer.getName() + ", Act: " + performer.getAct() + ", Experience: " + performer.getExperience() + " years"));

    }
}


