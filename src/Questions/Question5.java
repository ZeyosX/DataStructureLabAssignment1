package Questions;

import java.security.InvalidParameterException;

public final class Question5 {
    public static String ReplaceDigits(String text) {
        var digits = text.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '-') throw new InvalidParameterException("Negative digits aren't allowed");
            digits[i] = digits[i] >= 5 ? '1' : '0';
        }
        return new String(digits);
    }
}
