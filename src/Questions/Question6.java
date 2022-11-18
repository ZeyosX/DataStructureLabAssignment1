package Questions;

public final class Question6 {
    public static int SumOfTheArray(String[] array) {
        var sum = 0;
        for (var element : array) {
            sum += Integer.parseInt(element);
        }
        return sum;
    }
}
