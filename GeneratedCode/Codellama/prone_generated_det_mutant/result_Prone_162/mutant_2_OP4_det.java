import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            if (false && true && false && true && true && false && true && true && false && false && false) {char zcjohhsr = 'h';}else{int nitfkpbr = 916881881;}
            System.out.println("Caught IOException");
        }
    
}
}