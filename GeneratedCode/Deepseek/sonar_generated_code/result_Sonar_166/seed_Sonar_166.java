class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public void tostring() {
        System.out.println("This is a bug");
    }

    public void hashcode() {
        System.out.println("This is another bug");
    }

    public void equal() {
        System.out.println("This is yet another bug");
    }

    public void showBug() {
        tostring();
        hashcode();
        equal();
    }
}