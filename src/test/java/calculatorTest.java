import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    private final int credit = 8_000_000;
    private final double percent = 19.9;
    private final int period = 120;

    Bank bank = new Bank();

    @Test
    void testCalculateMonthPayment() {
        int expected = 132_666;
        int actual = bank.calculateMonthPayment(credit,percent,period);
        Assertions.assertEquals(expected,actual);
    }
    //Пустой метод calculateMonthPayment() - результат Process finished with exit code -1;
    //Заполненный метод calculateMonthPayment() - результат Process finished with exit code 0;

    @Test
    void testCalculateSum() {
        long expected = 15_920_000;
        long actual = bank.calculateSum(credit,percent,period);
        Assertions.assertEquals(expected,actual);
    }
    //Пустой метод calculateSum() - результат Process finished with exit code -1;
    //Заполненный метод calculateSum() - результат Process finished with exit code 0;

    @Test
    void testCalculateOverPrice() {
        long expected = 7_920_000;
        long actual = bank.calculateOverPrice(credit,percent,period);
        Assertions.assertEquals(expected,actual);
    }
    //Пустой метод calculateOverPrice - результат Process finished with exit code -1;
    //Заполненный метод calculateOverPrice - результат Process finished with exit code 0;
}
