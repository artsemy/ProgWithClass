package com.company.classes.trips;

import java.util.Arrays;
import java.util.Comparator;

public class TripList {

    private Trip[] trips;

    public TripList() {
        trips = new Trip[0];
    }

    public TripList(Trip[] trips) {
        this.trips = trips;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public void setTrips(Trip[] trips) {
        this.trips = trips;
    }

    public void addTrip(Trip trip){
        trips = Arrays.copyOf(trips, trips.length+1);
        trips[trips.length-1] = trip;
    }

    public void print(){
        for (Trip t: trips) {
            System.out.println(t);
        }
    }

    public void sortByType(){
        Arrays.sort(trips, new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                return o1.getType().compareTo(o2.getType());
            }
        });
    }

    public void sortByTransport(){
        Arrays.sort(trips, new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                return o1.getTransport().compareTo(o2.getTransport());
            }
        });
    }

    public void sortByFood(){
        Arrays.sort(trips, new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                return Boolean.compare(o1.isFood(), o2.isFood());
            }
        });
    }

    public void sortByDays(){
        Arrays.sort(trips, new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                return Integer.compare(o1.getDays(), o2.getDays());
            }
        });
    }

    public TripList findTrip(String type, String transport, boolean food, int days){
        TripList res = this.findByType(type).findByTransport(transport).findByFood(food).findByDays(days);
        return res;
    }

    public TripList findTrip(String type, String transport, int days){
        TripList res = this.findByType(type).findByTransport(transport).findByDays(days);
        return res;
    }

    public TripList findByType(String type){
        TripList res = new TripList();
        if (type != null){
            for (Trip t: trips) {
                if (t.getType().equals(type)){
                    res.addTrip(t);
                }
            }
        } else {
            res = this;
        }
        return res;
    }

    public TripList findByTransport(String transport){
        TripList res = new TripList();
        if (transport != null){
            for (Trip t: trips) {
                if (t.getTransport().equals(transport)){
                    res.addTrip(t);
                }
            }
        } else {
            res = this;
        }
        return res;
    }

    public TripList findByDays(int days){
        TripList res = new TripList();
        if (days > 0) {
            for (Trip t : trips) {
                if (t.getDays() == days) {
                    res.addTrip(t);
                }
            }
        } else {
            res = this;
        }
        return res;
    }

    public TripList findByFood(boolean food){
        TripList res = new TripList();
        for (Trip t : trips) {
            if (t.isFood() == food) {
                res.addTrip(t);
            }
        }
        return res;
    }
}
