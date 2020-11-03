import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// move(), turnLeft() und turnRight() werden benötigt
		// Die Energiezellen sind ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        for(int i = 0; i < 33; i++)
            switch(i) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 10:
                case 13:
                case 14:
                case 15:
                case 19:
                case 20:
                case 21:
                case 25:
                case 26:
                case 28:
                case 29:
                case 30:
                    turnLeft();
                    break;
                case 2:
                case 24:
                    pickUp();
                    break;
                default:
                    move();
            }
        
    }


}
