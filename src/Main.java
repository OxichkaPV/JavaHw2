
public class Main {
    public static void main(String[] args) {
        int bonus;
        int sBilet = 13676;
        int oneMily = 20;
        bonus = sBilet / oneMily;
        System.out.println("Стоимость билета - " + sBilet + " рублей");
        System.out.println("За каждые " + oneMily + " рублей начисляется 1 миля");
        System.out.println("Начислено бонусных миль - " + bonus);
    }
}
