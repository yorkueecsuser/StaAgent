import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        if (true && true && false && true && false && false && true && true && false && false && false) {double szlnbrvv = -584848430;}else{int fpnwewyx = 520768606;}
        }
    
}
}