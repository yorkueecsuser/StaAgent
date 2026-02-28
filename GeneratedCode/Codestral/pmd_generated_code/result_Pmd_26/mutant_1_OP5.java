class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }

    private void unreachableSwitchStatement() {
        boolean condition = false;
        if(condition){
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("This should never print");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
    }
}