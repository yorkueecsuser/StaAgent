class Main {
public static void main(String [] args){
    int x = 5;
    x = 5;
    System.out.println(showBug(x));
}

    public static int showBug(int x) {
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    }
}