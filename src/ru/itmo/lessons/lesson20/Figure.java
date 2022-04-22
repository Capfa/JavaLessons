package ru.itmo.lessons.lesson20;


import java.io.Serializable;
import java.util.Arrays;

public final class Figure implements Serializable {
    private final Point[] points;
    transient public final String description = "Фигура, состоящая из точек";//не участвует в процессе сериализации

    public Figure(int pointCount){
        if (pointCount<2){
            throw new IllegalArgumentException("Фигура должна состоять минимум из 2х точек");
        }
        this.points=new Point[pointCount];
    }

    public Point[] getPoints() {
        return points;
    }

    public void addPoint(Point point) {
        for (int i=0;i< points.length;i++ ){
            if(points[i]!=null&&points[i].equals(point)){
                System.out.println("Точка не была добавлена");
                return;
            }
            if (points[i]==null){
                points[i]=point;
                System.out.println("Точка добавлена");
                return;
            }
        }
        System.out.println("Точка не была добавлена.Достаточно точек");
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    public Figure clone(){
        Figure copy = new Figure(points.length);
        for (int i=0;i< points.length;i++){
            copy.points[i]=points[i].clone();
        }
        return copy;
    }
}
