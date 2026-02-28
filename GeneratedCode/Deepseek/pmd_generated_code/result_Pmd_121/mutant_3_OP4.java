class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        
        if(false) {
            // MUTANT
            s = "a" + 5;    // Mutated line: Unreachable branch added
        } else {
            s = "a" + String.valueOf(i);    // Original line
        }
        
        return s;
    }
}