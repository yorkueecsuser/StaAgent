import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        for  (int qekmtoze = 0; qekmtoze < 0; qekmtoze++) {char onkzqttp = 'u';}
        System.out.println(Arrays.toString(words));
    
}
}