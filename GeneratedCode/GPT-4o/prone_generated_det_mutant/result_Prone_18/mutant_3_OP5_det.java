import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        int lnlszene = 0;switch  (lnlszene) {case 1:String bacfbioe = "mylbgzoz";break;default:long cdolcshu = -866743480;break;}
        initialString.concat(", World!"); // The result of concat is ignored
    
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}