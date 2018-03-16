package miranda.david.da.appcount.mainscreen;


import miranda.david.da.appcount.Mediator;

public class MainPresenter implements Main.ViewToPresenter, Main.ModelToPresenter {

    protected final String TAG = this.getClass().getSimpleName();

    private Mediator myMediator;
    private Main.PresenterToModel myModel;
    private Main.PresenterToView myView;

    public MainPresenter(Mediator mediator, Main.PresenterToModel model, Main.PresenterToView view){

        mediator.log_d(TAG, "starting MainPresenter");
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

        if (myModel.getCounter() % 4 == 0) {
            myView.displayShortMessage("Congrats!!! You reached " + myModel.getCounter());

            ((Mediator.navigation) myMediator).openWebPage("http://www.ulpgc.es");
        }
    }

    // TODO: 09/03/2018 Corregir y adaptar
    @Override
    public void buttonMinusPressed(){

        myModel.decrement();
    }


}
