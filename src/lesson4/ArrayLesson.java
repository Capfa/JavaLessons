package lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int a =88;//100 a
        int b= a ;//88 b
        a = 100;


        Scanner scanner = new Scanner(System.in);//in [scsnner] scanner
        Scanner in =scanner;



        int[] ints1 = new int [7]; // создание массива на 7 элементов. количество элементов в дальнейшем неизмено
        System.out.println(ints1);// нельзя вывести массив в консоль таким образом
        Arrays.toString(ints1);//создает из массива строкубкоторую можно вывести в консол
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = {2,5,8,-98,67};
        System.out.println(Arrays.toString(ints2));

        ints2 = new int[3];// [0,0,0]
        System.out.println(Arrays.toString(ints2));

        //ints2 = {4,3,7};- ТАК ДЕЛАТЬ НЕЛЬЗЯ
        ints2 = new int[]{3,78,12,9};//
        System.out.println(Arrays.toString(ints2));


        //длина массива -положительное значение типа int
        int len = 10;
        int[]ints3 = new int[len];
        int[]ints4 = new int[len+5];

        System.out.println(ints4.length);

        //доступ к элементам массива

        System.out.println(ints4[3]);
        int element = ints4[2];
        ints4[2]=50;
        System.out.println(Arrays.toString(ints4));


        //многомерный массив
        // [[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
        int[][] ints5 = new int[3][4];//первые скобки-длинна внешнего массива, вторые- внутреннего
        System.out.println(Arrays.deepToString(ints5));

        //[[0,0],[0,0,0],[0,0,0,0],[0,0,0]]
        int[][] ints6 = new int[4][];
        ints6[0] = new int[2];
        ints6[1] = new int[3];
        ints6[2] = new int[4];
        ints6[3] = new int[3];
        System.out.println(Arrays.deepToString(ints6));

        //for позволяет менять значение
        int[] ints7 ={3,5,96,8};
        for(int i =0; i <ints7.length; i+= 1){
            ints7[i] *= ints7[i];
        }

        int[] ints8 ={3,5,96,8};
        int x = 0;
        for(int i =0; i <ints8.length; i+= 1){
            x += ints8[i];
        }
        System.out.println(x);


        int sum =0;
        for(int el: ints8){   //не дает изменять элементы масива, не предотавляет доступа к индексам
            System.out.println(el);
            sum+=el;
        }

        double[] ints9 ={3.7,-6.2,12.9,0.4,4.1};
        double minValue = ints9[0];
        for (double val: ints9){
            if (val< minValue){minValue =val;
            }
        }
        System.out.println(minValue);

        Arrays.sort(ints8);
        System.out.println(Arrays.toString(ints8));

        int number = Arrays.binarySearch(ints9, 3.7);
        System.out.println(number);


        //Копиование
        double[] cloneInts9 = ints9.clone();
        double[] copyInst9 = Arrays.copyOf(ints9,3);//3-количество скопированных элементов

        double[]newDoubles = new double[10];
        System.arraycopy(ints9,1,newDoubles,3,2);

        System.out.println(Arrays.toString(newDoubles));


    }

}
