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

    // Mutant 1:
    int j = 0;
    j = j++;
    System.out.println(j);

    // Mutant 2:
    float k = 0.0f;
    k = k++;
    System.out.println(k);

    // Mutant 3:
    int l = 0;
    int m = 1;
    l = l++;
    m = m++;
    System.out.println(l);
    System.out.println(m);

    // Mutant 4:
    int n = 0;
    int o = 1;
    n = n++;
    o = o++;
    System.out.println(n);
    System.out.println(o);

    // Mutant 5:
    double p = 0.0;
    p = p++;
    System.out.println(p);

    // Mutant 6:
    float q = 0.0f;
    q = q++;
    System.out.println(q);

    // Mutant 7:
    int r = 0;
    int s = 1;
    r = r++;
    s = s++;
    System.out.println(r);
    System.out.println(s);

    // Mutant 8:
    int t = 0;
    int u = 1;
    t = t++;
    u = u++;
    System.out.println(t);
    System.out.println(u);

    // Mutant 9:
    double v = 0.0;
    v = v++;
    System.out.println(v);

    // Mutant 10:
    float w = 0.0f;
    w = w++;
    System.out.println(w);
}