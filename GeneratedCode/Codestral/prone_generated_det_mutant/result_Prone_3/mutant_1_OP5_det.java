import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        int pzyemyds = 0;switch  (pzyemyds) {case 1:char tzcwltyo = 'e';break;default:float uvmvhrha = 751579651;break;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}