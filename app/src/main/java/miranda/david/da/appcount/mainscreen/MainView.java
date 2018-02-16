package miranda.david.da.appcount.mainscreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import miranda.david.da.appcount.R;
import miranda.david.da.appcount.MediatorApp;

public class MainView extends Activity implements Main.PresenterToView {

    protected final String TAG = this.getClass().getSimpleName();

    private TextView screen;
    private Button button1;
    private Button button2;
    //private MainPresenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting my App");

        screen = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);

        final MediatorApp mediator = (MediatorApp) getApplication();
        final MainPresenter myPresenter = mediator.getPresenter(this);
        screen.setText(mediator.getPresenter(this).getTextToDisplay());


        // Configurado el observador con una clase anonima
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d (TAG, "Button plus pulsed");
                myPresenter.buttonPlusPressed();
                screen.setText(myPresenter.getTextToDisplay());
            }
        });

        button2 = findViewById(R.id.boton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d (TAG, "Button minus pulsed");
                myPresenter.buttonMinusPressed();
                screen.setText(myPresenter.getTextToDisplay());
            }
        });


    }


}
