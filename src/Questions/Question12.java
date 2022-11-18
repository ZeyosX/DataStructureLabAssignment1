package Questions;

public final class Question12 {
    public static long SumEveryNumber(int number) {
        if (number < 0) throw new IllegalArgumentException("Number must be positive");
        return number * (number + 1L) / 2L;
    }
}
