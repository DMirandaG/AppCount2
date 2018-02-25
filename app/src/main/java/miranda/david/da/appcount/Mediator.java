package miranda.david.da.appcount;

import miranda.david.da.appcount.mainscreen.MainPresenter;
import miranda.david.da.appcount.mainscreen.MainView;

public interface Mediator {

    MainPresenter getPresenter(MainView view);
    void resetApp();
    void log_d(String tag, String text);

    interface lifecycle {

    }

    interface navigation {
        void openWebPage(String url);
    }
}
