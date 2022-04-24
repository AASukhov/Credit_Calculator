

public class Main {

    private static final int CREDIT = 8_000_000;
    private static final double PERCENT = 19.9;
    private static final int PERIOD = 120;

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Месячный платеж составляет: " + bank.calculateMonthPayment(CREDIT, PERCENT, PERIOD));
        System.out.println("Общая сумма к возврату в банк составляет: " + bank.calculateSum(CREDIT, PERCENT, PERIOD));
        System.out.println("Переплата за весь период составляет: " + bank.calculateOverPrice(CREDIT, PERCENT, PERIOD));
    }


}
