class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);
        s = "a" + String.valueOf(i+1);  // Mutated line: Changed the value of i to i+1
        return s;
    }
}