package miranda.david.da.appcount.mainscreen;



public class MainModel implements Main.PresenterToModel {

    private int counter;

    public MainModel(){

        counter = 0;
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
}
