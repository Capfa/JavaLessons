package lesson5;

public class StringLesson {
    public static void main(String[] args) {
        //char (примитивный тип данных) 16 битный имол юнкод
        // от 0 до 65536/
        //всегда в одинарных ковычках!!

        char char1 = 'J';// сам сивол
        char char2 = 74;//указание символа через номер
        char char3 = '\u0044';//16 ричное представление

        System.out.print(char1);

        //Строка-упорядоченная последовательность символов
        //Ссылочный тип ,экземпляр класса string
        //Только двойные ковычки
        //new String(), ипользуется,если созание строки через двойные ковычки е возможно
        //строки неизменны
        char[] chars = {'\u004A','\u004A','\u0044'};
        String jjdString = new String(chars);
        System.out.println(jjdString);//JJD
        System.out.println(jjdString.length());//3

        char[] сhar1 ={'\uD83D','\uDC38'};//суррогатная пара чаров
        String frogString = new String(сhar1);
        System.out.println(frogString);//
        System.out.println(frogString.length());//2
        System.out.println(frogString.codePoints().count());//1 действителное количеств символов

        //Пул строк
        //Всегда набор уникальных строк
        //По сути хэш таблица. Когда ни одна переменная не ссылается на обьект, он удаляется
        String string1 = "Строка";//сылаюстя
        String string2 = "Строка";//на один участок памяти
        String string3 = new String("Строка");// таким образом создается новый обьект, не попадающий в пул сток
        System.out.println(string1==string2);//true
        System.out.println(string1==string3);//false

        String string =string3.intern();//ищет схожий обьект в пуле и ссылаетс на него

        //Сравнение строк. == не используем,т.к сравнивает ссылки а не сами обьекты

        System.out.println(string1.equals(string2));
        System.out.println("строка".equals(string2));

        //конкатенация строк
        string1="Java";
        string2="Python";

        String concStrig = string1+"::"+ string2;
        concStrig = string1.concat(" :: ").concat(string2);
        concStrig=String.join(" :: ",string1,string2);

        //StringBuilder-работает быстрее
        //StringBuffer-потокобезопасный

        StringBuilder sd = new StringBuilder();
        sd.append(string1).append(string2);

        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i <10; i+=1){
            sb2.append(i).append(" ");
        }
        String sbString = sb2.toString();

        //split()
        String langs = "Java,Python,JavaScript";
        String [] langArr =langs.split(", ");

        //методы замены
        String newString = langs.replaceAll(", ","-");//заменяет все.поддерживает регулярные выражения
        newString = langs.replaceFirst(", ","-");//заменяет первое найденное
        newString = langs.replace(", ","-");//заменяет первое найденное)

        langs.contains("th");//проверяет,содержит ли строка заданную последовательность символов
        langs.startsWith("th");
        langs.endsWith("P");


    }


}
