
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int value = 15000;
        int total = 0;
        while (total < 2459000) {
            i = i + 1;
            total = total + total / 100;
            total = total + value;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println("");
        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
        int y = 12000000;
        int live = 17;
        int dead = 8;
        int year = 0;
        while (year < 10) {
            year++;
            y = y + y * (live - dead) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + y + " человек");
        }
        int itog = 12000000;
        int month1 = 0;
        int value2 = 15000;

        while (value2 < itog) {
            month1++;
            value2 = (int) (value2 + value2 * 0.07);

            System.out.println("Сумма " + value2 + " , количество месяцев " + month1);
        }
        int years = 9;
        int value3 = 15000;
        int allMonths = years *12;

        for (int in = 0; in < allMonths; in++) {
            value3 = (int) (value3 + value3 * 0.07);
            if (in % 6 == 0){
                System.out.println("Сумма " + value3 + " , количество месяцев " + in);
            }
        }
        int friday = 8;
        while (friday <=31){
            System.out.println("Сегодня пятница " + friday +"-е число. Необходимо подготовить отчет");
            friday = friday +7;
        }
        int thisYear = 2024;
        for (int yearCometa = 0; yearCometa < thisYear +100; yearCometa = yearCometa +79){
            if (yearCometa > thisYear -200){
                System.out.println(yearCometa);
            }
        }

    }
}
