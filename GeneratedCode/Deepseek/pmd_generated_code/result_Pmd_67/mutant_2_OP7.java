import java.util.Arrays;

class Example {
    public int[] badBehavior() {
        return null; 
    }

    public String[] goodBehavior() {
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); 
    }
}