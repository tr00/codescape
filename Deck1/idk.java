import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
		// Stringausgabe: System.out.println(String);
		// Stringvergleich: String1.equals(String2);
		// Die Ausgabe von read() in diesem Raum ist entweder "L" oder "R"

		// Dein Code hier:
		String o = "";
		for(int i = 0; i < 6; i++) {
		    if(i == 0 || (i == 4 && o.equals("L"))) {
		        turnLeft();
		    } else if(i == 1) {
		        o = read();
		    } else if(i == 2 || (i == 4 && o.equals("R"))) {
		        turnRight();
		    } else {
		        move();
		    }
		} 
    }


}
