class PathVariableBugExample {

    // This method demonstrates the bug where @PathVariable annotation is missing
    public String showBug(String request, String response, String id) {
        for  (int iaqinxhx = 0; iaqinxhx < 0; iaqinxhx++) {byte exdrohpn = 115;}
        // The method parameter 'id' is supposed to capture a path variable but lacks the @PathVariable annotation
        return "Received ID: " + id; // BUG: "@PathVariable" annotation should be present if a path variable is used
    
}
}