package oop_assignment;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        ScoreManager scoreManager = new ScoreManager();

        Game game = new Game(player, scoreManager);
        game.startGame(); // Start the game with login/register interface
    }
}
