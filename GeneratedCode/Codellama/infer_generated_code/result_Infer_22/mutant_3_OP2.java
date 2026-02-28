import java.util.ArrayList;
import java.util.List;

class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutant 1: Duplicate the assignment statement "numbers.add(1);"
class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutant 2: Duplicate the assignment statement "numbers.add(2);"
class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutant 3: Duplicate the assignment statement "numbers.add(3);"
class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutant 4: Duplicate the assignment statement "numbers.add(4);"
class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutant 5: Duplicate the assignment statement "numbers.add(5);"
class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}