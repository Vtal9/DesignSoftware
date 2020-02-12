package org.example.figures;

public class Rect extends Figure {
    final private double length;
    final private double width;

    @Override
    public double getArea(){
        if(area == -1){
            area = length * width;
        }
        return area;
    }

    public Rect(double l, double w){
        length = l;
        width = w;
    }
}
