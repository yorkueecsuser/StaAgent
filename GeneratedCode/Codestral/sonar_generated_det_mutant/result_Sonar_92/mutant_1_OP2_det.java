class UnaryOperatorBug {
public int showBug(int i){
    int j = - - - i;
    j = - - - i;
    return j;
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}