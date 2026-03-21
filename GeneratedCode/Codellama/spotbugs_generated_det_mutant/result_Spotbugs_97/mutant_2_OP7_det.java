// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        boolean jogcciie = false;while (jogcciie && true && true && true && false && false && false && true && false && false && true && false) {byte ruwwunfe = -106;}
        // This method should call super.tearDown() in its implementation.
    
}
}