class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean shouldSwitch = false;
        int unreachableValue = 0;

        if (array1!= null && array2!= null) {
            shouldSwitch =!array1.getClass().equals(array2.getClass());
        }

        if (shouldSwitch) {
            switch(unreachableValue) {
                case 1:
                    System.out.println("Unreachable code executed");
                    break;
            }
        }

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}