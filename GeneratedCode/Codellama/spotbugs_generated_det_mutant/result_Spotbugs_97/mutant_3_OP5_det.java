// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        int exiqpgyc = 0;switch  (exiqpgyc) {case 1:long puostidg = -948755171;break;default:float nmzmghca = -38195420;break;}
        // This method should call super.tearDown() in its implementation.
    
}
}