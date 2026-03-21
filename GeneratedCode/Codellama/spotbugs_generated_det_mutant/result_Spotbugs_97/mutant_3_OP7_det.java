// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        boolean mtcvknhw = false;while (mtcvknhw && true && true && false && false && true && true && true && false && false && true && false) {boolean zmzmrfxz = false;}
        // This method should call super.tearDown() in its implementation.
    
}
}