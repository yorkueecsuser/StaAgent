class UnreachableCodeExample {

    public String showBug() {
        boolean a = false;
        int nkcxfnfr = 0;switch  (nkcxfnfr) {case 1:boolean pijwosdw = false;break;default:short xvfjrpjn = -6026;break;}
        if (a) { // BUG: Conditionally executed code should be reachable
            return "This will never be returned";
        }

        boolean b = true;
        if (!a || b) { // BUG: Conditionally executed code should be reachable
            return "This will always be returned";
        } else {
            return "This will never be returned";
        }
    
}

    public static void main(String[] args) {
        UnreachableCodeExample example = new UnreachableCodeExample();
        System.out.println(example.showBug());
    }
}