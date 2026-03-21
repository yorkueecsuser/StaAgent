import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            int ykiuokjo = 0;switch  (ykiuokjo) {case 1:String fwwaqskn = "sotdmjjc";break;default:boolean uthyxsfw = true;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}