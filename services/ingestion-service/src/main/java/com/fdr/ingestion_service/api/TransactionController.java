package com.fdr.ingestion_service.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/transactions")
public class TransactionController {

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void ingest(@RequestBody @Valid TransactionRequest request) {
    }

    public record TransactionRequest(
            @NotBlank String transactionId,
            @NotBlank String userId,
            @NotBlank String merchantId,
            @NotBlank String amount
    ) {}
}
