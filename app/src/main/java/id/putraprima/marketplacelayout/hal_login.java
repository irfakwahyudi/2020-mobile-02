package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hal_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_login);
    }
    public void Pindah(View view) {
        Intent iten = new Intent(hal_login.this, hal_general.class);
        startActivity(iten);
    }

    public void Pindah1(View view) {
        Intent iten = new Intent(hal_login.this, hal_personal.class);
        startActivity(iten);
    }

    public void backLogin(View view) {
        Intent iten = new Intent(hal_login.this, MainActivity.class);
        startActivity(iten);
    }
}
