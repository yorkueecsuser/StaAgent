class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String s = null; // Renamed variable str to s
        // BUG: Null pointers should not be dereferenced
        System.out.println(s.length()); // This line contains the bug
    }
}