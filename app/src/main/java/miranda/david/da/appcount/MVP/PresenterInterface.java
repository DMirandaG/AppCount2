package miranda.david.da.appcount.MVP;

/**
 * Created by David on 14/02/2018.
 */

public interface PresenterInterface {

    interface PresenterToModel{
        void increment();
        void decrement();
    }

    interface ModelToPresenter{

    }

    interface PresenterToView{
        void showText();
    }

    interface ViewToPresenter{
        void botonMasPulsado();
        void botonMenosPulsado();
    }
}
