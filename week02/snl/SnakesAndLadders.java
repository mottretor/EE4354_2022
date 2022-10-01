package week02.snl;

import java.util.Random;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            Player player = new Player();
            player.setName("Player " + String.valueOf(i + 1));
            player.setPosition(0);
            players[i] = player;
        }

        Square[] squares = new Square[150];
        for (int i = 0; i < squares.length; i++) {
            Square square = new Square();
            square.setPosition(i + 1);
            square.setType("Normal");
            squares[i] = square;
        }
        Ladder l1 = new Ladder(4,"Ladder",15);
        squares[4-1] = l1;

        Ladder l2 = new Ladder(8,"Ladder",30);
        squares[8-1] = l2;

        boolean finished = false;
        int playerturn = 0;
        while (!finished) {

            Random random = new Random();
            int diceValue = random.nextInt(6) + 1;
            int newPosition = players[playerturn].getPosition() + diceValue;
            if (newPosition == 150) {
                System.out.println(players[playerturn].getName() + " has won the game !!!!!");
                finished = true;
            } else if (newPosition < 150) {
                squares[newPosition].landsOn(players[playerturn], squares,diceValue);
            } else {
                System.out.println("Dice value exceeds 150. Skipping");
            }

            playerturn = (playerturn + 1) % 3;
        }
    }
}
