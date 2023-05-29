package tennis.kata;

public class Game {
    //player can only be initialized with score 0
//    Player p1 = new Player("server");
//
//    Player P2 = new Player("rahul");
    ScoreEngine score = new ScoreEngine();
    String response = "";

    public void play(Player p1, Player p2) {
        do {
            response = playGame(p1, p2);
            System.out.println(response);
        }
        while (response.contains("win"));
    }

    private String playGame(Player p1, Player p2) {
        int winner = (int) (Math.random() * 2);
        if (winner == 1) {
            p1.incrementScore();
        } else {
            p2.incrementScore();
        }
        return score.CalculateScore(p1.getPtr(), p2.getPtr());

    }


}
