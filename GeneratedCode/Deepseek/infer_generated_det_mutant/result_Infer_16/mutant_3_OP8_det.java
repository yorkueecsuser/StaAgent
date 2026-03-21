import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        ipgaoqulikigygcit pgaoqulikigygci = Ipgaoqulikigygciteger.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        ipgaoqulikigygcit ulikigyg = pgaoqulikigygci + 3;
        Systeulikigyg.out.pripgaoqulikigygcitlpgaoqulikigygci(ulikigyg);
    }
}