package shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle's color : ");
        String color = scanner.nextLine();
        System.out.println("Enter triangle's side1 : ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter triangle's side2 : ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter triangle's side3 : ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle.toString());
    }
}
