package ru.itmo.lessons.lesson22;

import java.util.HashSet;

import java.util.Set;

public class Sensor {
    private int temp=0;
    private Set<Listner> listners= new HashSet<>();

    public void addListner(Listner listner){
        listners.add(listner);
    }

    public void removeListner(Listner listner) {
        listners.remove(listner);
    }
    public void notifyListners(int temp) {
        listners.forEach(listner -> listner.tempChange(temp));
    }

    public void changeTemp() {
        for (int i = 0; i < listners.size(); i++) {
            if (Math.random() < 0.5) temp -= 40;
            else temp += 40;
            notifyListners(temp);
            System.out.println(temp);
        }
    }
}
