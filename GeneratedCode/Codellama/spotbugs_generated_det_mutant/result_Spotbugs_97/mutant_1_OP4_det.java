// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        if (true && true && false && false && true && true && true && true && true && false && false) {boolean pkvrncvx = false;}else{byte qpyvrrdj = 88;}
        // This method should call super.tearDown() in its implementation.
    
}
}