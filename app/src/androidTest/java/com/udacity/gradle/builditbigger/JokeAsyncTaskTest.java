package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;

public class JokeAsyncTaskTest extends ApplicationTestCase<Application> {
    public JokeAsyncTaskTest() {
        super(Application.class);
    }

    public void testFetchJokeTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask jokeTest = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onDone(String result) {}
        });
        jokeTest.execute();
        String joke = jokeTest.get();
        assertNotNull(joke);
    }
}
