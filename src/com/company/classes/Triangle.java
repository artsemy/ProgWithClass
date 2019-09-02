package com.company.classes;

public class Triangle {

    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle(){
        init();
    }

    public Triangle(int ab, int bc, int ca){
        if (ab + bc > ca) {
            sideAB = ab;
            sideBC = bc;
            sideCA = ca;
        } else {
            init();
        }
    }

    private void init(){
        sideAB = 1;
        sideBC = 1;
        sideCA = 1;
    }

    public double perimeter(){
        return sideAB + sideBC + sideCA;
    }

    public double area(){
        double S = (sideAB+sideBC+sideCA)*(sideBC+sideCA-sideAB);
        S *= (sideAB+sideCA-sideBC)*(sideAB+sideBC-sideCA);
        S = Math.sqrt(S) / 4;
        return S;
    }
}
