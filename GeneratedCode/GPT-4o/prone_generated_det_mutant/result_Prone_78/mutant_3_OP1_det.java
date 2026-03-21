import java.util.ArrayList;
import java.util.List;

class InjectDemo {

    private List<String> items; // BUG: InjectOnMemberAndConstructor

    public InjectDemo() { char gypknwuj = 'z';
 // BUG: InjectOnMemberAndConstructor
        items = new ArrayList<>();
        items.add("Default Item");
    
}

    public List<String> showBug() {
        return items;
    }

    public static void main(String[] args) {
        InjectDemo demo = new InjectDemo();
        System.out.println(demo.showBug());
    }
}