package com.example.batchprocessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FundsService {

    private final DailyInformRepository dailyInformRepository;

    @Autowired
    public FundsService(DailyInformRepository dailyInformRepository) {
        this.dailyInformRepository = dailyInformRepository;
    }

    @Transactional(readOnly = true)
    public List<DailyInform> getDailyInformByCNPJ(String cnpj) {
        return dailyInformRepository.findDistinctByCnpj(cnpj);
    }
}
