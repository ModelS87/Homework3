public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte a = 15;
        System.out.println("Значение переменной a с типом byte " + "равно " + a);
        short bigBi = 32765;
        int potato = -33000;
        long potatoRose = 9000000000L;
        float Carrots = 5.5f;
        double b = 0.9990000001;
        System.out.println("Значение переменной bigBi с типом short " + "равно " + bigBi);
        System.out.println("Значение переменной potato с типом int " + "равно " + potato);
        System.out.println("Значение переменной potatoRose с типом long " + "равно " + potatoRose);
        System.out.println("Значение переменной Carrots с типом float " + "равно " + Carrots);
        System.out.println("Значение переменной b с типом double " + "равно " + b);
        float aA = 27.12f;
        long bB = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Значение переменной aA равно " + aA);
        System.out.println("Значение переменной bB равно " + bB);
        System.out.println("Значение переменной c равно " + c);
        System.out.println("Значение переменной d равно " + d);
        System.out.println("Значение переменной e равно " + e);
        System.out.println("Значение переменной f равно " + f);
        System.out.println("Значение переменной g равно " + g);
        byte LPclass = 23;
        byte ASclass = 27;
        byte EAclass = 30;
        int ALLclasses = LPclass + ASclass + EAclass;
        int paper = 480;
        int paperperpupil = paper / ALLclasses;
        System.out.println("На каждого ученика рассчитано " + paperperpupil + " листов бумаги");
        byte bottleMinute = 8;
        int bottle20M = bottleMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottle20M + " штук бутылок");
        int bottle1Day = bottleMinute * 1440;
        System.out.println("За сутки машина произвела " + bottle1Day + " штук бутылок");
        int bottle3Days = bottle1Day * 3;
        System.out.println("За трое суток машина произвела " + bottle3Days + " штук бутылок");
        int bottle1Month = bottle1Day * 30;
        System.out.println("За 1 месяц машина произвела " + bottle1Month + " штук бутылок");
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = 120 / (whitePaint + brownPaint);
        System.out.println(classes);
        int brownPaintTotal = 4 * classes;
        int whitePaintTotal = 2 * classes;
        System.out.println( "В школе, где " + classes + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");
        byte bananaWeightGR = 80;
        byte milkWeightGR = 105;
        byte iceWeightGR = 100;
        byte eggWeightGR = 70;
        int breakfastWeightGR = 5 * bananaWeightGR + 2 * milkWeightGR + 2 * iceWeightGR + 4 * eggWeightGR;
        float breakfastWeieghtKG = breakfastWeightGR / 1000f;
        System.out.println("Вес завтрака спортсмена в граммах - " + breakfastWeightGR + ", а в килограммах - " + breakfastWeieghtKG);
        int needWeight = 7000;
        int plan1 = needWeight / 250;
        int plan2 = needWeight / 500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то вес уйдет через " + plan1 + " дней. А если - по 500 грамм, то на похудение уйдет " + plan2 + " дней.");
        int plan3Weight = (250 + 500) / 2;
        int averageDays = needWeight / plan3Weight;
        System.out.println("В среднем на похудение уйдет " + averageDays + " дней.");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryMasha10Per = salaryMasha/100*10;
        int salaryDenis10Per = salaryDenis/100*10;
        int salaryKristina10Per = salaryKristina/100*10;
        int newsalaryMasha = salaryMasha + salaryMasha10Per;
        int newsalaryMashaYear = newsalaryMasha *12;
        int newsalaryDenis = salaryDenis + salaryDenis10Per;
        int newsalaryDenisYear = newsalaryDenis *12;
        int newsalaryKristina = salaryKristina + salaryKristina10Per;
        int newsalaryKristinaYear = newsalaryKristina *12;
        int salaryMashaYear = salaryMasha*12;
        int salaryDenisYear = salaryDenis*12;
        int salaryKristinaYear = salaryKristina*12;
        int diffMasha = newsalaryMashaYear - salaryMashaYear;
        int diffDenis = newsalaryDenisYear - salaryDenisYear;
        int diffKristina = newsalaryKristinaYear - salaryKristinaYear;
        System.out.println("Маша теперь получает " + newsalaryMasha +" рублей. Годовой доход вырос на " + diffMasha + " рублей.");
        System.out.println("Денис теперь получает " + newsalaryDenis +" рублей. Годовой доход вырос на " + diffDenis + " рублей.");
        System.out.println("Маша теперь получает " + newsalaryKristina +" рублей. Годовой доход вырос на " + diffKristina + " рублей.");







    }
}