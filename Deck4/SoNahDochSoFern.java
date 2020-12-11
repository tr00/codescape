import codescape.Dogbot;
public class MyDogbot extends Dogbot {

    public void run() {
        boolean[] path = new boolean[5];
        
        int s = 1, c = 1;
        
        String msg = null, key = null, mv = "lmlmr#a";
        
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
                case 'w':
                    write(key);
                    break;
                case '#':
                    msg = read();
                    break;
                case 'a':
                    c = Integer.parseInt(msg);
                    if(c != 6) {
                        if(c >= s) {
                            mv += path[c - 1] ? "rml#a" : "lmr#a";
                            s = c;
                        } else if(c < s) {
                            mv += path[c - 1] ? "rmla" : "lmra";
                            path[c] = true;
                            msg = c + 1 + "";
                        }
                    } else {
                        mv += "rmpl#klmmrb";
                    }
                    break;
                case 'b':
                    if(--c == 1) {
                        mv += "rmlwllm";
                    } else {
                        mv += path[c - 1] ? "lmrb" : "rmlb";
                    }
                    break;
                case 'k':
                    key = msg;
                    break;
            }
       }
    }


}
