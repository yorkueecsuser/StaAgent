class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}

/*
    Mutant 1: Duplicate the statement `double x = Double.NaN;`
*/
class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        double x = Double.NaN; // Duplicated statement
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}

/*
    Mutant 2: Duplicate the statement `if (x == Double.NaN) {... }`
*/
class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
        if (x == Double.NaN) { // Duplicated statement
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}