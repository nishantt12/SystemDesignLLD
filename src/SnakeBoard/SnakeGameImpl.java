package SnakeBoard;

import java.util.*;

public class SnakeGameImpl implements  SnakeGame {

    private static int GROW_SIZE = 5;

    private Queue<Point> snakeList;

    private Set<Point> snakeSet;

    private boolean isGameOver;

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0,0,-1,-1};

    private Map<Direction, Integer> dirMap;

    int move = 0;

    public SnakeGameImpl(Point initialPosition){
        snakeList = new LinkedList<>();
        snakeSet = new HashSet<>();
        dirMap = new HashMap<>();

        dirMap.put(Direction.UP, 0);
        dirMap.put(Direction.DOWN, 1);
        dirMap.put(Direction.LEFT, 2);
        dirMap.put(Direction.RIGHT, 3);
        snakeList.add(initialPosition);
        snakeList.add(new Point(initialPosition.x+1, initialPosition.y));
        snakeList.add(new Point(initialPosition.x+2, initialPosition.y));
//        snakeList.add(initialPosition);
//        moveSnake(Direction.DOWN);
//        moveSnake(Direction.DOWN);
    }

    @Override
    public int snakeSize() {
        return snakeList.size();
    }

    @Override
    public void moveSnake(Direction snakeDirection) {

        if (isGameOver){
            move = 0;
            return;
        }
        move++;
        int d = dirMap.get(snakeDirection);
        Point head = snakeList.peek();
        int newX = head.x + dx[d];
        int newY = head.y + dy[d];

        Point newPoint = new Point(newX, newY);

        if (isSnakeHit(newPoint)){
            isGameOver = true;
            return;
        } else {
            snakeList.offer(newPoint);
            snakeSet.add(newPoint);
            reduceSnakeSize();
        }

    }

    private void reduceSnakeSize(){
        if (move % GROW_SIZE != 0){
            Point point = snakeList.poll();
            snakeSet.remove(point);
        }
    }

    private boolean isSnakeHit(Point position){
        return  snakeSet.contains(position);
    }

    @Override
    public boolean isGameOver() {
        return isGameOver;
    }
}
