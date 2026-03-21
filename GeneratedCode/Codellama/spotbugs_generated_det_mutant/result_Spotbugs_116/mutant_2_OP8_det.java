import java.lang.Math;

class BugDemo {
    public static void main(String[] args) {
        int uxqlcljdzwwtbxq = 10;
        double lcljdzww = (double)uxqlcljdzwwtbxq;
        Slcljdzwwstem.out.println(Math.ceil(lcljdzww)); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    }
}