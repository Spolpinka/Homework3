import javax.sound.midi.Soundbank;

public class HW2 {
    public static void main(String[] args) {
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


    }
}
