class BuggyStringBuffer {
    private boolean getCondition() {
        // This method is used to ensure the switch statement is unreachable
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        if (getCondition()) {
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return sb.capacity();
    }
}