import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        for  (int xrogfqmc = 0; xrogfqmc < 0; xrogfqmc++) {short gehokxwq = -7900;}
        System.out.println(Arrays.toString(words));
    
}
}