public class EnhancedLoop {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min = 0;
        int max = 100;
        int sum = 0;
        int smallestNumber = max;
        double average;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min));
        }

        for (int value : array) {
            System.out.println(value);
        }

        for (int value : array) {
            if (value < smallestNumber) {
                smallestNumber = value;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);

        for (int value : array) {
            sum += value;
        }

        System.out.println("Sum: " + sum);

        average = (double) (sum / 20);
        System.out.println("Average: " + average);
    }
}