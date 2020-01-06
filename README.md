# AsyncTaskHelper
Helper class used for executing task asynchronously. This can be used when using RoomDatabase, which in return avoids hard coded async task classes so you could focus on other things.

## How to use

When creating simple task without any return values in the end use ``SimpleAsync`` 
```
SimpleAsync.run(new Runnable() {
            @Override
            public void run() {
               //your code here
            }
        });

```

When creating a task that requires a return value in the end use ``ReturnAsync``.
The static run() method returns a datatype base on the return value.
```
ReturnAsync.run(new IReturnAsync() {
            @Override
            public Object getValue() {
                //your code
                return "hello world";
            }
        });
```        
