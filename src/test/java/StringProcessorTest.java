import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void first() throws Exception {
        int n = 2;
        String s = new String("Hello");
        assertEquals("HelloHello", new StringProcessor().first(s, n));
    }

    @Test
    void second() throws Exception {
        String s = new String("abc ab bcab");
        String s2 = new String("ab");
        assertEquals(3, new StringProcessor().second(s, s2));
    }

    @Test
    void third() {
        String s = new String("123456");
        assertEquals("одиндватри456", new StringProcessor().third(s));
    }

    @Test
    void fourth() {
        String s = new String("ababab");
        assertEquals("aaa", new StringProcessor().fourth(s));
    }
}