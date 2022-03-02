public class FirstLesson {
    public static void main(String[] args) {
        System.out.println("Вывод в консоль");
        int count = 11111; //обьявлена переменная и присвоено значение
        int size; //обьявлена переменная
        int lenth = 55, width = 33;
        count = 77; // обращение к переменной при присвоении нового значения
        long veryBig = 67_000_000_000L;

        //System.out.println(count/0); // выдает шибку


        double price = 56.7; //не подходит для вычислений требующих высокой точности
        float temp = -67.3F;

        System.out.println(price / 0); // получаем бесконечность

        price = count;// price = 11111.0 - автоматическое приведение типов даных
        byte small = (byte) count;// явное приведение. с данными типами данных нужно явно указывать к какому типу данных нужно привести

        //операторы
        int a = 9, b = 4;
        int c = a / b; // 2  при деление двух целых исел результат всегда округляется до целого

        double d = a / b; //2.0

        byte x = 6, y = 12;
        //byte z=x+y; ошибка, потому,что результат сложения бйтов и шотов всегда инт
        byte z = (byte) (x + y); //явное преведение


        //тернрный оператор
        int start = 3, end = 5000;
        int res = start > end ? end - start : 0;
                  //условие     результат    иначе
        System.out.println(res);//0

    }
}
