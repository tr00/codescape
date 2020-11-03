import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Die Energiezelle ist ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        for(int i = 0; i < 11; i++) {
            switch(i) {
                case 1:
                case 5:
                case 6:
                case 8:
                    turnRight();
                    break;
                case 4:
                    pickUp();
                    break;
                default:
                    move();
            }
        }
    }

    
}
