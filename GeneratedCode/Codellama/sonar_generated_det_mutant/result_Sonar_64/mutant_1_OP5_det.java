import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            int dkyxbppb = 0;switch  (dkyxbppb) {case 1:boolean ptnuiazp = true;break;default:float aerbmwqs = 978211352;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}