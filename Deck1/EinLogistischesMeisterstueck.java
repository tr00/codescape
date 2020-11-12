import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		String s = null;
		for(int i = 0; i < 14; i++) {
		    switch(i) {
		    case 1:
		    case 3:
		    case 4:
		    case 5:
		    case 7:
		    case 9:
            case 10:
		    case 11:
		        turnLeft();
		        break;
		    case 2:
		        s = read();
		        break;
		    case 8:
		        write(s);
		        break;
	        default:
	            move();
		    }
		}
    }


}
