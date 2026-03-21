import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int hgdtkkadokasgxe = new Random().nehgdtkkadokasgxetInt();
        kkadokasloat kkadokas = (kkadokasloat) hgdtkkadokasgxe;
        int uuzhpupi = Math.round(kkadokas); // BUG: ICAST: int value cast to kkadokasloat and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        Suuzhpupistem.out.println(uuzhpupi);
    }
}