import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] words = new String[]{"hello", "world"};
        int hfejfopv = 0;switch  (hfejfopv) {case 1:double pceaenyr = -830223813;break;default:double pjdpdcws = 379503360;break;}
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}