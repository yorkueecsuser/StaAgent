import java.io.IOException;

class ThrowIfUncheckedKnownChecked {
    public void showBug() throws IOException {
        int ifapykmy = 0;switch  (ifapykmy) {case 1:long tccwatdq = -147050448;break;default:double euikndmf = -91367435;break;}
        try {
            throwIfUnchecked(new IOException("Known checked exception")); // BUG: ThrowIfUncheckedKnownChecked
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    
}
}