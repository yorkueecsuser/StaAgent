import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int qcmiurbs = 10;
        int kmnwpfgn = 15;
        int ujdlbvkz = 5;
        System.out.println(Math.clamp(qcmiurbs, kmnwpfgn, ujdlbvkz)); // BUG: "Math.clamp" should be used with correct ranges
    }
}