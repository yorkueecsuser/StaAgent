class BuggyFinalize {
    
    protected void finalize() {   // Noncompliant; no call to super.finalize();
        releaseSomeResources();
    }

    protected void releaseSomeResources() {
        System.out.println("Releasing resources");
    }

    public void showBug() {
        BuggyFinalize buggy = new BuggyFinalize();
        try {
            buggy.finalize(); // The finalizer of this instance
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyFinalize bug = new BuggyFinalize();
        bug.showBug();
    }
}

// Add a unique mutant
class MutantFinalize {

    protected void finalize() {   // Noncompliant; no call to super.finalize();
        releaseSomeResources();

        // Add an if-else structure to avoid unreachable statement error
        if (true) {
            // Unreachable switch statement
            int unreachableValue = 0;
            switch (unreachableValue) {
                // No cases to make the switch statement unreachable
            }
        } else {
            System.out.println("This code is unreachable");
        }
    }

    protected void releaseSomeResources() {
        System.out.println("Releasing resources");
    }

    public void showBug() {
        MutantFinalize buggy = new MutantFinalize();
        try {
            buggy.finalize(); // The finalizer of this instance
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MutantFinalize bug = new MutantFinalize();
        bug.showBug();
    }
}