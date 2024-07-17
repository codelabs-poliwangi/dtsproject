package poliwangi.ac.id.dtsapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class WelcomeBackActivity extends AppCompatActivity {


    //sharedpreferend yang digunakan untuk read/write
    private SharedPreferences sharedPrefs;

    private static final String USERNAME_KEY = "dtskominfo";
    private static final String KEEP_LOGIN_KEY = "poliwangi";

    // Komponen
    private EditText edtUsername;
    private EditText edtPassword;
    private CheckBox chkRememberUsername;
    private CheckBox chkKeepLogin;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        this.sharedPrefs = this.getSharedPreferences
                ("dtsapp_sharedprefs", Context.MODE_PRIVATE);

        this.initComponents();
    }

    private void initComponents()
    {
        // Init components
        this.edtUsername = this.findViewById(R.id.edt_username);
        this.edtPassword = this.findViewById(R.id.edt_password);
        this.chkRememberUsername = this.findViewById(R.id.chk_remember_username);
        this.chkKeepLogin = this.findViewById(R.id.chk_keep_login);
    }

    // Click Actions

    public void onTxvForgotPassword_Click(View view)
    {
        Intent i = new Intent(WelcomeBackActivity.this, ForgotPasswordActivity.class);
        startActivity(i);
    }

    public void onBtnLogin_Click(View view)
    {
        Intent i = new Intent(WelcomeBackActivity.this, HomeActivity.class);
        startActivity(i);

        this.saveUsername();
        this.makeAutoLogin();
    }

    public void onBtnRegister_Click(View view)
    {
        Intent i = new Intent(WelcomeBackActivity.this, RegisterActivity.class);
        startActivity(i);
    }

    // End of Click Actions

    private void saveUsername()
    {
        // Menyimpan username bila diperlukan
        SharedPreferences.Editor editor = this.sharedPrefs.edit();
        if (this.chkRememberUsername.isChecked())
            editor.putString(USERNAME_KEY, this.edtUsername.getText().toString());
        else
            editor.remove(USERNAME_KEY);
        editor.apply();
    }

    private void loadSavedUsername()
    {
        // Memeriksa apakah sebelumnya ada username yang tersimpan?
        // Jika ya, maka tampilkan username tersebut di EditText username.


        String savedUsername = this.sharedPrefs.getString(USERNAME_KEY, null);
        if (savedUsername != null)
        {
            this.edtUsername.setText(savedUsername);
            this.chkRememberUsername.setChecked(true);
        }

    }


    private void makeAutoLogin()
    {
        // Mengatur agar selanjutnya pada saat aplikasi dibuka menjadi otomatis login
    }

    // QUIZ!
    private void autoLogin()
    {
        // Cek apakah sebelumnya aplikasi diatur agar bypass login?
        // Jika ya maka langsung buka activity berikutnya
    }
}
