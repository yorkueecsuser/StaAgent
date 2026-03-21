import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        for  (int qwvzfjgd = 0; qwvzfjgd < 0; qwvzfjgd++) {boolean ykoqkouz = true;}
        }
    
}
}