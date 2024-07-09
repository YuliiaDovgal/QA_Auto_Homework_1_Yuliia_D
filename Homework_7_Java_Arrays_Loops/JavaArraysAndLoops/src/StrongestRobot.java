public class StrongestRobot {
    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350};

        int maxWeight = weights[0];
        int strongestRobotIndex = 0;

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                strongestRobotIndex = i;
            }
        }

        int strongestRobotNumber = strongestRobotIndex + 1;

        System.out.println("Найсильніший робот - номер " + strongestRobotNumber + ", який підняв " + maxWeight + " кг.");
    }
}