import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    public List<String> showBug() {
        // BUG: DoubleBraceInitialization
        double nqzgqrcb = -889221605;
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