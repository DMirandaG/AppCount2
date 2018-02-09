package miranda.david.da.appcount;

/**
 * Created by David on 09/02/2018.
 */

public class Presenter {
    protected final String TAG = this.getClass().getSimpleName();

    private Model myModel;

    public Presenter(){

        myModel = new Model();
    }

    public int getContador(){

        return myModel.getContador();
    }

    public void botonMasPulsado(){

        myModel.increment();
    }

    public void botonMenosPulsado(){

        myModel.decrement();
    }
}
