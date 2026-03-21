class ThreadLocalUserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public UserSession get() {
        UserSession session = DELEGATE.get();
        if (session != null) {
            return session;
        }
        throw new UnauthorizedException("User is not authenticated");
    }

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        DELEGATE.set(null); // BUG: "ThreadLocal" variables should be cleaned up when no longer used
    }

    public void showBug() {
        UserSession session = new DummyUserSession("user_123");
        set(session);
        System.out.println("Session set for user: " + session.getUsername());

        incorrectCleanup();
        System.out.println("Session incorrectly cleaned up.");
        
        try {
            get();
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.showBug();
    }
}

interface UserSession {
    String getUsername();
}

class DummyUserSession implements UserSession {
    private final String username;

    public DummyUserSession(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }
}

class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}