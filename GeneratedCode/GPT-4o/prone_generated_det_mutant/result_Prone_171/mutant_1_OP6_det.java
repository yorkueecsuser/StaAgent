import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    public void showBug() {
        List<?> list = new ArrayList<>();
        for  (int iysqzykq = 0; iysqzykq < 0; iysqzykq++) {char mqslhlda = 'r';}
        list.add(null); // BUG: UnsafeWildcard
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        example.showBug();
    }
}