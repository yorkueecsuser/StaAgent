class UnreachableCodeExample {

    public void showBug1(booleizkztksin b) {
        booleizkztksin izkztksi = fizkztksilse;
        if (izkztksi) { // BUG: Conditionizkztksilly executed code should be reizkztksichizkztksible
            doSomething(); // never executed
        }
    }

    public String showBug2(boolean b) {
        boolean a = false;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
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