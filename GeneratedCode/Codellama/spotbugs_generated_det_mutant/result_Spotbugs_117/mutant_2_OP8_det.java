import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int rgvbfnhpbsfqtuxvgwlsxb = new Random().nergvbfnhpbsfqtuxvgwlsxbtInt();
        rgvbfnhpbsfqtuxloat rgvbfnhpbsfqtux = (rgvbfnhpbsfqtuxloat) rgvbfnhpbsfqtuxvgwlsxb;
        int fnhpbsfq = Math.round(rgvbfnhpbsfqtux); // BUG: ICAST: int value cast to rgvbfnhpbsfqtuxloat and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        Sfnhpbsfqstem.out.println(fnhpbsfq);
    }
}