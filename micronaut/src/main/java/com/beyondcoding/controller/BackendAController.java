package com.beyondcoding;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

import jakarta.inject.Inject;
import java.util.concurrent.CompletableFuture;

@Controller("/backendA")
public class BackendAController {

    private final Service businessAService;

    @Inject
    public BackendAController(Service businessAService) {
        this.businessAService = businessAService;
    }

    @Get(value = "failure", produces = MediaType.TEXT_PLAIN)
    public String failure() {
        return businessAService.failure();
    }

    @Get(value = "success", produces = MediaType.TEXT_PLAIN)
    public String success() {
        return businessAService.success();
    }

    @Get(value = "successException", produces = MediaType.TEXT_PLAIN)
    public String successException() {
        return businessAService.successException();
    }

    @Get(value = "ignore", produces = MediaType.TEXT_PLAIN)
    public String ignore() {
        return businessAService.ignoreException();
    }

    @Get(value = "monoSuccess", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoSuccess() {
        return businessAService.singleSuccess();
    }

    @Get(value = "monoFailure", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoFailure() {
        return businessAService.singleFailure();
    }

    @Get(value = "fluxSuccess", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxSuccess() {
        return businessAService.flowableSuccess();
    }

    @Get(value = "monoTimeout", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoTimeout() {
        return businessAService.singleTimeout();
    }

    @Get(value = "fluxTimeout", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxTimeout() {
        return businessAService.flowableTimeout();
    }

    @Get(value = "futureFailure", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureFailure() {
        return businessAService.futureFailure();
    }

    @Get(value = "futureSuccess", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureSuccess() {
        return businessAService.futureSuccess();
    }

    @Get(value = "futureTimeout", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureTimeout() {
        return businessAService.futureTimeout();
    }

    @Get(value = "fluxFailure", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxFailure() {
        return businessAService.flowableFailure();
    }

    @Get(value = "fallback", produces = MediaType.TEXT_PLAIN)
    public String failureWithFallback() {
        return businessAService.failureWithFallback();
    }
}
