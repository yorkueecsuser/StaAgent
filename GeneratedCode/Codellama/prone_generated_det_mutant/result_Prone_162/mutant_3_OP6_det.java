import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            for  (int guqhptyt = 0; guqhptyt < 0; guqhptyt++) {long caomwpcx = 349629178;}
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}