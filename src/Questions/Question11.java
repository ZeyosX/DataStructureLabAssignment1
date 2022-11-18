package Questions;

import java.util.Random;

public final class Question11 {
    public static int CalculateThePoints(String[] scores) {
        if (scores.length != 10) throw new IllegalArgumentException("scores must have 10 elements");

        var totalScore = 0;
        for (var score : scores) {
            var indexOfColon = score.indexOf(':');
            var scoreValue = Integer.parseInt(score.substring(0, indexOfColon));
            var opponentScore = Integer.parseInt(score.substring(indexOfColon + 1));

            if (scoreValue > opponentScore) {
                totalScore += 3;
            } else if (scoreValue == opponentScore) {
                totalScore += 1;
            }
        }
        return totalScore;
    }

    public static String[] GenerateRandomScores() {
        var random = new Random();
        var scores = new String[10];
        for (var i = 0; i < scores.length; i++) {
            scores[i] = String.format("%d:%d", random.nextInt(5), random.nextInt(5));
        }
        return scores;
    }
}
