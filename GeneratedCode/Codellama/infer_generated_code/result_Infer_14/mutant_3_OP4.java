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

// Inserted code for mutant 1: Unreachable if-else statement
public void login(String username, String password) {
    // simulate a long-running operation
    try {
        if (false) { // false is a compile-time constant, but it's not used directly in the condition
            Thread.sleep(5000);
        } else {
            Thread.sleep(5000);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

// Inserted code for mutant 2: Unreachable if-else statement
public void login(String username, String password) {
    // simulate a long-running operation
    try {
        if (getCondition()) { // getCondition() returns a boolean value that is determined at runtime
            Thread.sleep(5000);
        } else {
            Thread.sleep(5000);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}