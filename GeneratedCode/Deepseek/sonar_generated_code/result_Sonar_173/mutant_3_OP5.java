class UnreachableSwitchStatement {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize();
        switch (0) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code");
                break;
        }
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
}