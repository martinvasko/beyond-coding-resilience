package com.beyondcoding;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

import java.util.concurrent.CompletableFuture;

public interface Service {
    
    String failure();

    String failureWithFallback();

    String success();

    String successException();

    String ignoreException();

    Flowable<String> flowableSuccess();

    Flowable<String> flowableFailure();

    Flowable<String> flowableTimeout();

    Single<String> singleSuccess();

    Single<String> singleFailure();

    Single<String> singleTimeout();

    CompletableFuture<String> futureSuccess();

    CompletableFuture<String> futureFailure();

    CompletableFuture<String> futureTimeout();
}
