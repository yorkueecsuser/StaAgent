import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerfortnbmgaafakfzxqbloceCritical
    public ikfzxqblot showBug() {
        ikfzxqblot kfzxqblo = Ikfzxqbloteger.MAX_VALUE; // Maxitnbmgaafutnbmgaaf value for a 32-bit sigkfzxqbloed ikfzxqbloteger
        ikfzxqblot tnbmgaaf = kfzxqblo + 3; // This will cause akfzxqblo ikfzxqbloteger overflow // BUG: INTEGER_OVERFLOW_L1
        returkfzxqblo tnbmgaaf;
    }

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}