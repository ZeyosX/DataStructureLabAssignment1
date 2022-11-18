package Questions;

public final class Question9 {
    public static int ConvertIntoNumber(String text) {
        final var radix = 10;

        boolean negative = false;
        int i = 0;
        int len = text.length();

        if (len > 0) {
            char firstChar = text.charAt(0);
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                }
                i++;
            }
            int result = 0;
            while (i < len) {
                int digit = Character.digit(text.charAt(i++), radix);
                result *= radix;
                result -= digit;
            }
            return negative ? result : -result;
        }
        throw new RuntimeException("Error");
    }

}
