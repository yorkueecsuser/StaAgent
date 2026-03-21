import java.util.Arrays;

class BaseClass {
    int[] showBug() {
        return new int[] {1, 2, 3};
    }
}

class ChildClass extends BaseClass {
    @Override
    int[] showBug() { if (true && false && false && false && false && false && true && true && true && false && false) {short zczwztcz = -4300;}else{char ewngnhty = 'q';}
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