import java.lang.annotation.*;

@Target(ElementType.ANNOTATION_TYPE)
@interface RequiredModifiers {
    // BUG: RequiredModifiers
}

@interface TestAnnot {
}

@RequiredModifiers
@TestAnnot
class Main {
    public void showBug() {
        System.out.println("showBug method called");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}