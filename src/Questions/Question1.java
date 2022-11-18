package Questions;

public final class Question1 {

    public static int FindSmallestInteger(int[] array) {
        if (array.length < 1) throw new IndexOutOfBoundsException();

        var smallest = Integer.MAX_VALUE;
        for (var number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }

        return smallest;

    }

}
