public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        anotherHouse.setColor("yellow");

        System.out.println("Color of the blueHouse is: " + blueHouse.getColor());
    }
}