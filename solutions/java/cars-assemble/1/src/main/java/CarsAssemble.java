public class CarsAssemble {
    // Method to calculate the production rate of working cars per hour
    public static double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0.0;
        }

        // Calculate total cars produced per hour
        double totalCarsPerHour = speed * 221.0;

        // Determine the success rate based on the speed
        double successRate;
        if (speed >= 1 && speed <= 4) {
            successRate = 1.0; // 100% success rate
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9; // 90% success rate
        } else if (speed == 9) {
            successRate = 0.8; // 80% success rate
        } else { // speed == 10
            successRate = 0.77; // 77% success rate
        }

        // Return the working cars per hour
        return totalCarsPerHour * successRate;
    }

    // Method to calculate the production rate of working cars per minute
    public static int workingItemsPerMinute(int speed) {
        double workingCarsPerHour = productionRatePerHour(speed);
        // Convert to working cars per minute and cast to int
        return (int) (workingCarsPerHour / 60.0);
    }
}