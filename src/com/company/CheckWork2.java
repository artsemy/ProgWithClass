package com.company;

import com.company.classes.bank.Bank;
import com.company.classes.bank.BankAccount;
import com.company.classes.bank.BankClient;
import com.company.classes.cars.Car;
import com.company.classes.cars.Wheel;
import com.company.classes.country.City;
import com.company.classes.country.Country;
import com.company.classes.country.District;
import com.company.classes.country.State;
import com.company.classes.texts.Sentence;
import com.company.classes.texts.Text;
import com.company.classes.texts.Word;

import java.util.Arrays;
import java.util.Random;

public class CheckWork2 {

    public void func1(){
        Random r = new Random();
        Text text = new Text();
        text.setTitle("RAP Song");
        String[] words = {"papapa", "pumpumpum", "kakaka", "bambambam"};
        String[] strs = {"!", "?", "."};
        for (int i = 0; i < 10; i++) {
            Sentence sentence = new Sentence();
            for (int j = 0; j < 4; j++) {
                Word word = new Word(words[r.nextInt(4)]);
                sentence.addWord(word);
            }
            sentence.addWord(new Word(strs[r.nextInt(3)]));
            text.addSentence(sentence);
        }
        System.out.println(text.getTitle());
        System.out.println(text.cutByLength(40));
    }

    public void func2(){
        Car[] cars = initCars();
        printCars(cars);
        func2a(cars);
        func2b(cars);
        func2c(cars);
        func2d(cars);
    }

    private Car[] initCars(){
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            changeCar(cars[i]);
        }
        return cars;
    }

    private void changeCar(Car car){
        Random r = new Random();
        Boolean[] b = {true, false};
        String[] models = {"Lada", "Mercedes", "Lamborghini"};
        car.setModel(models[r.nextInt(3)]);
        if (car.getModel().equals("Lada")){
            car.getWheels()[r.nextInt(4)].setEmpty(true);
        }
        car.setFueled(b[r.nextInt(2)]);
        car.setStarted(b[r.nextInt(2)]);
    }

    private void printCars(Car[] cars){
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println("---------------------");
    }

    private void func2a(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isStarted()){
                cars[i].setStarted(true);
                System.out.println(cars[i]);
            }
        }
        System.out.println("---------------------");
    }

    private void func2b(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isFueled()){
                cars[i].setFueled(true);
                System.out.println(cars[i]);
            }
        }
        System.out.println("---------------------");
    }

    private void func2c(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            Wheel[] wheels = cars[i].getWheels();
            for (int j = 0; j < wheels.length; j++) {
                if (wheels[j].getEmpty()){
                    wheels[j].setEmpty(false);
                    System.out.println(cars[i]);
                    System.out.println(Arrays.toString(wheels));
                }
            }
        }
        System.out.println("---------------------");
    }

    private void func2d(Car[] cars){
        for (Car c: cars) {
            c.printModel();
        }
    }

    public void func3(){
        Country country = new Country();
        changeCountry(country);
        country.printCapital();
        country.printCountStates();
        country.printArea();
        country.printCountStates();
    }

    private void changeCountry(Country country){
        for (int i = 0; i < 4; i++) {
            State state = new State();
            for (int j = 0; j < 3; j++) {
                District district = new District();
                for (int k = 0; k < 2; k++) {
                    City city = new City();
                    district.addCity(city);
                }
                district.setArea(10*(j+1));
                state.addDistrict(district);
            }
            country.addState(state);
        }
    }

    public void func4(){
        Random r = new Random();
        Bank bank = new Bank();
        for (int i = 0; i < 5; i++) {
            BankClient bc = new BankClient();
            bc.setName("name#" + i);
            for (int j = 0; j < 3; j++) {
                BankAccount ba = new BankAccount();
                ba.setBalance(r.nextInt(101) - 50);
                bc.addBankAcc(ba);
            }
            bank.addClient(bc);
        }
        BankAccount[] ba = bank.findByName("name#3");
        for (BankAccount b: ba) {
            System.out.println(b);
        }
        System.out.println("---------------------");
        bank.sortByBalance();
        for (BankAccount b: bank.getBankAccounts()) {
            System.out.println(b);
        }
        System.out.println("---------------------");
        System.out.println(bank.countBalance());
        System.out.println(bank.countPositiveBalance());
        System.out.println(bank.countNegativeBalance());
    }

}
