public class Average {
// main methode
    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;
// loop
        for (double num: numArray) {
           sum += num;
        }
        // using formula of average

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
