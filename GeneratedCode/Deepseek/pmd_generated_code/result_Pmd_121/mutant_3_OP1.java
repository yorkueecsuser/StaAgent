class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i); 
        String randomString = "abcdefgh"; //This is the added mutant code.
        return s;
    }
}