import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
        String mv = "LARR";
        
        for(int i = 0; i < 20; i++) {
            switch(mv.charAt(i)) {
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'M':
                    move();
                    break;
                case 'A':
                    mv += read().replace(",", "") + "MLM";
                    break;
            }
        }

    }


}
