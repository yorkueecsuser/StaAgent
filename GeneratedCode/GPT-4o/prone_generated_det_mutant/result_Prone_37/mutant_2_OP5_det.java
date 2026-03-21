import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    // This method demonstrates the double-brace initialization bug
    public List<String> showBug() {
        List<String> countries = new ArrayList<String>() {{
            add("Denmark");
            add("Norway");
            add("Sweden");
        int dpfpnrta = 0;switch  (dpfpnrta) {case 1:double wltqxcxv = 798987351;break;default:boolean pggcydis = true;break;}
        }}; // BUG: DoubleBraceInitialization
        return countries;
    
}

    public static void main(String[] args) {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        List<String> result = example.showBug();
        System.out.println(result);
    }
}