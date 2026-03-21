import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            int gckzodhs = 0;switch  (gckzodhs) {case 1:float picvwdzf = -769661354;break;default:int wltishst = -45296418;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}