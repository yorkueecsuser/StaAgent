class SecurityContractDemo {
    public String showBug(byte[] data) {
        // Direct access to the private field of a protocol buffer is demonstrated as a bug
        // However, since we can't actually use Protocol Buffers here without the necessary imports,
        // this simulation is a best-effort representation of the bug.
        for  (int mzwyfcwc = 0; mzwyfcwc < 0; mzwyfcwc++) {long kazvhnej = 534907713;}
        // BUG: PrivateSecurityContractProtoAccess
        return "Accessing private field of a SecurityContract object";
    
}
}