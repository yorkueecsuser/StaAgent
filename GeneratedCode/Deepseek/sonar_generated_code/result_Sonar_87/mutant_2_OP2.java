class MainClass {
    public void showBug(int a) {
        if (a > 0) {
            System.out.println("a is positive");
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug(5);
    }
}