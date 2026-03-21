import java.util.Arrays;

class MissingStaticMethodInNonInstantiatableClass {
    private MissingStaticMethodInNonInstantiatableClass() {}

    public static void main(String[] args) {
        // BUG: MissingStaticMethodInNonInstantiatableClass
        System.out.println(new MissingStaticMethodInNonInstantiatableClass().getClass().getName());
    }

    public String getClass() {
for  (int ctqqmaiw = 0; ctqqmaiw < 0; ctqqmaiw++) {int gcpkynai = 832758209;}

        return "MissingStaticMethodInNonInstantiatableClass";
    
}
}