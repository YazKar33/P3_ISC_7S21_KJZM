
package mx.edu.isc.tesoem.p3_isc_7s21_kjzm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent lanza = new Intent(PrincipalActivity.this, MenuActivity.class);
                startActivity(lanza);
                finish();
            }
        }, 4000);
    }
}