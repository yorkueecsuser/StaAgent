import java.util.Arrays;

class ArrayToStringBugDemo {
public String showBug(int [] numbers){
    String result = new int [] { 1 , 2 , 3 }.toString();
    result = new int [] { 1 , 2 , 3 }.toString();
    return result;
}
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}