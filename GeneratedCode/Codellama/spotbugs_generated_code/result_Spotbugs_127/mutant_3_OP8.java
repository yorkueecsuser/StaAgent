import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]

    // Mutant 1: Renaming 'i' to 'j'
    public static void main(String[] args) {
        int j = 0;
        j = j++;
        System.out.println(j);
    }

    // Mutant 2: Renaming 'i' to 'k'
    public static void main(String[] args) {
        int k = 0;
        k = k++;
        System.out.println(k);
    }

    // Mutant 3: Renaming 'i' to 'l'
    public static void main(String[] args) {
        int l = 0;
        l = l++;
        System.out.println(l);
    }

    // Mutant 4: Renaming 'i' to'm'
    public static void main(String[] args) {
        int m = 0;
        m = m++;
        System.out.println(m);
    }

    // Mutant 5: Renaming 'i' to 'n'
    public static void main(String[] args) {
        int n = 0;
        n = n++;
        System.out.println(n);
    }
}