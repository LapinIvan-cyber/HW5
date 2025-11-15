//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            byte a = 100;
            short b = 30700;
            int v = 1000000;
            long g = 50000000L;
            float d = 5.123456f;
            double e = 7.123456789;
            System.out.println(a);
            System.out.println(b);
            System.out.println(v);
            System.out.println(g);
            System.out.println(d);
            System.out.println(e);

            float z = 27.12f;
            long p = 987678965549L;
            double k = 2.786;
            short l = 569;
            short m = -159;
            short n = 27897;
            byte o = 67;
            System.out.println(z);
            System.out.println(p);
            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
            System.out.println(n);
            System.out.println(o);

            short totalNumberOfSheets = 480;
            System.out.println(totalNumberOfSheets);
            byte numberОfLyudmilaPavlovnaStudents = 23;
            System.out.println(numberОfLyudmilaPavlovnaStudents);
            byte numberОfAnnaSergeevnaStudents = 27;
            System.out.println(numberОfAnnaSergeevnaStudents);
            byte numberОfEkaterinaAndreevnaStudents = 30;
            System.out.println(numberОfEkaterinaAndreevnaStudents);
            int totalStudents = numberОfLyudmilaPavlovnaStudents + numberОfAnnaSergeevnaStudents + numberОfEkaterinaAndreevnaStudents;
            System.out.println("всего учеников" +  totalStudents );
            int numberOfSheetsForEachStudent = totalNumberOfSheets / totalStudents;
            System.out.println("На каждого ученика рассчитано  " +    numberOfSheetsForEachStudent + " листов бумаги"  );

            byte capacityOfBottleMakingMachineIn2Minutes = 16;
            System.out.println(capacityOfBottleMakingMachineIn2Minutes);
            byte t1 = 20;
            System.out.println(t1);
            short t2 = 60 * 24;
            System.out.println(t2);
            short t3 = 1440 * 3;
            System.out.println(t3);
            int t4 = 1440 * 30;
            System.out.println(t4);
            byte capacityOfBottleMakingMachineIn1Minutes = 16 / 2;
            System.out.println("машина делает за 1 минуту "  + capacityOfBottleMakingMachineIn1Minutes + " штук бутылок ");
            int capacityOfBottleMakingMachineIn20Minutes = capacityOfBottleMakingMachineIn1Minutes * t1;
            System.out.println("за 20 мин машина делает " + capacityOfBottleMakingMachineIn20Minutes  + " штук бутылок ");
            int capacityOfBottleMakingMachineIn1440Minutes = capacityOfBottleMakingMachineIn1Minutes * t2;
            System.out.println("За 1440 минут (сутки) машина произвела  " +  capacityOfBottleMakingMachineIn1440Minutes + " штук бутылок");
            int capacityOfBottleMakingMachineIn4320Minutes = capacityOfBottleMakingMachineIn1Minutes * t3;
            System.out.println("За 4320 минут (3 дня)  машина произвела  " +   capacityOfBottleMakingMachineIn4320Minutes  +
                    " штук бутылок" );
            int capacityOfBottleMakingMachineIn43200Minutes = capacityOfBottleMakingMachineIn1Minutes * t4;
            System.out.println("За  43200 минут (30 дней) машина произвела  " +   capacityOfBottleMakingMachineIn43200Minutes  +
                    " штук бутылок" );

            byte schoolRenovation = 120;
            System.out.println(schoolRenovation);
            byte oneClassOfWhite = 2;
            System.out.println(oneClassOfWhite);
            byte oneClassOfBrownPaint = 4;
            System.out.println(oneClassOfBrownPaint);
            int totalNumberOfColorsForOneClass = (oneClassOfWhite + oneClassOfBrownPaint);
            System.out.println(totalNumberOfColorsForOneClass);
            int totalNumberOfClassesInTheSchool = (schoolRenovation / totalNumberOfColorsForOneClass);
            System.out.println(totalNumberOfClassesInTheSchool);
            int forOneClassOfWhitePaint = (totalNumberOfClassesInTheSchool * oneClassOfWhite);
            System.out.println(forOneClassOfWhitePaint);
            int forOneClassOfBrownPaint = (totalNumberOfClassesInTheSchool * oneClassOfBrownPaint);
            System.out.println(forOneClassOfBrownPaint);
            System.out.println("В школе где"  +  totalNumberOfClassesInTheSchool  + " классов " + "нужно" + forOneClassOfWhitePaint + "банок белой краски и" + forOneClassOfBrownPaint + "банок коричневой краски");

            byte bananas = 5;
            byte gramsOfOneBanana = 80;
            short milk = 200;
            int milkInGrams = 105;
            byte plombirIceCream = 2;
            byte plombirIceCreamInGrams = 100;
            byte rawEggs = 4;
            byte rawEggsInGrams = 70;
            int totalWeightOfBananas = 5 * 80;
            System.out.println(totalWeightOfBananas);
            int totalWeightOfMilks = 105 + 105;
            System.out.println(totalWeightOfMilks);
            int totalWeightOfIceCream = 2 * 100;
            System.out.println(totalWeightOfIceCream);
            int totalWeightOfRawEggs = 4 * 70;
            System.out.println(totalWeightOfRawEggs);
            int totalBreakfastWeight = totalWeightOfBananas + totalWeightOfMilks + totalWeightOfIceCream + totalWeightOfRawEggs;
            System.out.println("Общий вес завтрака" +  totalBreakfastWeight  + "грамм");
            double breakFastWeightInKilograms = 0.001;
            double breakFastTotal = 0.001 * 1090;
            System.out.println("Общий вес завтрака в килограммах" + breakFastTotal);

            byte needToResetKilogram = 7;
            short inTotalOneKilogramGram = 1000;
            short totalWeigtForLoss = 7 * 1000;
            System.out.println(totalWeigtForLoss);
            short ifYouLoseEveryDay250 = 250;
            short ifYouLoseEveryDay500 = 500;
            short daysToLoseWeight250 = 7000 / 250;
            short daysToloseWeight500 = 7000 / 500;
            System.out.println("Если каждый день худеть на 250 грамм, понадобится" + daysToLoseWeight250);
            System.out.println("Если каждый день худеть на 500 грамм, понадобится"  +  daysToloseWeight500);
            short numberOfWaysToLoseWeight = 2;
            int totalNumberOfDays = daysToLoseWeight250 + daysToloseWeight500;
            int numberOfDaysOnAverage = totalNumberOfDays / numberOfWaysToLoseWeight;
            System.out.println(numberOfDaysOnAverage  + "день на похудения в среднем");

            int mashaCurrentSalaryPerMonth = 67760;
            int denisSalaryCurrentPerMonth = 83690;
            int christinaSalaryCurrentPerMonth = 76230;
            float salaryIncreasePercentage=10/100f;
            float amountOf10PercentOfMashaCurrentSalary = mashaCurrentSalaryPerMonth * salaryIncreasePercentage;
            float amountOf10PercentOfDenisCurrentSalary = denisSalaryCurrentPerMonth * salaryIncreasePercentage;
            float amountOf10PercentOfChristinaCurrentSalary = christinaSalaryCurrentPerMonth * salaryIncreasePercentage;
            System.out.println("Сумма 10% от месячной зарплаты сотрудников: Маши, Дениса, Кристины ");
            System.out.println(amountOf10PercentOfMashaCurrentSalary);
            System.out.println(amountOf10PercentOfDenisCurrentSalary);
            System.out.println(amountOf10PercentOfChristinaCurrentSalary);
            float mashaSalaryPerMonthAfterTheIncrease =  mashaCurrentSalaryPerMonth  +  amountOf10PercentOfMashaCurrentSalary;
            float denisSalaryPerMonthAfterTheIncrease =  denisSalaryCurrentPerMonth  +   amountOf10PercentOfDenisCurrentSalary;
            float christinaSalaryPerMonthAfterTheIncrease = christinaSalaryCurrentPerMonth + amountOf10PercentOfChristinaCurrentSalary;
            System.out.println("Месячная зарплата сотрудников после повышения: Маши, Дениса, Кристины");
            System.out.println(mashaSalaryPerMonthAfterTheIncrease);
            System.out.println(denisSalaryPerMonthAfterTheIncrease);
            System.out.println(christinaSalaryPerMonthAfterTheIncrease);
            byte month = 12;
            double AnnualIncomeOfMashaAfterTheIncrease = mashaSalaryPerMonthAfterTheIncrease * month;
            double AnnualIncomeOfDenisAfterTheIncrease = denisSalaryPerMonthAfterTheIncrease * month;
            double AnnualIncomeOfChristinaAfterTheIncrease = christinaSalaryPerMonthAfterTheIncrease * month;
            System.out.println("Годовая зарплата сотрудников после повышения: Маши, Дениса, Кристины");
            System.out.println(AnnualIncomeOfMashaAfterTheIncrease);
            System.out.println(AnnualIncomeOfDenisAfterTheIncrease);
            System.out.println(AnnualIncomeOfChristinaAfterTheIncrease);
            int MashaAnnualIncomeBeforeTheIncrease = mashaCurrentSalaryPerMonth * month;
            int DenisAnnualIncomeBeforeTheIncrease = denisSalaryCurrentPerMonth *   month;
            int ChristinaAnnualIncomeBeforeTheIncrease = christinaSalaryCurrentPerMonth * month;
            System.out.println("Годовая зарплата сотрудников до повышения: Маши, Дениса, Кристины");
            System.out.println(MashaAnnualIncomeBeforeTheIncrease);
            System.out.println(DenisAnnualIncomeBeforeTheIncrease);
            System.out.println(ChristinaAnnualIncomeBeforeTheIncrease);
            System.out.println("Разница между годовыми зарплатами сотрудников до повышения и после: Маши, Дениса, Кристины");
            double differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfMashaAfterTheIncrease - MashaAnnualIncomeBeforeTheIncrease;
            double differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfDenisAfterTheIncrease - DenisAnnualIncomeBeforeTheIncrease;
            double differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter = AnnualIncomeOfChristinaAfterTheIncrease - ChristinaAnnualIncomeBeforeTheIncrease;
            System.out.println(differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter);
            System.out.println(differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter);
            System.out.println(differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter);
            System.out.println("Маша теперь получает " + mashaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                    "Годовой доход вырос на " + differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter +" рублей. " );
            System.out.println("Денис теперь получает " +  denisSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                    "Годовой доход вырос на " +
                    differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter +" рублей." );
            System.out.println("Кристина теперь получает " + christinaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " +
                    "Годовой доход вырос на " +  differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter +" рублей." );






















































        }
    }
}