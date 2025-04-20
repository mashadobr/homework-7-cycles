public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("задача 1");
        int capital = 15000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; ) {
            total = total + capital;
            i = i + 1;
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        System.out.println("_______________________");
        //Task 2
        System.out.println("задача 2");
        i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int y = 10; y > 0; y--) {
            System.out.print(y + " ");
        }
        System.out.println("_______________________");
        //Task 3
        System.out.println("задача 3");
        int population = 12_000_000;
        int birf = 17;
        int death = 8;
        for (i = 1; i <= 10; i++) {
            population = population + population * (birf - death) / 1000;
            System.out.println("Год " + i + ", численность населения  " + population);
        }
        System.out.println("_______________________");
        //Task 4
        System.out.println("задача 4");
        int mouth = 0;
        double totalSaving = 15_000;
        double percent = 0.07;
        while (totalSaving < 12_000_000) {
            totalSaving += (int) (totalSaving * percent);
            mouth++;
            System.out.println("Месяц" + mouth + " сумма накоплений равна " + totalSaving + " рублей");
        }
        System.out.println("_______________________");

        //Task 5
        System.out.println("задача 5");
        mouth = 0;
        totalSaving = 15_000;
        percent = 0.07;
        while (totalSaving < 12_000_000) {
            totalSaving += (int) (totalSaving * percent);
            mouth++;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + " сумма накоплений равна " + totalSaving + " рублей");
            }
        }
        System.out.println("_______________________");
        //Task 6
        System.out.println("задача 6");
        mouth = 0;
        totalSaving = 15_000;
        percent = 0.07;
        int totalMonth = 9 * 12;
        while (mouth <= totalMonth) {
            totalSaving += (int)(totalSaving * percent);
            mouth++;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + " сумма накоплений равна " + totalSaving + " рублей");
            }
        }
        System.out.println("_______________________");
        //Task 7
        System.out.println("задача 7");
        int firstfriday = 7;
        while (firstfriday <= 31) {
            System.out.println("Сегодня пятница, " + firstfriday + "-е число. Необходимо подготовить отчет");
            firstfriday += 7;
        }
        System.out.println("_______________________");
        //Task 8
        System.out.println("задача 8");
        int whatYearNow = 2024;
        int startYear = 0;
        int period =79;
        int yearBefore200 = whatYearNow - 200;
        int yearAfter100 = whatYearNow + 100;
        for (int year = startYear; year <=yearAfter100; year += 79 )
        {
            if (year >= yearBefore200) {
                System.out.println(year);
            }
        }
    }
}



