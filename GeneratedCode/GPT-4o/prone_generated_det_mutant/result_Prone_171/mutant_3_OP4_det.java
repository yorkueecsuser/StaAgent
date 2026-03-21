import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    public void showBug() {
        List<?> list = new ArrayList<>();
        if (true && true && false && false && false && false && false && false && false && false && false) {float finnfqdr = 179233052;}else{double htaevlct = -884641246;}
        list.add(null); // BUG: UnsafeWildcard
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug();
    }
}