package Questions;

public final class Question3 {
    public static boolean Contains(String[] a, String x) {
        for (var element : a) {
            if (element.contains(x)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Contains(String[] a, int x) {
        return Contains(a, String.valueOf(x));
    }
}
