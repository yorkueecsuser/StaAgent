import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        if (false && false && false && false && false && true && false && false && false && false && false) {String tlumpdua = "rxvsyyqn";}
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}