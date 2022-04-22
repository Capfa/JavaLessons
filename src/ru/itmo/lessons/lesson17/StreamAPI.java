package ru.itmo.lessons.lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ru.itmo.lessons.lesson16.Course;
public class StreamAPI {
    public static void main(String[] args) {
        Stream<Integer>integerStream=Stream.of(-100,5,200,-8,0,23,-5,200,500);
        integerStream.filter(num->num<0)
                .limit(5)
                .map(num->num*num)
                .forEach(System.out::println);//тернарная операцияюпосле этой операции поток закрыт и к нему нельзя больше обратиться


        Stream<Integer>NewStream=
                Stream.of(6,45,-9,-8,89,47,25,6,9,48,-8);
        NewStream.distinct()
                .sorted()
                .forEach(System.out::println);

        Stream<Integer>integerStream1=Stream.of(-100,5,200,-8,0,23,-5,200,500);
        integerStream1=
                Stream.of(6,45,-9,-8,89,47,25,6,9,48,-8,1000);
        System.out.println(integerStream1.anyMatch(num->num==0));//если хоть один удовлетворяет-вернет тру


        integerStream1=
                Stream.of(6,45,-9,-8,89,47,25,6,9,48,-8,1000);
        System.out.println(integerStream1.allMatch(num->num>0));//если все удовлетворяют-вернет тру

        integerStream1=
                Stream.of(6,45,-9,-8,89,47,25,6,9,48,-8,1000);
        System.out.println(integerStream1.noneMatch(num->num>10000));//если ни один не удовлетворяет-вернет тру

        String[] colors={"white","black","red"};
        //Optional<T>-null safe container
        String color = Arrays.stream(colors).findFirst().get();
        color = Arrays.stream(colors).findAny().orElse("yellow");
        boolean isPresent =Arrays.stream(colors).findFirst().isPresent();

        Arrays.stream(colors)
                .skip(2)
                .filter(elem->elem.startsWith("r"))
                .forEach(System.out::println);



        ArrayList<Course>courses =new ArrayList<>();
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());

        Course minByPrice = courses.stream()
                .min((c1,c2)->(int)(c1.getPrice()- c2.getPrice()) )
                .orElse(Course.getInstance());
        System.out.println(minByPrice);


        Course maxByDuration = courses.stream()
                .max(Comparator.comparing(Course::getDuration))
                .orElse(Course.getInstance());
        System.out.println(maxByDuration);

        Course[] courseArr=courses.stream()
                .filter(course -> course.getPrice()>20000)
                .toArray(Course[] ::new);//ссылка на конструктор массива

        List<Course> courseList=courses.stream()
                .filter(course -> course.getDuration()>3)
                .peek(course -> course.setPrice(course.getPrice()+5000))//метод пик изменяет элемент потока
                .collect(Collectors.toList());


        colors=new String[]{"white","black","red"};
        Map<String,Integer> map=Arrays.stream(colors)
                .collect(Collectors.toMap(
                        Function.identity(),//keys
                        elem->elem.length(),//values
                        (elem1,elem2)->elem1//как формировать значение если ключ повторяется


                ));

        String[][]strings={
                {"1","87","90"},
                {"-1","100","9","90","7"},
                {"-8","-100","9","6","56"},
        };
        String[][]strings1=Arrays.stream(strings)
                .map(elem->Arrays.stream(elem)
                        .distinct()
                        .sorted()
                        .toArray(String[]::new))
                .toArray(String[][]::new);


        String[]strings2=Arrays.stream(strings)
                .flatMap(elem->Arrays.stream(elem)
                        .distinct()
                        .sorted())
                .toArray(String[]::new);
    }
}
