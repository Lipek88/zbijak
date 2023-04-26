package zbijak;

import java.util.ArrayList;
import java.util.List;

public class Service {
    Computer computer1 = new Computer(3, 1);
    Computer computer2 = new Computer(3, 3);
    Computer computer3 = new Computer(1, 3);

    User user = new User(1, 1);

//    List<Computer> playerList = new ArrayList<>(List.of(computer1, computer2, computer3));
    List<Computer> playerList = new ArrayList<>(List.of(computer1, computer2, computer3));

    public void play(){
        do {
            user.moveUser();
            System.out.println(user);
            emptyFieldCheck();
            user.moveUser();
            System.out.println(user);
            emptyFieldCheck();
//            computer1.moveComputer();

//            computer2.moveComputer();

//            computer3.moveComputer();

            for (Computer computer : playerList){
                System.out.println(computer);
            }
        }while (playerList.size() != 0);
    }
    
    public void emptyFieldCheck () {
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).getxPosition() == user.getxPosition() && playerList.get(i).getyPosition() == user.getyPosition()) {
                System.out.println("TRAFIONY");
                playerList.remove(playerList.get(i));
                }
            }
        }


}
