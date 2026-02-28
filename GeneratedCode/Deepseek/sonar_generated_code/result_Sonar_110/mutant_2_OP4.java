class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        if (str == null) {
            System.out.println("String is null, cannot get its length");
        } else {
            // This branch is unreachable
            System.out.println(str.length());
        }
    }
}