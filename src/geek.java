import java.util.Arrays;

public class geek {
    public static void main(String[] args) {

        /* Задание 2/
        byte b = 10;
        short s = 2404;
        int i = 123456;
        long l = 1500L; // Для объявления long в конце ставится буква L
        float f = 120.0f; //  Для объявления float в конце ставится буква f
        double d = 15.72775;
        boolean bool = true;
        char c = 'A';
        */

        float a = task3();
        System.out.println("Задание 3. Результат метода  = " + a);

        boolean b = task4();
        System.out.println("Задание 4. Результат метода  = " + b);

        String c = task5(); // помогите понять как сюда передать значение abc из метода task5, при этом valueText так же должен выводиться (т.е String + Int)
        System.out.println("Задание 5. " + c);

        boolean d = task6(-1);
        System.out.println("Задание 6. Результат отрецательный? = " + d);

        String e = task7("Моня");
        System.out.println("Задание 7. Привет," + e + "!");

        String f = task8(2020);
        System.out.println("Задание *8. " + f);
    }

    static float task3() {

        float a = 1f;
        float b = 1f;
        float c = 1f;
        float d = 1f;

        return a * (b + (c / d));
    }

    static boolean task4(){

        int x = 10;
        int y = 10;
        int z = x + y;

        return (z <= 20 && z >= 10 );

    }

    static String task5(){

        int value, abc;
        value = 1;
        String valueText;

        abc = (value < 0) ? - value : value;

        if (value < 0){

            return valueText = "Значение отрецательное ";
        }
        else{

            return valueText = "Значение положительное ";
        }
    }

    static boolean task6(int x){

        if(x<0){

            return true;
        }
        else{

            return false;
        }
    }

    static String task7(String name){

        return name;
    }

    static String task8(int year){

        String yes = "Этот год високосный!";
        String no = "Вы ввели не високосный год!";

        if((year % 4 == 0) && !(year % 100 ==0)){
            return  yes;
        }
        else{
            return no;
        }

    }
}
