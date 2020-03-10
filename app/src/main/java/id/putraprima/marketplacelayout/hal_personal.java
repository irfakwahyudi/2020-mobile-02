package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hal_personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_personal);
    }
    public void clickBack_person(View view) {
        Intent iten = new Intent(hal_personal.this , hal_login.class);
        startActivity(iten);
    }
}
