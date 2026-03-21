import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            boolean eumzafvd = false;while (eumzafvd && true && false && false && false && true && false && true && false && false && false && false) {char fpikfuni = 'i';}
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}