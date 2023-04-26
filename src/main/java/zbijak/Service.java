package zbijak;

import java.util.ArrayList;
import java.util.List;

public class Service {
    Computer computer1 = new Computer(3, 1);
    Computer computer2 = new Computer(3, 3);
    Computer computer3 = new Computer(1, 3);

    User user = new User(1, 1);

    List<Player> playerList = new ArrayList<>(List.of(computer1, computer2, computer3, user));

    public void play(){
        do {
            user.move();
            System.out.println(user);
            emptyFieldCheck();
            if(playerList.size() == 1){
                break;
            }
            user.move();
            System.out.println(user);
            emptyFieldCheck();
            if(playerList.size() == 1){
                break;
            }
            enemyMove();
            if (!playerList.contains(user)){
                break;
            }
            for (int i = 0; i < playerList.size()-1 ; i++) {
                System.out.println(playerList.get(i));
            }
        }while (playerList.size() != 0);
    }
    
    public void emptyFieldCheck () {
        for (int i = 0; i < playerList.size()-1; i++) {
            if (playerList.get(i).getxPosition() == user.getxPosition() && playerList.get(i).getyPosition() == user.getyPosition()) {
                System.out.println("TRAFIONY");
                playerList.remove(playerList.get(i));
                }
            }
        }

    public void enemyMove(){
        for (int i = 0; i < playerList.size()-1; i++) {
            Computer computer = (Computer) playerList.get(i);
            computer.move();
//            do {
//                computer.moveComputer();
//                System.out.println(computer);
//            }while(computer.getxPosition() < 1 || computer.getxPosition() > 3 || computer.getyPosition() < 1 || computer.getyPosition() > 3 );

            if(computer.getxPosition() == user.getxPosition() && computer.getyPosition() == user.getyPosition()){
                System.out.println("GAME OVER");
                playerList.remove(user);
                break;
            }

        }
    }
}
