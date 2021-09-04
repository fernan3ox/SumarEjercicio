package fernando.example.sumarejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultado = (TextView)findViewById(R.id.resultado);

        int numero15= getIntent().getIntExtra("numero1",0);
        int numero25= getIntent().getIntExtra("numero2",0);

        resultado.setText("La suma es:"+" "+(numero15+numero25));
    }
}
