package miranda.david.da.appcount.mainscreen;



public interface Main {

    interface ModelToPresenter {
    }

    interface PresenterToModel {
        void increment();

        void decrement();

        int getCounter();
    }

    interface PresenterToView {
    }

    interface ViewToPresenter {
        String getTextToDisplay();

        void buttonPlusPressed();

        void buttonMinusPressed();
    }

}
