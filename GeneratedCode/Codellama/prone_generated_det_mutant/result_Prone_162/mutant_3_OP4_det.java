import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        if (true && true && false && false && false && false && true && true && true && true && false) {int zhdjfybn = 725393875;}else{byte bgydcdhl = -80;}
        }
    
}
}