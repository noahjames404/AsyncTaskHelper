package com.example.jobordermanager.RoomDatabase.Helper;

import android.os.AsyncTask;

/**
 * The Return Executor class returns a datatype base on the T class.
 * @param <T> - any datatype
 */
public class ReturnExecutor<T> extends AsyncTask<IReturnAsync,Void,T> {

    @Override
    protected T doInBackground(IReturnAsync... iReturnAsyncs) {
        return (T) iReturnAsyncs[0].getValue();
    }
}
