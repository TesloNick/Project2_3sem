import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] arr;
    private String initials;
    private int day;
    private int month;
    private int year;

    public FinanceReport(Payment[] arr, String initials, int day, int month, int year) {
        this.initials = initials;
        this.day = day;
        this.month = month;
        this.year = year;
        this.arr = arr;
    }

    public FinanceReport(FinanceReport report) {
        arr = new Payment[report.arr.length];

        for (int i = 0; i < report.arr.length; i++) {
            arr[i] = new Payment(report.arr[i].getInitials(), report.arr[i].getDay(), report.arr[i].getMonth(), report.arr[i].getYear(), report.arr[i].getSum());
        }
        this.initials = report.initials;
        this.day = report.day;
        this.month = report.month;
        this.year = report.year;
    }

    public Payment[] getArr() {
        return arr;
    }

    public void setArr(Payment[] arr) {
        this.arr = arr;
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


    public int getPaymentsLength(Payment[] array) {
        return array.length;
    }

    public int countPayments() {
        return arr.length;
    }

    public Payment getPayment(int index) {
        if (index < 0 || arr.length <= index) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void setPayment(Payment pay, int index) {
        if (index < 0 || arr.length <= index) throw new IndexOutOfBoundsException();
        arr[index] = pay;
    }

    @Override
    public String toString() {
        return String.format("[Автор: %s, дата: %d.%d.%d, Платежи: \n%s]", initials, day, month, year, Arrays.toString(arr));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport report = (FinanceReport) o;
        return day == report.day && month == report.month && year == report.year && Arrays.equals(arr, report.arr) && initials.equals(report.initials);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(initials, day, month, year);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
