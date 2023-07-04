import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double number = 3.176987;
        int tempNumber = (int) (number * 1000);
        System.out.println(tempNumber);
        double newNumber1 = tempNumber;
        double newNumber = (newNumber1 / 1000);

        System.out.println(newNumber);
    }
}