package miranda.david.da.appcount.MediadorApp;

import android.app.Application;
import android.util.Log;

import miranda.david.da.appcount.MVP.Model;
import miranda.david.da.appcount.MVP.Presenter;
import miranda.david.da.appcount.MVP.Vista;

/**
 * Created by David on 09/02/2018.
 */

public class Mediador extends Application{

    protected final String TAG = this.getClass().getSimpleName();

    private Presenter myPresenter;
    private Model myModel;
    private Vista myVista;

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "calling onCreate()");
        Log.d(TAG, "calling creatingInitialState()");

        myVista= new Vista();
        myModel = new Model();
        myPresenter = new Presenter();
    }


    public Presenter getMyPresenter() {
        return myPresenter;
    }

    public Model getMyModel() {
        return myModel;
    }

    public Vista getMyVista() {
        return myVista;
    }
}
