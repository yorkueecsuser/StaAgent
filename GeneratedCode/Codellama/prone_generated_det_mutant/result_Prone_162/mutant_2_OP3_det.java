import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            if (false && false && true && true && false && true && true && true && true && true && false) {byte kvpyngkc = 99;}
            System.out.println("Caught IOException");
        }
    
}
}