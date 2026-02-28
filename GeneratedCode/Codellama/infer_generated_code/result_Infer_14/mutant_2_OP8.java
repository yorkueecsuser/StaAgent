import java.lang.annotation.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class StarvationExample {

    private Button loginButton;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView loginStatusTextView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        loginButton = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        loginStatusTextView = findViewById(R.id.login_status_textview);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                loginStatusTextView.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                loginStatusTextView.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 1: Renaming loginButton to b
class StarvationExample {

    private Button b;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView loginStatusTextView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        b = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        loginStatusTextView = findViewById(R.id.login_status_textview);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                loginStatusTextView.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                loginStatusTextView.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 2: Renaming loginStatusTextView to t
class StarvationExample {

    private Button loginButton;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView t;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        loginButton = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        t = findViewById(R.id.login_status_textview);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                t.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                t.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 3: Renaming usernameEditText to e
class StarvationExample {

    private Button loginButton;
    private EditText e;
    private EditText passwordEditText;
    private TextView loginStatusTextView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        loginButton = findViewById(R.id.login_button);
        e = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        loginStatusTextView = findViewById(R.id.login_status_textview);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = e.getText().toString();
                String password = passwordEditText.getText().toString();

                loginStatusTextView.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                loginStatusTextView.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 4: Renaming passwordEditText to p
class StarvationExample {

    private Button loginButton;
    private EditText usernameEditText;
    private EditText p;
    private TextView loginStatusTextView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        loginButton = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        p = findViewById(R.id.password_edittext);
        loginStatusTextView = findViewById(R.id.login_status_textview);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = p.getText().toString();

                loginStatusTextView.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                loginStatusTextView.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 5: Renaming loginStatusTextView to t
class StarvationExample {

    private Button loginButton;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView t;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starvation_example);

        loginButton = findViewById(R.id.login_button);
        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        t = findViewById(R.id.login_status_textview);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("STARVATION")
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                t.setText("Logging in...");

                // BUG: STARVATION
                // This call may block, potentially leading to an Application Not Responding (ANR) error.
                login(username, password);

                t.setText("Login successful");
            }
        });
    }

    // This method is annotated as non-blocking, but it actually blocks.
    @NonBlocking
    public void login(String username, String password) {
        // simulate a long-running operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}