package tennis.kata;

public class ScoreEngine {
    String[] score = {"love", "fifteen", "thirty", "forty", "advantage", "win"};

    public String CalculateScore(Integer p1score, Integer p2score) {
        String result = "";
        if (p1score < 0 || p1score > 5 || p2score < 0 || p2score > 5) {
            throw new IllegalArgumentException("Illegal score passed");
        }
        if (p1score == p2score) {
            result = getScoreForEqualValue(p1score);
        }
        if (p1score < p2score) {
            result = getScoreForNotEqualP2(p1score, p2score);
        }
        if (p1score > p2score) {
            result = getScoreForNotEqualP1(p1score, p2score);
        }
        return result;
    }

    private String getScoreForEqualValue(Integer p1score) {
        if (p1score < 3) {
            return score[p1score] + ":" + "ALL";
        }
        if (p1score == 3) {
            return "deuce";
        } else throw new IllegalArgumentException("both cannot win or have advantage at same time");
    }

    private String getScoreForNotEqualP1(Integer p1score, Integer p2score) {
        if (p1score <= 3 && p2score <= 3) {
            return score[p1score] + ":" + score[p2score];
        } else if (p2score == 3 && p1score < 5) {
            return score[p1score] + ":" + score[p2score];
        } else return "win" + ":" + score[p1score];
    }


    private String getScoreForNotEqualP2(Integer p1score, Integer p2score) {
/*        if (p1score <=3 && p2score <=3) {
            return score[p1score] + ":" + score[p2score];
        } else if (p1score == 3 && p2score < 5) {
            return score[p1score] + ":" + score[p2score];
        } else return score[p1score] + ":" + score[p2score];
    }*/

        return null;
    }
}