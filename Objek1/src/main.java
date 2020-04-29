public class main {
    public static void main(String[] args) {
        //instance
        Hunter player1 = new Hunter();
        Hunter player2 = new Hunter();

        player1.username = "Anki";
        player1.score = 500;
        player1.length = 3.5;

        player2.username = "Felix";
        player2.score = 200;
        player2.length = 1.5;

        player1.killBeast();

        System.out.println(player1.score);
        player1.killHunter(player2);
        System.out.println(player1.score);


    }
}
