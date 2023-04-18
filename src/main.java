public class main {
    public static void main(String[] args) {
        int MoneyAccount = 100; // у клиента на счете
        int refill_1 = 300; // пополнение на 300 рублей

        System.out.println("Итоговая сумма на счете составит:");

        int bonus_1 = refill_1 / 100 * 1; // бонус 1 рубль за каждые  100 рублей пополнения
        if (refill_1 < 1000) {
            bonus_1 = 0;
        } // если пополение менее 1000 рублей бонус 0

        int Total_1 = MoneyAccount + refill_1 + bonus_1;

        System.out.println("  -   При пополнении счета на 300 рублей  --   " + Total_1 +   "  рублей");
        int refill_2 = 1100; // пополнение на 1100 рублей
        int bonus_2 = refill_2 / 100 * 1; // бонус 1 рубль за каждые  100 рублей пополнения
        if (refill_2 < 1000) {
            bonus_2 = 0;
        } // если пополение менее 1000 рублей бонус 0

        int Total_2 = MoneyAccount + refill_2 + bonus_2;
        System.out.println("  -   При пополнении счета на 1100 рублей  --   " +Total_2 +   "  рублей");

           }
}