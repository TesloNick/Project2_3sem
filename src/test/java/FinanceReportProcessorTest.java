import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportProcessorTest {

    @Test
    void getReport() {
        Payment[] array = new Payment[5];
        array[0] = new Payment("GREGOREV.A.A", 01, 01, 2022, 2001);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3055);
        array[2] = new Payment("Setrov.A.B", 11, 03, 2022, 4122);
        array[3] = new Payment("Sidorov.G.T", 16, 11, 2020, 5034);
        array[4] = new Payment("Kalinev.C.F", 04, 04, 2022, 6972);

        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 04, 04, 2022);
        FinanceReport result = FinanceReportProcessor.getReport(report, "S");

        assertEquals(2, result.getArr().length);
    }

    @Test
    void getPayment() {
        Payment[] array = new Payment[5];
        array[0] = new Payment("GREGOREV.A.A", 01, 01, 2022, 2001);
        array[1] = new Payment("Ivanov.I.I", 20, 12, 2021, 3055);
        array[2] = new Payment("Setrov.A.B", 11, 03, 2022, 4122);
        array[3] = new Payment("Sidorov.G.T", 16, 11, 2020, 5034);
        array[4] = new Payment("Kalinev.C.F", 04, 04, 2022, 6972);

        FinanceReport report = new FinanceReport(array, "Teslov.N.A", 04, 04, 2022);
        FinanceReport result = FinanceReportProcessor.getPayment(report, 5000);

        assertEquals(3, result.getArr().length);
    }
}