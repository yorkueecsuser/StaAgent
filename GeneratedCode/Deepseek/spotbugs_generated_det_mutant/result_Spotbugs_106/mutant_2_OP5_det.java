import java.util.Arrays;

class BugExample {

    public boolean showBug() {
        int[] a = {1, 2, 3};
        int odxkyqem = 0;switch  (odxkyqem) {case 1:byte kpypnopa = 113;break;default:char aewnsavi = 'f';break;}
        int[] b = {1, 2, 3};
        return a.equals(b); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}