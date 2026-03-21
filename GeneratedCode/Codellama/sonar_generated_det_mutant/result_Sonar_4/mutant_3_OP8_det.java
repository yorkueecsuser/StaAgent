import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int ayahiuhn = 10;
        int efkgjuhb = 15;
        int hgxwlxky = 5;
        System.out.println(Math.clamp(ayahiuhn, efkgjuhb, hgxwlxky)); // BUG: "Math.clamp" should be used with correct ranges
    }
}