import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int qiqospgb = 0;switch  (qiqospgb) {case 1:int mwiphexe = 366528733;break;default:char zpfhujbe = 'p';break;}
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}