package ru.itmo.lessons.lesson14;

import java.util.*;


public class CollectionsLesson {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Maxim", 20);
        Student student2 = new Student(2, "Oleg", 21);
        Student student3 = new Student(3, "Anna", 19);
        Student student4 = new Student(4, "Olgs", 22);

        System.out.println("ArrayList");
        //реализован на основе массива
        //можно хранить null
        //можно хранить дублирующие элементы
        //порядок хранения элементов соответствует поряду добавления
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList = new ArrayList<>(30);//указан размер по умолчанию.в дальнейшем обьем можно увеличивать или уменьшать
        System.out.println(studentArrayList.size());//0-элементов в коллекции пока нет
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        System.out.println(studentArrayList);
        studentArrayList.add(1, student3);//не заменяет элемент,а сдвигает. Добавление по индексу

        studentArrayList.add(null);
        System.out.println(studentArrayList);
        studentArrayList.trimToSize();//урезает внутренний массив до количества добавленных элементов
        System.out.println(studentArrayList.get(1));
        //удаление.возвращает ссылку на удаленный элемент
        studentArrayList.remove(3);
        //возвращает true-false, использует метод equals
        studentArrayList.remove(student1);
        System.out.println(studentArrayList);

        Student[] students = {student1, student2};
        List<Student> studentList = Arrays.asList(students);
        studentArrayList.removeAll(Arrays.asList(studentList));

        for (Student student : studentArrayList) {
            student.setName("Student: " + student.getName());
            System.out.println(student.getName());
            //удаление элемента в цикле фор ич приведет к ошибкеюиспользовать другой
        }

        //удалить всех,кто старше 20 лет
        Iterator<Student> iterator = studentArrayList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() > 20) {
                iterator.remove();
            }
        }

        //LinkedList
        //реализован НЕ на основе массива
        //можно хранить null
        //можно хранить дублирующие элементы
        //порядок хранения элементов соответствует поряду добавления
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);


        System.out.println("Set");
        //используется для хранения уникальных элементов
        //обязательно долженбыть переопределен метод equals

        //HashSet
        //позволяет хранить nullбпри этом он всегда на первом месте
        //порядок хранения не привязан к порядку добавления
        //основан на хэш таблице
        //самое быстрое из всех множеств
        //нет доступа к элементам по индексу
        Student student11 = new Student(1, "Maxim", 20);
        Student student12 = new Student(2, "Oleg", 21);
        Student student13 = new Student(3, "Anna", 19);
        Student student14 = new Student(1, "Maxim", 21);

        HashSet<Student> studentHashSet = new HashSet<>();
        List<Student> list = Arrays.asList(student11, student12, student13, student14);
        studentHashSet = new HashSet<>(list);
        studentHashSet.add(student1);
        System.out.println(studentHashSet);
        studentHashSet.remove(student13);
        Iterator<Student> iterator1 = studentHashSet.iterator();
        int x = 0;

        for (Student student : studentHashSet) {
            x += student.getAge();
        }
        int avr = x / studentHashSet.size();
        System.out.println(avr);

        //LinkedHashSet
        //порядок хранения не отличается от порядка добавления
        //медленнее ,чем HashSet

        //TreeSet
        //1. хранит элементы в отсортированном виде
        //2.нельзя добавлять null бвыдаст ошибку
        //3.хранит элементы в отсортированном виде
        //4.основан на элементе крано-черного дерева
        //Для добавления элементов в  TreeSet необходимо:
        //1.чтобы класс,элементы которого будут хранитьсяв TreeSet реализовал интерфейс Comparator и его метод compareTo
        TreeSet<Student> treeSet1 = new TreeSet<>();
        treeSet1.add(student1);
        treeSet1.add(student2);
        treeSet1.add(student4);
        treeSet1.add(student11);

        //2.создать экземпляры класса Comparator.Тогда интерфейс не нужен
        Comparator<Student> studentComparator= new NameComparator().thenComparing(new AgeComparator());//после сравнения имен,если одинаковые,сравнивет возраст.ьщжет быть сколько угодно доп.сортировок
        TreeSet<Student> treeSet2=new TreeSet<>(studentComparator);
        treeSet2.add(student11);
        treeSet2.add(student12);
        treeSet2.add(student4);
        treeSet2.add(student14);
        treeSet2.add(student13);
        System.out.println(treeSet2);


    }

}

