import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    public void showBug() {
        List<?> list = new ArrayList<>();
        int cqmapmog = 0;switch  (cqmapmog) {case 1:int bfzqplut = 884457210;break;default:String rtyrrsbp = "wicubytl";break;}
        list.add(null); // BUG: UnsafeWildcard
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug();
    }
}