package BazziGamesLLDInterview;

public class TikTacToa {

    int board[][];

    Player player1;
    Player player2;

    Player currentPlayer;

    public TikTacToa() {
        board = new int[3][3];
    }

    public void addPlayer(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public boolean move(Position position) {
        if (currentPlayer == player1) {
            currentPlayer.moves[position.x][position.y] = 1;
        } else {
            currentPlayer.moves[position.x][position.y] = 0;
        }

        return true;
    }


    private boolean isWinner() {

        int winnerMove;

        if(currentPlayer==player1){
            winnerMove = 1;
        } else {
            winnerMove = 0;
        }

        for (int i =0 ; i< 3; i++){
            // Checking rows

        }


    }


}
