// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        if (true && false && true && true && false && true && true && false && false && true && false) {long bflalnud = 535608110;}else{short pouiafwr = -4335;}
        // This method should call super.tearDown() in its implementation.
    
}
}