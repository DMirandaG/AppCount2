package miranda.david.da.appcount.mainscreen;


import miranda.david.da.appcount.MediatorApp;

public class MainPresenter implements Main.ViewToPresenter, Main.ModelToPresenter {

    protected final String TAG = this.getClass().getSimpleName();

    private MediatorApp myMediator;
    private MainModel myModel;
    private MainView myView;

    public MainPresenter(MediatorApp mediator, MainModel model, MainView view){

        myMediator = mediator;
        myModel = model;
        myView = view;
    }

    @Override
    public String getTextToDisplay(){

        return "" + myModel.getCounter();
    }

    @Override
    public void buttonPlusPressed(){

        myModel.increment();
    }

    @Override
    public void buttonMinusPressed(){

        myModel.decrement();
    }


}
