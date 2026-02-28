import java.util.concurrent.ScheduledThreadPoolExecutor;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads

        // Mutation Operator name: Unreachable while loop
        // Mutation Operator description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Mutant code being added MUST be unique not generic.
        // This while loop will always have a false condition making it unreachable.
        while (false) {
            System.out.println("This is an unreachable while loop mutant");
        }

        // The following while loop will always have a false condition making it unreachable.
        // However, this mutant will not be detected by any code coverage tool because it is present in a method that is never called.
        int i = 0;
        while (false) {
            i++;
        }
    }
}