class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        if (false) {
            System.out.println("Unreachable switch statement inserted");
        }
        System.out.println(str.length()); // This line contains the bug
    }
}