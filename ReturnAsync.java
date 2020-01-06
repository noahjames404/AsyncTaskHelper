package com.example.jobordermanager.RoomDatabase.Helper;

import java.util.concurrent.ExecutionException;

/**
 * The ReturnAsync class used for creating AsyncTask
 * which returns any datatype base on preference.
 *
 */
public class ReturnAsync {

    /**
     * A quick call can be made by run(IReturnAsync)
     * which executes the block of code and return its result.
     *
     * @param callback - runs in Asynchronous
     * @param <T> - any datatype, this is automatically determined so it doesn't have to be set.
     * @return - the result of the callback. If it returns null an error occurs or the return value is empty.
     */
    public static <T> T  run(IReturnAsync callback){
        try {
            return new ReturnExecutor<T>().execute(callback).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
