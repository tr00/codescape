import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		String m = "1211101";
		for(int i = 0; i < m.length(); i++) {
            switch(m.charAt(i)) {
            case '0':
                move();
                break;
            case '1':
                turnLeft();
                break;
            case '2':
                if(read().equals("R"))
                    m += "11";
                m += "0";
                break;
            }
        }
    }


}
