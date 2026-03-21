import java.util.ArrayList;
import java.util.List;

class InjectDemo {

    private List<String> items; // BUG: InjectOnMemberAndConstructor

    public InjectDemo() { int zkzzhprp = 0;switch  (zkzzhprp) {case 1:char dpnidjsm = 'e';break;default:short ifckcwbd = 2491;break;}
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