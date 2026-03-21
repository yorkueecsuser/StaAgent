import java.util.Arrays;

class ArrayFillDemo {
public void showBug() {
    String [] stringArray = new String [ 42 ];
    stringArray = new String [ 42 ];
    Arrays.fill(stringArray , 42);
}
    
    public static void main(String[] args) {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug();
    }
}