package lesson2;

public class SecondLesson {
    public static void main(String[] args) {
        //логические операторы
        //&& and
        int x = 50, y = 100, z = 91;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
        // System.out.println(res);

        // || or
        int code = 33333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 44444);

        // ! not меняет значение на противоположное

        boolean isActive = false, isConnected = true;
        res = !isActive || !isConnected;
        // System.out.println(res);


        int state = 8;
        if (state == 0) {
            System.out.println("Закрыть приложение");
        } else if (state == 1) {
            System.out.println("Открыть приложение");
        } else {
            System.out.println("Ошибка статуса");
        }

        int month = 22;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month > 2 && month < 6) {
            System.out.println("Весна");
        } else if (month > 5 && month < 9) {
            System.out.println("Лето");
        } else if (month > 8 && month < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Ошибка ");
        }


        month = 5;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Ошибка ");
                break;
        }

        int sum = 1000, saeCode = 7647;
        switch (saeCode) {
            case 4525 :
                System.out.println(sum*0.7);
                break;
            case 6242 :
            case 7012:
                System.out.println(sum*0.8);
                break;
            case 7647:
            case 9011:
            case 6612:
                System.out.println(sum*0.9);
                break;
            default:
                System.out.println(sum);
                break;

        }
    }
}
