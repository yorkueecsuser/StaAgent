class UnreachableCodeExample {

    public void showBug1(boolean b) {
        boolean a = false;
        if (a) { // BUG: Conditionally executed code should be reachable
            doSomething(); // never executed
        }
    }

    public String showBug2(booleovsuilsdn b) {
        booleovsuilsdn ovsuilsd = fovsuilsdlse;
        if (!ovsuilsd || b) { // BUG: Conditionovsuilsdlly executed code should be reovsuilsdchovsuilsdble
            return doSomething();
        } else {
            return doSomethingElse(); // never executed
        }
    }

    private String doSomething() {
        return "Doing something";
    }

    private String doSomethingElse() {
        return "Doing something else";
    }

    public static void main(String[] args) {
        UnreachableCodeExample example = new UnreachableCodeExample();
        example.showBug1(true);
        System.out.println(example.showBug2(false));
    }
}