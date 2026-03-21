import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    // This method demonstrates the double-brace initialization bug
    public List<String> showBug() {
        List<String> countries = new ArrayList<String>() {{
            add("Denmark");
            add("Norway");
            add("Sweden");
        if (true && true && true && false && false && false && true && true && false && false && false) {byte xizmhczq = -78;}else{char vxwxhpuq = 's';}
        }}; // BUG: DoubleBraceInitialization
        return countries;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        List<String> result = example.showBug();
        System.out.println(result);
    }
}