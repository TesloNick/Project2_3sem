import java.util.Objects;

public class Payment {
    private String initials;
    private int day;
    private int month;
    private int year;
    private int sum;

    public Payment(String initials, int day, int month, int year, int sum) {
        this.initials = initials;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sum = sum;
    }

    public Payment(Payment payment) {
        this.day = payment.getDay();
        this.month = payment.getMonth();
        this.year = payment.getYear();
        this.initials = payment.getInitials();
        this.sum = payment.getSum();
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && month == payment.month && year == payment.year && sum == payment.sum && Objects.equals(initials, payment.initials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initials, day, month, year, sum);
    }

    @Override
    public String toString() {
        return String.format("Плательщик: %s, дата: %d.%d.%d сумма: %d руб. %02d коп. \n", initials, day, month, year, sum / 100, sum % 100);
    }
}
