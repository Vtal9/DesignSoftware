package org.example.figures;

public class circle extends Figure{
    final private static double pi = 3.14;
    final private double radius;

    @Override
    public double getArea(){
        if(area == -1){
            area = pi * radius * radius;
        }
        return area;
    }

    public circle(double r){
        radius = r;
    }
}

