package zbijak;

import java.util.Random;

public class Computer extends Player{


    public Computer(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    public int chooseDirection(){
        Random random = new Random();
        int direction = random.nextInt(1, 5);
        return direction;
    }

    @Override
    public void moveUp() {
        setyPosition(getyPosition() + 1);
    }

    @Override
    public void moveDown() {
        setyPosition(getyPosition() - 1);
    }

    @Override
    public void moveLeft() {
        setxPosition(getxPosition() - 1);
    }

    @Override
    public void moveRight() {
        setxPosition(getxPosition() + 1);
    }

//    @Override
//    public void move(){
//        chooseDirection();
//        if (chooseDirection()==1){
//            moveUp();
//        } else if (chooseDirection()==2) {
//            moveDown();
//        } else if (chooseDirection()==3) {
//            moveLeft();
//        } else if (chooseDirection()==4) {
//            moveRight();
//        }
//    }

    @Override
    public void move(){
        if(getyPosition() == 10) {
            chooseDirection();
            if (chooseDirection() == 1) {
               move();
            } else if (chooseDirection() == 2) {
                moveDown();
            } else if (chooseDirection() == 3) {
                moveLeft();
            } else if (chooseDirection() == 4) {
                moveRight();
            }
        } else if (getyPosition() == 1) {
            chooseDirection();
            if (chooseDirection() == 1) {
                moveUp();
            } else if (chooseDirection() == 2) {
                move();
            } else if (chooseDirection() == 3) {
                moveLeft();
            } else if (chooseDirection() == 4) {
                moveRight();
            }
        } else if (getxPosition() == 1) {
            chooseDirection();
            if (chooseDirection() == 1) {
                moveUp();
            } else if (chooseDirection() == 2) {
                moveDown();
            } else if (chooseDirection() == 3) {
                move();
            } else if (chooseDirection() == 4) {
                moveRight();
            }
        } else if (getxPosition() == 10) {
            chooseDirection();
            if (chooseDirection() == 1) {
                moveUp();
            } else if (chooseDirection() == 2) {
                moveDown();
            } else if (chooseDirection() == 3) {
                moveLeft();
            } else if (chooseDirection() == 4) {
                move();
            }
        }else {
            chooseDirection();
            if (chooseDirection()==1){
                moveUp();
            } else if (chooseDirection()==2) {
                moveDown();
            } else if (chooseDirection()==3) {
                moveLeft();
            } else if (chooseDirection()==4) {
                moveRight();
            }
        }
    }


    @Override
    public String toString() {
        return "Computer: " + " X = " + getxPosition() + ", Y = " + getyPosition();
    }
}
