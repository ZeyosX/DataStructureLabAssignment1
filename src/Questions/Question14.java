package Questions;

public final class Question14 {

    public static Integer NonConsecutive(int[] numbers)
    {
        if (numbers.length < 2) throw new IllegalArgumentException("Array must have at least 2 elements");

        for (var i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + 1) return numbers[i];
        }
        return null;
    }
}
