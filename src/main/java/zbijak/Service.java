package zbijak;

import java.util.ArrayList;
import java.util.List;

public class Service {
    Computer computer1 = new Computer(10, 1);
    Computer computer2 = new Computer(10, 10);
    Computer computer3 = new Computer(01, 10);

    User user = new User(1, 1);

    List<Player> playerList = new ArrayList<>(List.of(computer1, computer2, computer3, user));

    public void play(){
        do {
            user.moveUser();
            user.moveUser();
            computer1.moveComputer();
            computer2.moveComputer();
            computer3.moveComputer();

        }while (playerList.size() == 1 || !playerList.contains(user));
    }

    
}
