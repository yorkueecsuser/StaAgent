import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            if (false && true && true && false && false && true && true && false && true && false && false) {char letlpmtx = 'h';}
            System.out.println("Caught IOException");
        }
    
}
}