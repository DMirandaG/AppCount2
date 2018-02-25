package miranda.david.da.appcount.mainscreen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import miranda.david.da.appcount.R;
import miranda.david.da.appcount.Mediator;

public class MainView extends Activity implements Main.PresenterToView {

    protected final String TAG = this.getClass().getSimpleName();

    private TextView screen;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting my App");

        screen = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);

        final Mediator mediator = (Mediator) getApplication();
        final Main.ViewToPresenter myPresenter = mediator.getPresenter(this);

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

    @Override
    public void displayShortMessage(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
