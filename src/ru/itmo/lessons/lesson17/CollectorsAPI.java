package ru.itmo.lessons.lesson17;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ru.itmo.lessons.lesson16.Course;
public class CollectorsAPI {
    ArrayList<Course>courses=new ArrayList<>(Course.getInstances(8));
    Map<String,List<Course>>map1=courses.stream()
            .collect(Collectors.groupingBy(Course::getName));

    Map<Integer,ArrayList<Course>>map2=courses.stream()
            .collect(Collectors.groupingBy(
                    Course::getDuration,
                    Collectors.toCollection(ArrayList::new)));

}
