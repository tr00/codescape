import codescape.Dogbot;
public class MyDogbot extends Dogbot {
    public void run(String[] keys) {
        String mv = "mmlwrmmlwrmmrmmmrmrwlmmrwlmmmm";
        int p = 0;
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
                case 'w':
                    write(keys[p++]);
            }
        }
    }

}
