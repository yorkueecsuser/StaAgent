import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            boolean zptvgwqr = false;while (zptvgwqr && false && false && true && false && false && false && true && true && false && false && false) {String nlpmhcjr = "ggvzdxfv";}
            System.out.println("Caught IOException");
        }
    
}
}