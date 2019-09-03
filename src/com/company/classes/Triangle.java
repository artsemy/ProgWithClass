package com.company.classes;

public class Triangle {

    private double sideAB;
    private double sideBC;
    private double sideCA;
    private Test2 dotA;
    private Test2 dotB;
    private Test2 dotC;

    public Triangle(Test2 a, Test2 b, Test2 c){
        if (!checkLine(a, b, c)){
            dotA = a;
            dotB = b;
            dotC = c;
        } else {
            dotA = new Test2(0, 0);
            dotB = new Test2(1, 0);
            dotC = new Test2(0, 1);
        }
        initLines();
    }

    private boolean checkLine(Test2 a, Test2 b, Test2 c){
        double d1 = (a.getX1()-b.getX1()) / (c.getX1()-b.getX1());
        double d2 = (a.getX2()-b.getX2()) / (c.getX2()-b.getX2());
        return Double.compare(d1, d2) == 0;
    }

    private void initLines(){
        sideAB = countLine(dotA, dotB);
        sideBC = countLine(dotB, dotC);
        sideCA = countLine(dotC, dotA);
    }

    private double countLine(Test2 t1, Test2 t2){
        double d1 = Math.abs(t1.getX1() - t2.getX1());
        double d2 = Math.abs(t1.getX2() - t2.getX2());
        return Math.sqrt(d1*d1 + d2*d2);
    }

    public void gedMid(){
        double x = (dotA.getX1() + dotB.getX1() + dotC.getX1()) / 3.;
        double y = (dotA.getX2() + dotB.getX2() + dotC.getX2()) / 3.;
        System.out.println("x=" + x + ", y=" + y);
    }

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
