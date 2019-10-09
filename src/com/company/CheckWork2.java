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
import com.company.classes.trips.Trip;
import com.company.classes.trips.TripList;

import java.util.Arrays;
import java.util.Random;

public class CheckWork2 {

    //class text, class sentence, class word; print title,text; add text
    public void func1(){
        Random r = new Random();
        Text text = new Text();
        //init text
        text.setTitle("RAP Song");
        String[] words = {"papapa", "pumpumpum", "kakaka", "bambambam"};
        String[] strs = {"!", "?", "."};
        for (int i = 0; i < 10; i++) {
            Sentence sentence = new Sentence();
            for (int j = 0; j < 4; j++) {
                Word word = new Word(words[r.nextInt(4)]);
                //add word to sentence
                sentence.addWord(word);
            }
            //add sentence to text
            sentence.addWord(new Word(strs[r.nextInt(3)]));
            text.addSentence(sentence);
        }
        //print title
        System.out.println(text.getTitle());
        //print format text
        System.out.println(text.cutByLength(40));
    }

    //class car, class wheel, class engine; start, fuel, change wheel, print model
    public void func2(){
        //init cars
        Car[] cars = initCars();
        //print all cars
        printCars(cars);
        //start no-started cars
        func2a(cars);
        //fuel no-fueled cars
        func2b(cars);
        //change wheel where empty
        func2c(cars);
        //print models
        func2d(cars);
    }

    //init cars
    private Car[] initCars(){
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            //change default car
            changeCar(cars[i]);
        }
        return cars;
    }

    //change default car
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

    //print all cars
    private void printCars(Car[] cars){
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println("---------------------");
    }

    //start no-started cars
    private void func2a(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isStarted()){
                cars[i].setStarted(true);
                System.out.println(cars[i]);
            }
        }
        System.out.println("---------------------");
    }

    //fuel no-fueled cars
    private void func2b(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isFueled()){
                cars[i].setFueled(true);
                System.out.println(cars[i]);
            }
        }
        System.out.println("---------------------");
    }

    //change wheel where empty
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

    //print models
    private void func2d(Car[] cars){
        for (Car c: cars) {
            c.printModel();
        }
    }

    //class country, class state, class distinct, class city;
    //print capital, number of states, area, capital of states
    public void func3(){
        //init country
        Country country = new Country();
        changeCountry(country);
        //print capital
        country.printCapital();
        //print states
        country.printCountStates();
        //print area
        country.printArea();
        //print states with its capitals
        country.printSatesCityS();
    }

    //change country
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

    //class bank, bank account, bank client; block unblock accounts
    //count sum (negative, positive), search and sort
    public void func4(){
        //init bank
        Bank bank = initBank();
        //print all
        bank.printAcc();
        System.out.println("---------------------");
        //find by client
        BankAccount[] ba = bank.findByName("name#3");
        for (BankAccount b: ba) {
            System.out.println(b);
        }
        System.out.println("---------------------");
        //sort by balance
        bank.sortByBalance();
        for (BankAccount b: bank.getBankAccounts()) {
            System.out.println(b);
        }
        System.out.println("---------------------");
        //full balance
        System.out.println("full balance " + bank.countBalance());
        //positive balance
        System.out.println("positive " + bank.countPositiveBalance());
        //negative balance
        System.out.println("negative " + bank.countNegativeBalance());
    }

    //init bank
    private Bank initBank(){
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
        return bank;
    }

    //class trip, tripList; [type, transport food, days], method find, sort
    public void func5(){
        //init trips
        TripList tripList = new TripList();
        for (int i = 0; i < 20; i++) {
            Trip trip = changeTrip();
            tripList.addTrip(trip);
        }
        //print all
        tripList.print();
        System.out.println("-----------------");
        //sort by type
        tripList.sortByType();
        tripList.print();
        System.out.println("-----------------");
        //find by param
        tripList.findTrip(null, null, true, -1).print();
        System.out.println("-----------------");
        tripList.findTrip("rest", "bus", -1).print();
    }

    //change default
    private Trip changeTrip(){
        Random r = new Random();
        String type = Trip.tripTypes[r.nextInt(5)];
        String transport = Trip.transportTypes[r.nextInt(4)];
        boolean food = r.nextBoolean();
        int days = r.nextInt(10) + 1;
        return new Trip(type, transport, food, days);
    }

}
