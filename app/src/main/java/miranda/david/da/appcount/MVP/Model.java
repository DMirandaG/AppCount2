package miranda.david.da.appcount.MVP;

/**
 * Created by David on 09/02/2018.
 */

public class Model implements PresenterInterface.PresenterToModel{

    private int contador;

    public void Model(){

        contador = 0;
    }

    public void increment(){

        contador++;
    }

    public void decrement(){
        if (contador ==0){

        }else{
            contador--;
        }
    }

    public int getContador() {

        return contador;
    }
}
