class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                System.out.println("This code should never execute");
                break;
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }
}