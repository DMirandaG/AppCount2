package miranda.david.da.appcount.MVP;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import miranda.david.da.appcount.R;

public class Vista extends Activity implements PresenterInterface.PresenterToView{

    protected final String TAG = this.getClass().getSimpleName();

    private TextView pantalla;
    private Button boton1;
    private Button boton2;
    private Presenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Vista", "Arrancando mi App");

        pantalla = findViewById(R.id.textView);
        boton1 = findViewById(R.id.button);

        myPresenter = new Presenter();
        pantalla.setText("" + myPresenter.getContador());


        // Configurado el observador con una clase anonima
        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d ("Vista", "Boton pulsado");

                myPresenter.botonMasPulsado();
                pantalla.setText("" + myPresenter.getContador());
            }
        });

        boton2 = findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d ("Vista", "Boton pulsado");
                myPresenter.botonMenosPulsado();
                pantalla.setText("" + myPresenter.getContador());
            }
        });


    }

    @Override
    public void showText() {
        pantalla.setVisibility(View.VISIBLE);
    }
}
