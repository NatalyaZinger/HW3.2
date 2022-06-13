public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenishment = 50;
        int finalAccount;
        int finalAccountWithBonus;

        if (replenishment > 1000) {
            int bonus = replenishment / 100;
            finalAccountWithBonus = account + replenishment + bonus;
            System.out.println("Вам начислено " + bonus + " бонусов");
            System.out.println("На счете " + finalAccountWithBonus + " рублей");
        } else {
            finalAccount = account + replenishment;
            System.out.println("На счете " + finalAccount + " рублей");
        }
    }
}
