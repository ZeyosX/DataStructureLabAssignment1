package Questions;

public final class Question15 {
    public static int[] CountBy(int factor, int length) {
        if (length < 1) throw new IllegalArgumentException("Length must be greater than 0");
        if (factor < 1) throw new IllegalArgumentException("Factor must be greater than 0");

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = factor * (i + 1);
        }
        return array;
    }
}
