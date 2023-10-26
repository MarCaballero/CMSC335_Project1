/*
 * University of Maryland Global Campus
 * CMSC 335: Object-Oriented & Concurrent Programming
 * Project 1: Inheritance
 * Professor: Andrew Seely
 * Student: Maria Caballero
 * Date: 10/25/2023
 * Program Summary:
 *          This program is designed to implement and test Java class Inheritance hierarchy that would satisfy the following 
 *          is-a and has-a relationships:
 *              ~A Shape is an object
 *              ~A TwoDimensionalShape is a Shape
 *              ~A ThreeDimensionalShape is a Shape
 *              ~A Circle is a TwoDimensionalShape
 *              ~A Square is a TwoDimensionalShape
 *              ~A Triangle is a TwoDimensionalShape
 *              ~A Rectangle is a TwoDimensionalShape
 *              ~A Sphere is a ThreeDimensionalShape
 *              ~A Cube is a ThreeDimensionalShape
 *              ~A Cone is a ThreeDimensionalShape
 *              ~A Cylinder is a ThreeDimensionalShape
 *              ~A Torus is a ThreeDimensionalShape
 *              ~A Shape has a NumberofDimensions
 *              ~A TwoDimensionalShape has an area
 *              ~A ThreeDimensionalShape has a volume
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DisplayMenu menu = new DisplayMenu();
        menu.displayMenu();
        int choice = 0;
        // check that the user has entered a valid choice
        try {
            choice = input.nextInt();
            String response = "";
            // while the user input is not 10 we will call the java classes as needed
            while(choice != 10){
                switch (choice) {
                    // case 1 is for Circle where classes will be called as needed for this specific shape
                    case 1:
                        System.out.println("You have selected a Circle!");
                        System.out.println("Enter the radius of the circle: ");
                        double radius = input.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.println("The area of the Circle is " + circle.getArea());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 2 is for Square where classes will be called as needed for this specific shape
                    case 2:
                        System.out.println("You have selected a Square!");
                        System.out.println("Enter the length of the side of the square: ");
                        double length = input.nextDouble();
                        Square square = new Square(length);
                        System.out.println("The area of the Square is " + square.getArea());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 3 is for Triangle where classes will be called as needed for this specific shape
                    case 3:
                        System.out.println("You have selected a Triangle!");
                        System.out.println("Enter the base of the triangle: ");
                        double base = input.nextDouble();
                        System.out.println("Enter the height of the triangle: ");
                        double height= input.nextDouble();
                        Triangle triangle = new Triangle(base, height);
                        System.out.println("The area of the Triangle is " + triangle.getArea());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                        
                    // case 4 is for Rectangle where classes will be called as needed for this specific shape
                    case 4:
                        System.out.println("You have selected a Rectangle!");
                        System.out.println("Enter the length of the side of the rectangle: ");
                        double length2 = input.nextDouble();
                        System.out.println("Enter the width of the rectangle: ");
                        double width = input.nextDouble();
                        Rectangle rectangle = new Rectangle(length2, width);
                        System.out.println("The area of the Rectangle is " + rectangle.getArea());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 5 is for Sphere where classes will be called as needed for this specific shape
                    case 5:
                        System.out.println("You have selected a Sphere!");
                        System.out.println("Enter the radius of the sphere: ");
                        double radius2 = input.nextDouble();
                        Sphere sphere = new Sphere(radius2);
                        System.out.println("The volume of the Sphere is " + sphere.getVolume());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 6 is for Cube where classes will be called as needed for this specific shape
                    case 6:
                        System.out.println("You have selected a Cube!");
                        System.out.println("Enter the length of the side of the cube: ");
                        double length3 = input.nextDouble();
                        Cube cube = new Cube(length3);
                        System.out.println("The volume of the Cube is " + cube.getVolume());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 7 is for Cone where classes will be called as needed for this specific shape
                    case 7:
                        System.out.println("You have selected a Cone!");
                        System.out.println("Enter the radius of the cone: ");
                        double radius3 = input.nextDouble();
                        System.out.println("Enter the height of the cone: ");
                        double height2 = input.nextDouble();
                        Cone cone = new Cone(radius3, height2);
                        System.out.println("The volume of the Cone is " + cone.getVolume());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 8 is for Cylinder where classes will be called as needed for this specific shape
                    case 8:
                        System.out.println("You have selected a Cylinder!");
                        System.out.println("Enter the radius of the cylinder: ");
                        double radius4 = input.nextDouble();
                        System.out.println("Enter the height of the cylinder: ");
                        double height3 = input.nextDouble();
                        Cylinder cylinder = new Cylinder(radius4, height3);
                        System.out.println("The volume of the Cylinder is " + cylinder.getVolume());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                    // case 9 is for Torus where classes will be called as needed for this specific shape
                    case 9:
                        System.out.println("You have selected a Torus!");
                        System.out.println("Enter the radius of the torus: ");
                        double radius5 = input.nextDouble();
                        System.out.println("Enter the inner radius of the torus: ");
                        double innerRadius = input.nextDouble();
                        Torus torus = new Torus(radius5, innerRadius);
                        System.out.println("The volume of the Torus is " + torus.getVolume());
                        // At the end we ask users if they want to proceed with the program
                        System.out.println("Would you like to continue? (y/n): ");
                        response = input.next();
                        break;
                }
                // checking that the user entered a valid response and if not making the user enter the response again
                if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                    // if the user enters a valid response, we will display menu again
                    menu.displayMenu();
                    choice = input.nextInt();
                } else if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")) {
                    // if the user enters a valid response, we will exit the program
                    break;
                } else {
                    // if the user enters an invalid response, display an error message and display menu again
                    System.out.println("Please enter a valid response (y or n).");
                    response = input.next();
                    if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                    // if the user enters a valid response, we will display menu again
                        menu.displayMenu();
                        choice = input.nextInt();
                    }
                }
            }
        }catch (InputMismatchException e) {
            // if the user input is not a number, display an error message and display menu again
            System.out.println("Please enter a valid choice.");
            menu.displayMenu();
        }

        // Setting my time formatter to display the month, day and time in the correct format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        input.close();
        System.out.println("Thank you for using this program!");
        System.out.println("\t Date: " + LocalDateTime.now().format(formatter));
    }
}