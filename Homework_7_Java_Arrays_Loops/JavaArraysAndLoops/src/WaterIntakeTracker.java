public class WaterIntakeTracker {
    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};

        int totalWaterIntake = 0;
        int day = 0;

        while (day < waterIntake.length) {
            if (waterIntake[day] >= 2) {
                totalWaterIntake += waterIntake[day];
            }
            day++;
        }

        System.out.println("Сумарна кількість випитих склянок води за тиждень: " + totalWaterIntake);
    }
}