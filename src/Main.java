public class Main {
    public static void main(String[] args) {
        System.out.println("Общий баланс");

        int balance = 100;
        int replenishmentBalance = 1200;

        if (replenishmentBalance > 1000) {
            int bonus = replenishmentBalance / 100;
            System.out.println(balance + replenishmentBalance + bonus);

        } else {
            System.out.println(balance + replenishmentBalance);
        }
        System.out.println("Бонусы");
        if (replenishmentBalance > 1000) {
            int bonus = replenishmentBalance / 100;
            System.out.println(bonus);

        } else {
            System.out.println("0");
        }
    }
}

