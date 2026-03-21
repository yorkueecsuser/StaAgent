// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        boolean pkrqwntg = false;while (pkrqwntg && true && true && false && true && true && true && false && false && false && false && false) {String bgwmelys = "mwztcgvu";}
        // This method should call super.tearDown() in its implementation.
    
}
}