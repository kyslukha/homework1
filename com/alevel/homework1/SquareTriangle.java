package com.alevel.homework1;

public class SquareTriangle {
    public static void main(String[] args) {
        int[] point1 = {2,9};
        int[] point2 = {5,13};
        int[] point3 = {0,23};
        double sideA = Math.sqrt((point1[0]-point2[0])*(point1[0]-point2[0])+(point1[1]-point2[1])*(point1[1]-point2[1])) ;
        double sideB = Math.sqrt((point2[0]-point3[0])*(point2[0]-point3[0]) + (point2[1]-point3[1])*(point2[1]-point3[1]));
        double sideC = Math.sqrt((point1[0]-point3[0])*(point1[0]-point3[0]) + (point1[1]-point3[1])*(point1[1]-point3[1]));
        double semiPerimeter = (sideA+sideB+sideC)/2;
        double square = Math.sqrt(semiPerimeter*sideA*sideB*sideC);
        System.out.println("square of triangle = " + square);


    }
}
