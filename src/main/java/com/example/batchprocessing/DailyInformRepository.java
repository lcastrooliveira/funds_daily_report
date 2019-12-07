package com.example.batchprocessing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyInformRepository extends JpaRepository<DailyInform, Long> {
    List<DailyInform> findDistinctByCnpj(String cnpj);
}
