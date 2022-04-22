package ru.itmo.lessons.lesson22;

public class Application {
    public static void main(String[] args) {
        Controller green= new Controller("green",100);
        Controller yellow= new Controller("yellow",300);
        Controller red= new Controller("red",600);

        Sensor sensor=new Sensor();
        sensor.addListner(green);
        sensor.addListner(yellow);
        sensor.addListner(red);
        for (int i=0;i<100;i+=1){
            sensor.changeTemp();
        }
    }
}
