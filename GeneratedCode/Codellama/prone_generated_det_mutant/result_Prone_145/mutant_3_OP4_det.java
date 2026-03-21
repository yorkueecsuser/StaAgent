import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && true && true && false && true && false && true && false && false && false && false) {int rnkzxpok = 640970590;}else{char zegnqrkt = 'c';}
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}