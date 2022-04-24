public class Bank {

    public int calculateMonthPayment(int credit, double percent, int period) {
        double monthPercent = (percent/12)/100;
        double annualPercent = (monthPercent*Math.pow(1+monthPercent,period))/((1+Math.pow(1+monthPercent,period))-1);
        return (int)(annualPercent*credit);
    }

    public long calculateSum(int credit, double percent, int period) {
        double monthPercent = (percent/12)/100;
        double annualPercent = (monthPercent*Math.pow(1+monthPercent,period))/((1+Math.pow(1+monthPercent,period))-1);
        return (int)(annualPercent*credit*period);
    }

    public long calculateOverPrice(int credit, double percent, int period) {
        double monthPercent = (percent/12)/100;
        double annualPercent = (monthPercent*Math.pow(1+monthPercent,period))/((1+Math.pow(1+monthPercent,period))-1);
        return (int)(annualPercent*credit*period-credit);
    }
}
