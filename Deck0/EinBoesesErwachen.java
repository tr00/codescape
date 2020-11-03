import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// move(), turnLeft() und turnRight() werden benötigt
		// Die Energiezellen sind ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        for(int i = 0; i < 33; i++)
            switch(i) {
                case 7:
                case 8:
                case 13:
                    turnRight();
                    break;
                case 6:
                    pickUp();
                    break;
                default:
                    move();
            }
        
    }


}
