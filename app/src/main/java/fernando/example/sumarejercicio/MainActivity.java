package fernando.example.sumarejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText)findViewById(R.id.Edit1);
        numero2=(EditText)findViewById(R.id.Edit2);
    }

    public void Suma(View view){

        Intent intent = new Intent(this, Resultado.class);

        intent.putExtra("numero1",Integer.parseInt(numero1.getText().toString()));
        intent.putExtra("numero2",Integer.parseInt(numero2.getText().toString()));

        startActivity(intent);

    }


}
