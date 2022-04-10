import java.util.ArrayList;

public class FinanceReportProcessor {

    public static FinanceReport getReport(FinanceReport report, String symbol) {
        ArrayList<Payment> arrayList = new ArrayList<>();

        for (int i = 0; i < report.countPayments(); i++) {
            if (report.getPayment(i).getInitials().startsWith(symbol)) {

                arrayList.add(report.getPayment(i));
            }
        }
        return new FinanceReport(arrayList.toArray(new Payment[0]), report.getInitials(), report.getDay(), report.getMonth(), report.getYear());
    }

    public static FinanceReport getPayment(FinanceReport report, int maxsum) {
        ArrayList<Payment> arrayList = new ArrayList<>();

        for (int i = 0; i < report.countPayments(); i++) {
            if (report.getPayment(i).getSum() < maxsum) {
                arrayList.add(report.getPayment(i));
            }
        }
        return new FinanceReport(arrayList.toArray(new Payment[0]), report.getInitials(), report.getDay(), report.getMonth(), report.getYear());
    }
}