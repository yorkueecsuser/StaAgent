class Main {
    public static void showBug(){
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            //...
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}