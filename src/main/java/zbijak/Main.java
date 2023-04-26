package zbijak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer(1, 1);
        computer.moveComputer();
        System.out.println(computer);

    }
}
