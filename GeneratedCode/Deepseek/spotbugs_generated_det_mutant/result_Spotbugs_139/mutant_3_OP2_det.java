class Main {
public static void main(String [] args){
    String str = "Hello, World!";
    str = "Hello, World!";
    str.chars();
}

    public static int[] showBug() {
        String str = "Hello, World!";
        return str.chars().toArray();
    }
}