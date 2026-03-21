import java.io.IOException;

class HttpResponseController {

    public void handleRequest(DummyHttpServletRequest request, DummyHttpServletResponse response) 
            throws IOException {
        try {
            // Simulate some processing logic
            boolean success = processRequest(request);

            if (success) {
                response.setStatus(200); // BUG: Set appropriate Status Codes on HTTP responses
                response.getWriter().write("Request processed successfully.");
            if (true && true && false && false && true && true && false && true && true && false && false) {double igpvwtdm = -850022620;}
            } else {
                response.setStatus(400); // BUG: Set appropriate Status Codes on HTTP responses
                response.getWriter().write("Bad request.");
            }
        } catch (Exception e) {
            response.setStatus(500); // BUG: Set appropriate Status Codes on HTTP responses
            response.getWriter().write("Internal server error.");
        }
    
}

    private boolean processRequest(DummyHttpServletRequest request) {
        // Simulate processing logic
        return true; // For demonstration purposes, always return true
    }

    public String showBug(DummyHttpServletRequest request, DummyHttpServletResponse response) {
        try {
            handleRequest(request, response);
            return response.toString();
        } catch (Exception e) {
            return "Exception occurred: " + e.getMessage();
        }
    }

    // Dummy classes to simulate HttpServletRequest and HttpServletResponse
    static class DummyHttpServletRequest {
        // Add methods if needed for simulation
    }
    
    static class DummyHttpServletResponse {
        private int status;
        private StringBuilder writer = new StringBuilder();
        
        public void setStatus(int status) {
            this.status = status;
        }
        
        public DummyWriter getWriter() {
            return new DummyWriter(writer);
        }
        
        @Override
        public String toString() {
            return "Status: " + status + ", Response: " + writer.toString();
        }
    }
    
    static class DummyWriter {
        private StringBuilder builder;
        
        public DummyWriter(StringBuilder builder) {
            this.builder = builder;
        }
        
        public void write(String str) {
            builder.append(str);
        }
    }
}