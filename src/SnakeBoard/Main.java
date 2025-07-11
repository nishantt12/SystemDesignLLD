package SnakeBoard;

public class Main {

    public static void main(String[] args) {

        SnakeGameImpl snakeGame = new SnakeGameImpl(new Point(5, 5));

        snakeGame.moveSnake(Direction.DOWN);
        System.out.println(snakeGame.snakeSize());
        if (checkGameOver(snakeGame)) return;
        snakeGame.moveSnake(Direction.LEFT);
        System.out.println(snakeGame.snakeSize());
        if(checkGameOver(snakeGame)) return;
        snakeGame.moveSnake(Direction.UP);
        snakeGame.moveSnake(Direction.UP);
        snakeGame.moveSnake(Direction.UP);
        snakeGame.moveSnake(Direction.UP);
        System.out.println(snakeGame.snakeSize());

        System.out.println(snakeGame.snakeSize());

    }

    private static boolean checkGameOver(SnakeGameImpl snakeGame) {
        if (snakeGame.isGameOver()) {
            System.out.println("Game over!!!");
            return true;
        }

        return  false;
    }
}
