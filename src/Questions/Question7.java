package Questions;

public final class Question7 {
    public static int[] DoubleValues(int[] array) {
        var newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }
}
