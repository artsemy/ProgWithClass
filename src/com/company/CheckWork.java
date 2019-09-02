package com.company;

import com.company.classes.Student;
import com.company.classes.Test1;
import com.company.classes.Test2;
import com.company.classes.Train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class CheckWork {

    void func1(){
        Test1 test1 = new Test1();
        test1.changeX1(2);
        test1.changeX2(3);
        test1.print();
        System.out.println("sum=" + test1.sum());
        System.out.println("max=" + test1.max());
    }

    void func2(){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2(3, 4);
        t1.setX1(5);
        System.out.println(t1.getX1());
        System.out.println(t2.getX2());
    }

    void func3(){
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setMarks(new int[]{9, 9, 9, 9, i*2 + 2});
            students[i].printWithMarks(true, false, true, false, new int[]{9, 10});
        }
    }

    void func4(){
        Train[] trains = func4f();
        func4e(trains);
        func4a(trains);
        func4b(trains);
        func4c(trains);
    }

    private void func4a(Train[] trains){
        Arrays.sort(trains);
        func4e(trains);
    }

    private void func4b(Train[] trains){
        Random r = new Random();
        boolean b = true;
        while (b){
            int k = r.nextInt(10);
            for (Train t: trains) {
                if (t.getNumber() == k){
                    System.out.println("num = " + k);
                    t.print();
                    b = false;
                }
            }
        }
        System.out.println("---------------------");
    }

    private void func4c(Train[] trains){
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())){
                    return o1.getTime().compareTo(o2.getTime());
                }
                return o1.getDestination().compareTo(o2.getDestination());
            }
        });
        func4e(trains);
    }

    private void func4e(Train[] trains){
        for (Train t: trains) {
            t.print();
        }
        System.out.println("-----------------------");
    }

    private Train[] func4f(){
        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
        }
        trains[2].setDestination("Moscow");
        trains[4].setDestination("Minsk");
        return trains;
    }
}
