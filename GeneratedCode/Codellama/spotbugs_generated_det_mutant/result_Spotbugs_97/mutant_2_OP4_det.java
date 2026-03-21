// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        if (false && true && true && true && false && true && false && true && false && false && false) {char nwmbgvvg = 'g';}else{float wwtfxkxg = -650777030;}
        // This method should call super.tearDown() in its implementation.
    
}
}