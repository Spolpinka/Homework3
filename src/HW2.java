import javax.sound.midi.Soundbank;

public class HW2 {
    public static void main(String[] args) {
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
