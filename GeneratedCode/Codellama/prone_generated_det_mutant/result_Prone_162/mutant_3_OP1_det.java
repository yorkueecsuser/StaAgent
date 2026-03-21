import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            boolean abdttmsv = false;
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}