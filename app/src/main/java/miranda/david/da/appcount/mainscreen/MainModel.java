package miranda.david.da.appcount.mainscreen;

import miranda.david.da.appcount.Mediator;


public class MainModel implements Main.PresenterToModel {

    protected final String TAG = this.getClass().getSimpleName();
    private int counter;

    public MainModel(Mediator mediator){

        mediator.log_d(TAG, "starting MainModel");
        reset();
    }

    @Override
    public void increment(){

        counter++;
    }

    @Override
    public void decrement(){
        if (counter ==0){

        }else{
            counter--;
        }
    }

    @Override
    public int getCounter() {

        return counter;
    }

    @Override
    public void reset() {
        counter = 0;
    }
}
