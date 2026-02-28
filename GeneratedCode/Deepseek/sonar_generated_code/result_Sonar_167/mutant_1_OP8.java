class BuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                System.out.println("This is executed in a new thread");
            }
        }.run();
    }

    public static void main(String[] args) {
        new BuggyThread().showBug();
    }
}

class MutantBuggyThread {

    public void showBug() {
        new Thread() {
            public void run() {
                System.out.println("This is executed in a new thread");
            }
        }.b();
    }

    public static void main(String[] args) {
        new MutantBuggyThread().showBug();
    }
}