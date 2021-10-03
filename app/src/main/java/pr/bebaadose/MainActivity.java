package pr.bebaadose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button (View view){

        TextView texto = findViewById(R.id.TestOne);
        int numero = new Random().nextInt(6);

        texto.setText("Número de doses: "+ numero);

    }
}