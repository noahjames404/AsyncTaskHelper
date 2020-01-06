package com.example.jobordermanager.RoomDatabase.Helper;

public interface IReturnAsync<T> {
    /**
     * callback used on ReturnExecutor, after processing the data.
     * @return - any datatype
     */
    T getValue();
}
