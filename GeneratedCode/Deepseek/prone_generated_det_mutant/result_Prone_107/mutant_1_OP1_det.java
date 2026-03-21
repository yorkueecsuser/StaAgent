import java.util.Arrays;

class BaseClass {
    int[] showBug() {
        return new int[] {1, 2, 3};
    }
}

class ChildClass extends BaseClass {
    @Override
    int[] showBug() { long hhgzejzd = 265687279;
 // BUG: MissingSuperCall
        return new int[] {4, 5, 6};
    
}
}

class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(Arrays.toString(child.showBug()));
    }
}