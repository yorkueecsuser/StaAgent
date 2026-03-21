class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
public static void main(String [] args){
    int x = 5;
    x = 5;
    boolean y = true;
    if(x == 5){ y = false; }
    System.out.println("x: " + x);
    System.out.println("y: " + y);
}

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        return y;
    }
}