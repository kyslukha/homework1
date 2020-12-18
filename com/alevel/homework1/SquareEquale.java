package com.alevel.homework1;

public class SquareEquale {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 6;
        int discriminant = b * b - (4 * c * a);
        if (discriminant < 0) System.out.println("No solutions");
        else {
            if (discriminant == 0) System.out.println("Solution is " + (-b / (2 * a)));
            else {
                System.out.println("Solution are ");
                System.out.println((-b + Math.sqrt(discriminant)) / (2 * a));
                System.out.println((-b - Math.sqrt(discriminant)) / (2 * a));
            }
        }
    }
}
