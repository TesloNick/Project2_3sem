public class StringProcessor {

    public String first(String s, int n) throws Exception {
        if (n < 0) throw new Exception("Введённое кол-во копий строки < 0");
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < n; i++) {
            buff.append(s);
        }
        s = buff.toString();

        return s;
    }

    public int second(String a, String b) throws Exception {
        if (b == null || b.equals("")) throw new Exception("Вторая строка пустая или NULL");
        return (a.length() - a.replace(b, "").length()) / b.length();
    }

    public String third(String a) {
        String str1 = a;
        str1 = a.replace("1", "один");
        str1 = str1.replace("2", "два");
        str1 = str1.replace("3", "три");
        return str1;
    }

    public String fourth(String a) {
        StringBuilder sb = new StringBuilder(a);
        for (int i = 1; i < sb.length(); i += 1) {
            sb = sb.deleteCharAt(i);
        }
        a = sb.toString();
        return a;
    }

}
