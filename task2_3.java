//Write a program to print the area and perimeter of a rectangle. 
import java.util.Scanner;
public class task2_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");//5.5
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");//8.5
        double height = sc.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area="+ area);
        System.out.println("Perimeter=" + perimeter);
        sc.close();
    }
}
