public class Main {
    public static void main(String[] args) {
        int number = 5;
        int counter = 0;

        while(number < 21) {
            if (counter == 5) {
                System.out.println("Total number of even numbers: " + counter);
                break;
            }
            if (isEvenNumber(number)) {
                counter++;
                System.out.println(number + " is even number");
            }

            number ++;
        }


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


}