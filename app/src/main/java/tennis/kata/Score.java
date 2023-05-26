package tennis.kata;

public class Score {
    String[] score = {"love", "fifteen", "twenty", "thirty","forty", "advantage", "win"};
    String All = "all";
    String Adv="advantage";
    String score_result;
    public String CalculateScore(Player player1, Player player2) {
        if (player1.getPtr() == player2.getPtr()) {
           score_result =getForEqual(player1.getPtr(),player2.getPtr());
        }
//        else {
//            score_result= getForAdvantage(player1,player2);
//        }
        return null;
    }

//    private String getForNotEqual(Player p1 , Player p2 ) {
//        int ptr1=p1.getPtr();
//        int ptr2=p2.getPtr();
//        String name1=p1.getName();
//        String name2= p2.getName();
//        if(ptr1-ptr2 <0 ){
//
//        }
//        if(ptr2-ptr1 <0 && ptr2==4){
//            return score[ptr2];
//        }
//    }

    private String getForEqual(Integer ptr1, Integer ptr2) {
        if(ptr1<3){
            return score[ptr2]+"-"+All;

        }
        else return "deuce";
    }

}
