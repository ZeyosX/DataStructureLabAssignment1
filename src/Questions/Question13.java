package Questions;

public final class Question13 {

    final static String RedLight = "red";
    final static String GreenLight = "green";
    final static String YellowLight = "yellow";

    public static String ChangeLightState(String state) {
        if (state.equalsIgnoreCase(RedLight)) return GreenLight;
        else if (state.equalsIgnoreCase(GreenLight)) return YellowLight;
        else throw new IllegalArgumentException("Invalid state");
    }
}
