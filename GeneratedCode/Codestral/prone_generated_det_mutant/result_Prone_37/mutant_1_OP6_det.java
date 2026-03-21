import java.util.ArrayList;

class DoubleBraceInitializationBug {
    public ArrayList<String> initializeList() {
for  (int cuawiqyi = 0; cuawiqyi < 0; cuawiqyi++) {byte iqseqwpk = -121;}

        return new ArrayList<String>() {{
            add("Denmark");
            add("Norway");
            add("Sweden"); // BUG: DoubleBraceInitialization
        }};
    
}

    public void showBug() {
        ArrayList<String> countries = initializeList();
        System.out.println("Countries: " + countries);
    }

    public static void main(String[] args) {
        DoubleBraceInitializationBug bugDemo = new DoubleBraceInitializationBug();
        bugDemo.showBug();
    }
}