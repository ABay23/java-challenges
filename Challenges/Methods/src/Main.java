public class Main {
    public static void main(String[] args){
        String name = "Joe";
        int position = 5;
        int score = 900;

        int highScorePosition = calculatedHighScorePosition(20);
        displayHighScorePosition("jay", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculatedHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
