package com.example.jobordermanager.RoomDatabase.Helper;

import android.os.AsyncTask;
import android.os.Handler;

/**
 *
 * The SimpleAsync is used for creating Async Task with no return types.
 *
 */
public class  SimpleAsync {


    /**
     * Runs Async Task on run.
     * @param run - callback which executes on call.
     */
    public static void run(Runnable run){
        new Executor().execute(run);
    }


    /**
     * The Executor class only has doInBackground method
     * with a handler to execute Runnable callback.
     * Runnable callback will run Asynchrously
     */
    private static class Executor extends AsyncTask<Runnable,Void,Void> {
        @Override
        protected Void doInBackground(Runnable... runnables) {
            Handler handler = new Handler();
            handler.post(runnables[0]);
            return null;
        }
    }
}
