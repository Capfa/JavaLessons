package ru.itmo.lessons.lesson20;

import java.io.Serializable;

public class Serialisation  {
    public static void main(String[] args) {
        Point a =new Point(23,90);
        Point b =new Point(40,60);
        Point c =new Point(50,70);

        BinHandler binHandler=new BinHandler();
        binHandler.writeToFile(a);

        Point aFromFile =binHandler.readFromFile();
        System.out.println(aFromFile);

        Figure figure=new Figure(3);
        figure.addPoint(a);
        figure.addPoint(b);
        figure.addPoint(c);

        binHandler.writeToFile(figure);
    }
}
