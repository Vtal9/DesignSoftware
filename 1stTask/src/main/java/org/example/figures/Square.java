package org.example.figures;

public class Square extends Figure {
    final private double width;

    @Override
    public double getArea(){
        if(area == -1){
            area = width * width;
        }
        return area;
    }

    public Square(double w){
        width = w;
    }
}
