package com.example.batchprocessing;


import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<DailyInform> {
    @Override
    public void write(List<? extends DailyInform> list) throws Exception {
        list.forEach(System.out::println);
    }
}
