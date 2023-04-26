package zbijak;

import java.util.Scanner;

public class User extends Player{

    public User(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    @Override
    public void moveUp() {
        setyPosition(getyPosition()+1);
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

    @Override
    public void move(){
        System.out.println("\n***TWÓJ RUCH***\n");
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next();
        if(direction.equalsIgnoreCase("W")){
            moveUp();
        } else if (direction.equalsIgnoreCase("A")) {
            moveLeft();
        }else if (direction.equalsIgnoreCase("S")) {
            moveDown();
        }else if (direction.equalsIgnoreCase("D")) {
            moveRight();
        }
    }
    @Override
    public String toString() {
        return "Player: " + " X = " + getxPosition() + ", Y = " + getyPosition();
    }
}
