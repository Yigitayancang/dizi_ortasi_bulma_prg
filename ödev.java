public class ödev{
    public static void main(String[] args) {
        double[] numbers = {2.0, 4.0, 6.0, 8.0}; 
        double sumOfReciprocals = 0.0;
        for (double number : numbers) {
            sumOfReciprocals += 1.0 / number;
        }
        double harmonicMean = numbers.length / sumOfReciprocals;
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
