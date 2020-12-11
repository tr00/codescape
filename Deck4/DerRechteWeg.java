import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run(int nr) {
        String A, B;
        if(nr <= 2) {
            A = "l";
            B = "r";
        } else {
            A = "r";
            B = "l";
        }
        String C, D;
        if(nr % 2 == 0) {
            C = "r";
            D = "";
        } else {
            C = "l";
            D = "ll";
        }
		
        String mv = "mAmmmBmmCmmDmpm".replace("A", A).replace("B", B).replace("C", C).replace("D", D);
        
        for(int i = 0; i < mv.length(); i++) {
            switch(mv.charAt(i)) {
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'm':
                    move();
                    break;
                case 'p':
                    pickUp();
                    break;
            }
        }
        
    }


}
