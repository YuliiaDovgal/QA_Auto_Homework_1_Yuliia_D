public class StudentSearch {
    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};

        int searchID = 54321;
        boolean found = false;

        for (int id : studentIDs) {
            if (id == searchID) {
                System.out.println("Студент з номером залікової книжки " + searchID + " знайдений.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Студента з номером залікової книжки " + searchID + " не знайдено.");
        }
    }
}