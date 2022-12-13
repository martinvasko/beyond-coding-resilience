package com.beyondcoding;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

import jakarta.inject.Inject;
import java.util.concurrent.CompletableFuture;

@Controller("/backendB")
public class BackendBController {

    private final Service businessBService;

    @Inject
    public BackendBController(Service businessBService) {
        this.businessBService = businessBService;
    }

    @Get(value = "failure", produces = MediaType.TEXT_PLAIN)
    public String failure() {
        return businessBService.failure();
    }

    @Get(value = "success", produces = MediaType.TEXT_PLAIN)
    public String success() {
        return businessBService.success();
    }

    @Get(value = "successException", produces = MediaType.TEXT_PLAIN)
    public String successException() {
        return businessBService.successException();
    }

    @Get(value = "ignore", produces = MediaType.TEXT_PLAIN)
    public String ignore() {
        return businessBService.ignoreException();
    }

    @Get(value = "monoSuccess", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoSuccess() {
        return businessBService.singleSuccess();
    }

    @Get(value = "monoFailure", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoFailure() {
        return businessBService.singleFailure();
    }

    @Get(value = "fluxSuccess", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxSuccess() {
        return businessBService.flowableSuccess();
    }

    @Get(value = "monoTimeout", produces = MediaType.TEXT_PLAIN)
    public Single<String> monoTimeout() {
        return businessBService.singleTimeout();
    }

    @Get(value = "fluxTimeout", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxTimeout() {
        return businessBService.flowableTimeout();
    }

    @Get(value = "futureFailure", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureFailure() {
        return businessBService.futureFailure();
    }

    @Get(value = "futureSuccess", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureSuccess() {
        return businessBService.futureSuccess();
    }

    @Get(value = "futureTimeout", produces = MediaType.TEXT_PLAIN)
    public CompletableFuture<String> futureTimeout() {
        return businessBService.futureTimeout();
    }

    @Get(value = "fluxFailure", produces = MediaType.TEXT_PLAIN)
    public Flowable<String> fluxFailure() {
        return businessBService.flowableFailure();
    }

    @Get(value = "fallback", produces = MediaType.TEXT_PLAIN)
    public String failureWithFallback() {
        return businessBService.failureWithFallback();
    }
}
