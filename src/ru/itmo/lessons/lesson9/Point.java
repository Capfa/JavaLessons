package ru.itmo.lessons.lesson9;

import java.util.Objects;

//все классы наследуются от класса Object
// implements Cloneable необходим если проиходит вызов метода super.clone родителя-Object, super.clone();
//иначе будет выдавать ошибку CloneNotSupportedException
public class Point  implements Cloneable{
    private int x;
    private int y;

    public Point(int x,int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point{"+
                "x="+x+
                ",y="+y+
                "}";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }


    @Override

    //возвращает целое число.используется для хранения данных в мапах. переопределяется всегда,если переопределяется иквал
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public Point clone(){
        try {
            return (Point) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }

    }
}
