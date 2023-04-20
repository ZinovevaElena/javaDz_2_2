public class Main {
    public static void main(String[] args) {
        int account = 100; // рублей на счете клиента
        int refill = 1100; // пополение счета в рублях
        System.out.println("Итоговая сумма на счете составит:");
        if (refill >= 1000) {
            System.out.println(account + refill + refill / 100 + "  рублей");
        } else {
            System.out.println(account + refill + "  рублей");
        }
    }
}

