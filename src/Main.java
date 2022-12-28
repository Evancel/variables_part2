public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1() {
        System.out.println("Task1:");

        int i = 1;
        byte b = 2;
        short s = 3;
        long l = 4L;
        float f = 5.05f;
        double db = 5.055;

        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно "  + f);
        System.out.println("Значение переменной db с типом double равно " + db);
    }

    public static void task2(){
        System.out.println("Task2:");

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3(){
        System.out.println("Task3:");

        int countTeachers = 3;
        int studentsInFirstClass = 23;
        int studentsInSecondClass = 27;
        int studentsInThirdClass = 30;
        int totalStudents = studentsInFirstClass + studentsInSecondClass + studentsInThirdClass;
        int totalPaperSheets = 480;
        int countPaperSheetsPerOneStudent = totalPaperSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + countPaperSheetsPerOneStudent + " листов бумаги.");
    }

    public static void task4(){
        System.out.println("Task4:");

        //cycleTime in minutes
        int performancePerMinute = 16/2;
        int cycleTime_1 = 20;
        int output_1 = performancePerMinute * cycleTime_1;
        System.out.println("За " + cycleTime_1 + " минут машина произвела " + output_1 + " штук бутылок.");

        int countDays = 1;
        int countHoursPerDay = 24;
        int countMinutesPerHour = 60;
        int cycleTime_2 = countDays * countHoursPerDay * countMinutesPerHour;
        int output_2 = performancePerMinute * cycleTime_2;
        System.out.println("За " + countDays + " день машина произвела " + output_2 + " штук бутылок.");

        countDays=3;
        int cycleTime_3 = countDays * countHoursPerDay * countMinutesPerHour;
        int output_3 = performancePerMinute * cycleTime_3;
        System.out.println("За " + countDays + " дня машина произвела " + output_3 + " штук бутылок.");

        countDays=31;
        int cycleTime_4 =  countDays * countHoursPerDay * countMinutesPerHour;
        int output_4 = performancePerMinute * cycleTime_4;
        System.out.println("За " + countDays + " день машина произвела " + output_4 + " штук бутылок.");
    }

    public static void task5(){
        System.out.println("Task5:");

        int canPaint = 120;
        int numberWhitePaintForOneClass = 2;
        int numberBrownPaintForOneClass = 4;
        int totalNumberPaintForOneClass = numberBrownPaintForOneClass + numberWhitePaintForOneClass;
        int numberClass = canPaint / totalNumberPaintForOneClass;
        int totalNumberWhitePaint = numberClass * numberWhitePaintForOneClass;
        int totalNumberBrownPaint = numberClass * numberBrownPaintForOneClass;

        System.out.println("В школе, где " + numberClass + " классов, нужно " + totalNumberWhitePaint +
                " банок белой краски и " + totalNumberBrownPaint + " банок коричневой краски.");
    }

    public static void task6(){
        System.out.println("Task6:");

        int countBananas = 5;
        double weightOneBanana = 80.0;
        double weightBananas = countBananas * weightOneBanana;
        int countMilk = 200;
        double weightOneMilk = 105.0/100;
        double weightMilk = countMilk * weightOneMilk;
        int countIceCream = 2;
        double weightOneIceCream = 100.0;
        double weightIceCream = countIceCream * weightOneIceCream;
        int countEggs = 4;
        double weightOneEgg= 70.0;
        double weightEggs = countEggs * weightOneEgg;

        double totalWeightCocktailG = weightBananas + weightMilk + weightIceCream + weightEggs;
        int gInKg = 1000;
        double totalWeightCocktailKg = totalWeightCocktailG / gInKg;
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightCocktailG + " грамм." );
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightCocktailKg + " килограмм." );
    }

    public static void task7() {
        System.out.println("Task7:");

        int goalLost = 7000;
        double minLostWeightPerDay = 250.0;
        // System.out.println(minLostWeightPerDay);
        double maxLostWeightPerDay = 500.0;
        double countMaxDays = goalLost / minLostWeightPerDay;
        System.out.println("Количество дней, которые потребуются, если спортсмен будет терять "
                + minLostWeightPerDay + " грамм каждый день равно " + countMaxDays);
        double countMinDays = goalLost / maxLostWeightPerDay;
        System.out.println("Количество дней, которые потребуются, если спортсмен будет терять "
                + maxLostWeightPerDay + " грамм каждый день равно " + countMinDays);
        double averageLostWeightPerDay = (minLostWeightPerDay + maxLostWeightPerDay)/2;
        double countAverageDays = goalLost / averageLostWeightPerDay;
        System.out.printf("Количество дней в среднем, если спортсмен будет терять в весе ежедневно" +
                " от 250 до 500 грам составляет %.2f%n", countAverageDays);
    }

    public static void task8(){
        System.out.println("Task8:");

        double percOfSalaryIncrese = 0.1;
        int minCountOfWork = 3;
        double currMashaSalary = 67760;
        double currDenisSalary = 83690;
        double currKristinaSalary = 76230;

        double incrMashaSalary = currMashaSalary + (currMashaSalary * percOfSalaryIncrese);
        double incrDenisSalary = currDenisSalary + (currDenisSalary * percOfSalaryIncrese);
        double incrKristinaSalary = currKristinaSalary + (currKristinaSalary * percOfSalaryIncrese);

        int countSalaryPerYear = 12;
        double yearCurrMashaSalary = currMashaSalary * countSalaryPerYear;
        double yearCurrDenisSalary = currDenisSalary * countSalaryPerYear;
        double yearCurrKristinaSalary = currKristinaSalary * countSalaryPerYear;

        double yearIncrMashaSalary = incrMashaSalary * countSalaryPerYear;
        double yearIncrDenisSalary = incrDenisSalary * countSalaryPerYear;
        double yearIncrKristinaSalary = incrKristinaSalary * countSalaryPerYear;

        double diffMSalary = yearIncrMashaSalary - yearCurrMashaSalary;
        double diffDSalary = yearIncrDenisSalary - yearCurrDenisSalary;
        double diffKSalary = yearIncrKristinaSalary - yearCurrKristinaSalary;

        System.out.println("Маша теперь получает " + incrMashaSalary + " рублей. " +
                "Годовой доход вырос на " + diffMSalary + " рублей.");
        System.out.println("Денис теперь получает " + incrDenisSalary + " рублей. " +
                "Годовой доход вырос на " + diffDSalary + " рублей.");
        System.out.println("Кристина теперь получает " + incrKristinaSalary + " рублей. " +
                "Годовой доход вырос на " + diffKSalary + " рублей.");
    }
}

