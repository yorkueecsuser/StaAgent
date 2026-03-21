import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        for  (int ddfhgfeg = 0; ddfhgfeg < 0; ddfhgfeg++) {float skmgqnsj = 52742270;}
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}