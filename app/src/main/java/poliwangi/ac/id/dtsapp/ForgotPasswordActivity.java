package poliwangi.ac.id.dtsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void postSendRequest(View view) {
        Intent i = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class);
        startActivity(i);
    }
}
