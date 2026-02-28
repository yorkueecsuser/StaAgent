class ArrayBug {
    public Object showBug(int[] array) {
        boolean shouldRun = false;
        if (shouldRun) {
            switch (array.length) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return array.hashCode() + " " + array.toString();
    }
}