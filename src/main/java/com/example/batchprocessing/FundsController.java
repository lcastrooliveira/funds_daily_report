package com.example.batchprocessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/daily-informs")
public class FundsController {

    private final FundsService fundsService;

    @Autowired
    public FundsController(FundsService fundsService) {
        this.fundsService = fundsService;
    }

    @GetMapping("/{cnpj}")
    public ResponseEntity<List<DailyInform>> all(@PathVariable("cnpj") String cnpj) {
        return ResponseEntity.of(Optional.of(fundsService.getDailyInformByCNPJ(cnpj)));
    }
}
