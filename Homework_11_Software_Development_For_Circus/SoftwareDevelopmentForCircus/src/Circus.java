import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Circus<T extends CircusPerformer> {
    List<T> performers = new ArrayList<>();
    Class<T> type;

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public void removePerformer(T performer) {
        performers.remove(performer);
    }

    public List<T> listPerformers() {
        return performers;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (T performer : performers) {
                writer.write(performer.getName() + "," + performer.getAct() + "," + performer.getExperience());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    try {
                        String name = parts[0];
                        String act = parts[1];
                        int experience = Integer.parseInt(parts[2]);
                        CircusPerformer performer = new CircusPerformer(name, act, experience);
                        performers.add((T)performer);
                    } catch (InvalidExperienceException e) {
                        System.out.println("Invalid performer data: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format for experience: " + e.getMessage());
                    }
                } else {
                    System.out.println("Incorrect data format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while loading from file: " + e.getMessage());
        }
    }
}

