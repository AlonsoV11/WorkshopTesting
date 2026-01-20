package es.fplumara.dam1.workshoptesting.core.calculator.util;

public class TextUtils {

    private TextUtils() {
    }

    public static String normalize(String s) {
        if (s == null) return null;
        return s.toLowerCase();
    }
}
