import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        int dkstswfq = 0;switch  (dkstswfq) {case 1:int rnksfezn = -967943891;break;default:long gghdutfe = -457414122;break;}
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    
}

    // Good behavior
    public String[] goodBehavior() {
        //...
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
    }
}