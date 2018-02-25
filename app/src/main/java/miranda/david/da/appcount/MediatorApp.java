package miranda.david.da.appcount;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import miranda.david.da.appcount.mainscreen.Main;
import miranda.david.da.appcount.mainscreen.MainModel;
import miranda.david.da.appcount.mainscreen.MainPresenter;
import miranda.david.da.appcount.mainscreen.MainView;


public class MediatorApp extends Application implements Mediator, Mediator.lifecycle, Mediator.navigation {

    private MainPresenter myPresenter;
    private MainModel myModel;


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }


    public MainPresenter getPresenter(MainView view) {
        if(myPresenter == null){
            myModel = new MainModel(this);
            myPresenter = new MainPresenter(this, myModel, view);
        }
        return myPresenter;
    }

    @Override
    public void resetApp() {
        if (myModel != null) {
            myModel.reset();
        }
    }

    @Override
    public void log_d(String tag, String text) {
        Log.d(tag, text);
    }

    @Override
    public void openWebPage(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent();
        intent.setData(uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
