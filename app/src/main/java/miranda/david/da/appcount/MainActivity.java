package miranda.david.da.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView pantalla;
    private Button boton1;
    private int contador;
    private Button boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Arrancando mi App");

        pantalla = findViewById(R.id.textView);
        contador = 0;
        pantalla.setText("" + contador);

        boton1 = findViewById(R.id.button);
        //boton1.setOnClickListener(new ButtonListener());

        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d ("MainActivity", "Boton pulsado");
                contador++;
                pantalla.setText("" + contador);
            }
        });

        boton2 = findViewById(R.id.boton2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d ("MainActivity", "Boton pulsado");
                contador--;
                pantalla.setText("" + contador);
            }
        });


    }
}
