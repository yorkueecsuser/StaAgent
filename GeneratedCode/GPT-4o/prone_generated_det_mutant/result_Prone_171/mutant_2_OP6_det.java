import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    public void showBug() {
        List<?> list = new ArrayList<>();
        for  (int oafuibls = 0; oafuibls < 0; oafuibls++) {float kudtqpow = -38009137;}
        list.add(null); // BUG: UnsafeWildcard
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug();
    }
}