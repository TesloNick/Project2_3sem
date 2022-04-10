import static org.junit.jupiter.api.Assertions.*;

class FinanceReportTest {

    @org.junit.jupiter.api.Test
    void getPaymentsLength() {
        Payment[] array = new Payment[5];
        array[0] = new Payment("GREGOREV.A.A", 1, 1, 2022, 2000);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3000);
        array[2] = new Payment("Petrov.A.B", 11, 3, 2022, 4000);
        array[3] = new Payment("Sidorov.G.T", 16, 11, 2020, 5000);
        array[4] = new Payment("Kalinev.C.F", 4, 4, 2022, 6000);
        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 4, 4, 2022);

        assertEquals(5, report.getPaymentsLength(array));
    }

    @org.junit.jupiter.api.Test
    void getPayment() {
        int index = 2;

        Payment[] array = new Payment[5];
        array[0] = new Payment("GREGOREV.A.A", 1, 1, 2022, 2000);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3000);
        array[2] = new Payment("Petrov.A.B", 11, 3, 2022, 4000);
        array[3] = new Payment("Sidorov.G.T", 16, 11, 2020, 5000);
        array[4] = new Payment("Kalinev.C.F", 4, 4, 2022, 6000);
        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 4, 4, 2022);

        assertEquals(array[2], report.getPayment(index));
    }

    @org.junit.jupiter.api.Test
    void setPayment() {
        int index = 1;
        Payment[] array = new Payment[5];
        array[0] = new Payment("GREGOREV.A.A", 1, 1, 2022, 2000);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3000);
        array[2] = new Payment("Petrov.A.B", 11, 3, 2022, 4000);
        array[3] = new Payment("Sidorov.G.T", 16, 11, 2020, 5000);
        array[4] = new Payment("Kalinev.C.F", 4, 4, 2022, 6000);
        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 4, 4, 2022);

        report.setPayment(array[4], index);
        assertEquals(array[index], report.getPayment(index));
    }

    @org.junit.jupiter.api.Test
    void toString1() {
        Payment[] array = new Payment[2];
        array[0] = new Payment("GREGOREV.A.A", 1, 1, 2022, 2011);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3005);

        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 1, 4, 2022);

        assertEquals("[Автор: Teslov.N.A, дата: 1.4.2022, Платежи: \n" +
                "[Плательщик: GREGOREV.A.A, дата: 1.1.2022 сумма: 20 руб. 11 коп. \n" +
                ", Плательщик: Ivanov.I.I, дата: 20.12.2021 сумма: 30 руб. 05 коп. \n" +
                "]]", report.toString());
    }
}