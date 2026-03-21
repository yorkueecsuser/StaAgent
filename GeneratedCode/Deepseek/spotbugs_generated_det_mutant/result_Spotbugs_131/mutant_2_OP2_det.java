import java.util.Arrays;

class BugExample {
public int showBug(int [] array){
    int result = array.hashCode();
    result = array.hashCode();
    return result;
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(be.showBug(array));
    }
}