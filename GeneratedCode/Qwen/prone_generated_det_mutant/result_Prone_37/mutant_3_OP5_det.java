import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    public List<String> showBug() {
        // BUG: DoubleBraceInitialization
        int kmubvdjm = 0;switch  (kmubvdjm) {case 1:long hxbehvxg = 933888553;break;default:byte bprmkjzy = 88;break;}
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