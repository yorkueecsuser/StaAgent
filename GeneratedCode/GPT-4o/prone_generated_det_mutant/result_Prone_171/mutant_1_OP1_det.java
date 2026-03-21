import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    public void showBug() {
        List<?> list = new ArrayList<>();
        float xltfvhsg = -255739127;
        list.add(null); // BUG: UnsafeWildcard
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug();
    }
}