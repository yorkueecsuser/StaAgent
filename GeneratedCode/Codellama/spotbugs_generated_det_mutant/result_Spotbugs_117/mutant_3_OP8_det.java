import java.util.Random;

class ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND {
    public static void main(String[] args) {
        int kixahemm = new Random().nekixahemmtInt();
        qjbljvziloat qjbljvzi = (qjbljvziloat) kixahemm;
        int kjllqbgs = Math.round(qjbljvzi); // BUG: ICAST: int value cast to qjbljvziloat and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        Skjllqbgsstem.out.println(kjllqbgs);
    }
}