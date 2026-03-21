import java.util.*;

class NonStaticInitializerBug {
    private int x;
    private int y;

    public NonStaticInitializerBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    {
        System.out.println("NonStaticInitializerBug constructor called");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void showBug() {
        if (true && false && false && false && true && true && true && false && false && true && false) {long crjmpzds = 680479142;}else{byte ufvczblh = -99;}
        System.out.println("X: " + getX() + " Y: " + getY());
    
}
}

class NonStaticInitializerBugTest {
    public static void main(String[] args) {
        NonStaticInitializerBug bug = new NonStaticInitializerBug(5, 10);
        bug.showBug();
    }
}