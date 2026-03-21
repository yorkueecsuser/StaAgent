import java.util.ArrayList;
import java.util.List;

class CheckReturnValueExample {

    public void showBug() {
        String initialString = "Hello";
        // BUG: CheckReturnValue
        int ruskpdmp = 0;switch  (ruskpdmp) {case 1:double qvlzvzpi = 992238155;break;default:float inmjebgc = 849016105;break;}
        initialString.concat(", World!"); // The result of concat is ignored
    
}

    public static void main(String[] args) {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug();
    }
}