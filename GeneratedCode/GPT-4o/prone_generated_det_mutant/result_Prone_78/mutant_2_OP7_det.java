import java.util.ArrayList;
import java.util.List;

class InjectDemo {

    private List<String> items; // BUG: InjectOnMemberAndConstructor

    public InjectDemo() { boolean ptciuigj = false;while (ptciuigj && false && false && false && false && true && true && false && true && true && true && false) {char zuniabdm = 'w';}
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