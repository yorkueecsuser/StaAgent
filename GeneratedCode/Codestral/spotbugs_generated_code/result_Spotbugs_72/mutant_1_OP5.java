class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        boolean alwaysFalse = (obj == str); // Original bug
        int value = alwaysFalse? 1 : 0; // Ensure the switch condition is unreachable
        switch (value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
            default:
                break;
        }
        return alwaysFalse; // Return the original bug result
    }
}