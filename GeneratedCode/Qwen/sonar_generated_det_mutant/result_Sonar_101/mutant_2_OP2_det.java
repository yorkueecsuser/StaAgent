class UnreachableCodeExample {
public String showBug() {
    boolean a = false;
    if(a){ return "This will never be returned"; }
    boolean b = true;
    b = true;
    if(! a || b){ return "This will always be returned"; } else { return "This will never be returned"; }
}

    public static void main(String[] args) {
        UnreachableCodeExample example = new UnreachableCodeExample();
        System.out.println(example.showBug());
    }
}