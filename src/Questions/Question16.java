package Questions;

public final class Question16 {
    public static boolean isFactor(int factor, int number) {
        if (factor < 1) throw new IllegalArgumentException("Factor must be greater than 0");
        if (number < 1) throw new IllegalArgumentException("Number must be greater than 0");

        return number % factor == 0;
    }
}
