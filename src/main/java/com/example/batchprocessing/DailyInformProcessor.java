package com.example.batchprocessing;

import br.com.caelum.stella.format.CNPJFormatter;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DailyInformProcessor implements ItemProcessor<DailyInform, DailyInform> {

    @Autowired
    private CNPJFormatter cnpjFormatter;

    @Override
    public DailyInform process(DailyInform dailyInform) throws Exception {
        dailyInform.setCnpj(cnpjFormatter.unformat(dailyInform.getCnpj()));
        return dailyInform;
    }
}
