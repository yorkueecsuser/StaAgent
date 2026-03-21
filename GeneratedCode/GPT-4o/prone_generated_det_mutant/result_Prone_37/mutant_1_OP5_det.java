import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    // This method demonstrates the double-brace initialization bug
    public List<String> showBug() {
        List<String> countries = new ArrayList<String>() {{
            add("Denmark");
            add("Norway");
            add("Sweden");
        int euwvlmiy = 0;switch  (euwvlmiy) {case 1:String wnyetkse = "utujtxyn";break;default:float kdkuuyip = -44781871;break;}
        }}; // BUG: DoubleBraceInitialization
        return countries;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        List<String> result = example.showBug();
        System.out.println(result);
    }
}