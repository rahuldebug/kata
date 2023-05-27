package tennis.kata;

public class ScoreEngine {
    String[] score = {"love", "fifteen", "thirty", "forty", "advantage", "win"};

    public String CalculateScore(Integer p1score, Integer p2score) {
        String score = "";
        if (p1score < 0 || p1score > 5 || p2score < 0 || p2score > 5) {
            throw new IllegalArgumentException("Illegal score passed");
        }
        if (p1score == p2score) {
            score = getScoreForEqualValue(p1score);
        }
        return score;
    }

    private String getScoreForEqualValue(Integer p1score) {
        if (p1score < 3) {
            return score[p1score] + ":" + "ALL";
        }
        if (p1score == 3) {
            return "deuce";
        } else throw new IllegalArgumentException("both cannot win or have advantage at same time");
    }

}