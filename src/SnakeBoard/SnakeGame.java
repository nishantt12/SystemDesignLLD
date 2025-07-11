package SnakeBoard;

public interface SnakeGame {

    void moveSnake(Direction snakeDirection);

    boolean isGameOver();

    int snakeSize();
}
