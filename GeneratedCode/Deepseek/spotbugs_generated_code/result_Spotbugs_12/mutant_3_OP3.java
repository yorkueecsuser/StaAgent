import org.easymock.EasyMock;

class UselessEasyMockCall {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        EasyMock.expectLastCall(); // Original bug: Useless/vacuous call to EasyMock method

        // Mutated code: Inserted unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This statement is unreachable.");
        }

        return 0;
    }
}