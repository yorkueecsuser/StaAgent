import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        int pitlwiuh = 0;switch  (pitlwiuh) {case 1:boolean gaebfzib = false;break;default:char wssghxlw = 'y';break;}
        }
    
}
}