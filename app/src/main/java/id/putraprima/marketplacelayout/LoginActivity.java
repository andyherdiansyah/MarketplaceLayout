package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void next (View view) {
        Intent iten = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(iten);
    }
    public void next1 (View view) {
        Intent iten = new Intent(LoginActivity.this, PersonalActivity.class);
        startActivity(iten);
    }
    public void next2 (View view) {
        Intent iten = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(iten);
    }
}