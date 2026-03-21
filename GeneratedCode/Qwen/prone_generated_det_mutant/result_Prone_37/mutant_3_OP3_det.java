import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    public List<String> showBug() {
        // BUG: DoubleBraceInitialization
        if (false && true && true && true && true && false && false && true && true && true && false) {int zkzudpfc = -561237921;}
        List<String> countries = new ArrayList<>() {
            {
                add("Denmark");
                add("Norway");
                add("Sweden");
            }
        };
        return countries;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        System.out.println(example.showBug());
    }
}