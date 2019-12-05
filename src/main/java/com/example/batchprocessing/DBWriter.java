package com.example.batchprocessing;


import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<DailyInform> {

    private final DailyInformRepository dailyInformRepository;

    @Autowired
    public DBWriter(DailyInformRepository dailyInformRepository) {
        this.dailyInformRepository = dailyInformRepository;
    }

    @Override
    public void write(List<? extends DailyInform> list) {
        list.forEach(System.out::println);
        dailyInformRepository.saveAll(list);
    }
}
