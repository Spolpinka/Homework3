import javax.sound.midi.Soundbank;

public class HW2 {
    public static void main(String[] args) {
        int target = 7;
        int firstVar = 250;
        int secondVar = 500;
        int firstSituation = target*1000/firstVar;
        int secondSituation = target*1000/secondVar;
        System.out.println("Дней до достижения цели при похудении на 250 гр. ежедневно - " + firstSituation);
        System.out.println("Дней до достижения цели при похудении на 500 гр. ежедневно - " + secondSituation);
        System.out.println("Среднее количество до достижения цели - " + (firstSituation+secondSituation)/2);

    }
}
