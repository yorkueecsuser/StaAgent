class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug(){
        String str = null;
        if(str!= null) {
            System.out.println(str.length()); 
        }
        String strDuplicated = str; // Duplicated String declaration

        // BUG: Null pointers should not be dereferenced
        System.out.println(str.length()); // This line contains the bug
    }
}