import javax.sound.midi.Soundbank;

public class HW2 {
    public static void main(String[] args) {
        //целочисленные
        byte first = 1;
        short second = 129;
        int third = 32768;
        long forth = 2147483648L;
        //с плавающей запятой
        float variableFloat = 2.5F;
        double variableDouble = 2.5;
        //символьная
        char variableChar = 0;
        //логическая
        boolean variableBoolean = true;

        //Домашка 3, часть 2, задача про боксеров
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        System.out.println("Общий вес двух боксеров - " + (firstBoxerWeight+secondBoxerWeight) + " кг.");
        System.out.println("Разница в весе боксеров - " + (secondBoxerWeight-firstBoxerWeight) + " кг.");

        //Домашка 3, часть 3, задача про коктейль
        int bananaNumb = 5;
        int bananaWeight = 80;
        int milkNumb = 200;
        int milkWeight100ml = 105;
        int icecreamNumb = 2;
        int icecreamWeight = 100;
        int eggNumb = 4;
        int eggWeight = 70;
        //решение
        //вес в граммах
        int summaryGramms = (bananaNumb*bananaWeight)+(milkNumb*milkWeight100ml/100)+(icecreamNumb*icecreamWeight)+(eggNumb*eggWeight);
        //вес в килограммах
        float summaryKilogr = summaryGramms/1000f;
        System.out.println("Общий вес спорт-завтрака " + summaryKilogr + " кг.");

        //Домашка 3, часть 4, сброс веса
        int target = 7;
        int firstVar = 250;
        int secondVar = 500;
        int firstSituation = target*1000/firstVar;
        int secondSituation = target*1000/secondVar;
        System.out.println("Дней до достижения цели при похудении на 250 гр. ежедневно - " + firstSituation);
        System.out.println("Дней до достижения цели при похудении на 500 гр. ежедневно - " + secondSituation);
        System.out.println("Среднее количество до достижения цели - " + (firstSituation+secondSituation)/2);

        //Домашка 3, часть 5, про зарплаты
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        double incomeMashaNew = incomeMasha + (incomeMasha*0.1);
        double incomeDenisNew = incomeDenis + (incomeDenis*0.1);
        double incomeKristinaNew = incomeKristina + (incomeKristina*0.1);
        double mashaDifferenceInYear = (incomeMashaNew*12) - (incomeMasha*12);
        System.out.println("Маша теперь получает " + incomeMashaNew + " рублей. Годовой доход вырос на " + mashaDifferenceInYear + " рублей");
        double denisDifferenceInYear = (incomeDenisNew*12) - (incomeDenis*12);
        System.out.println("Денис теперь получает " + incomeDenisNew + " рублей. Годовой доход вырос на " + denisDifferenceInYear + " рублей");
        double kristinaDifferenceInYear = (incomeKristinaNew*12) - (incomeKristina*12);
        System.out.println("Кристина теперь получает " + incomeKristinaNew + " рублей. Годовой доход вырос на " + kristinaDifferenceInYear + " рублей");

    }
}
