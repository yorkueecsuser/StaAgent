import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall(); // Original bug

        // Mutant code (unreachable if-else statement)
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should not be executed.");
        } else {
            // Alternative code
            System.out.println("Executing alternative code.");
        }

        return 0;
    }
}