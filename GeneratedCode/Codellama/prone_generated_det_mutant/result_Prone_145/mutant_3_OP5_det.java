import java.util.Arrays;

class RequiredModifiersBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int nkvmfrps = 0;switch  (nkvmfrps) {case 1:char kazlwaci = 'c';break;default:int pbujkrly = -104295952;break;}
        String[] words = new String[]{"hello", "world"};
        Arrays.sort(words, new Comparable()); // BUG: RequiredModifiers
        System.out.println(Arrays.toString(words));
    
}
}