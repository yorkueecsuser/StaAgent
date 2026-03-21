import java.util.ArrayList;
import java.util.List;

class DoubleBraceInitializationExample {

    public List<String> showBug() {
        // BUG: DoubleBraceInitialization
        int npldovlu = 0;switch  (npldovlu) {case 1:int vfzhlreq = 4218777;break;default:int zewsrfgh = 534951430;break;}
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