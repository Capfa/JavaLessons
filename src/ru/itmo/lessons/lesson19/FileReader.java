package ru.itmo.lessons.lesson19;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileReader {
    //java.io   File
    //java.nio  class Files
    //new File


    //InputStream работает с байтами ,отвечает за передачубайтов из источников в программу
    //OutputStream передает байты из программы в источник

    //Reader  получение потока чаров из источника в программу
    //Writer передача чаров из программы в источник

    //FileInputStream /FileOutputStream
    //ObjectInputStream//ObjectOutputStream


    public static boolean writeToFile(byte[] data, File file) {
        boolean result = false;

        try (FileOutputStream fileOutput = new FileOutputStream(file, true)) {//если открытие и источник прописаны вот так в трай
            //то закрытие источника происходит автоматически если
            // 1 данные переданы , все инструкции в трай выполнены без ошибок
            //2 в блоке трай произошла ошибка .Ресурсы будут закрыты ДО перехвата исключеия в кэтч
            //Если класс ,обьект которого создается в круглых скобках трай ,реализует AutoClosabel интерфейс
            //то он обязан написать пере   будет закрыт автоматически, иначе ничего не выйдет
            fileOutput.write(data);
            result = true;
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Не удалось записать данные");
        }
        return result;
    }

    public static byte[] redFromFile(File file) {
        byte[] result = null;
        try (FileInputStream fileInput = new FileInputStream(file)) {
            result = fileInput.readAllBytes();


        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Не удалось записать данные из файла");
        }
        return result;
    }

    public static boolean writeFromConsole(File file) {
        boolean result=false;

        //основная функция
        try (FileOutputStream fileOutput = new FileOutputStream(file, true);
             //декоратор
             BufferedOutputStream buffer = new BufferedOutputStream(fileOutput)) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Введите данные или стоп");
                String userInput = scanner.nextLine();
                if ("stop".equalsIgnoreCase(userInput)) break;
                buffer.write(userInput.getBytes());
            }
        result=true;
        }catch (IOException e){
            System.out.println("Не удалось записать данные");
        }
        return result;
    }

    public  static String readWithBuffer(File file){
        String result =null;
        try (FileInputStream fileInputStream= new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream()){
             byte[] buffer=new byte[300];
             int count;
             while ((count= bufferedInputStream.read(buffer))!=-1) {
                 byteArray.write(buffer,0,count);
             }
             result = byteArray.toString();

        }catch (IOException e) {
            System.out.println("Не удалось прочитать данные из файла");
        }

        return result;
    }




    
}

