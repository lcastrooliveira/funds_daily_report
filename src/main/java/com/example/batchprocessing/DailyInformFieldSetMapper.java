package com.example.batchprocessing;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.time.ZoneId;

//"CNPJ_FUNDO", "DT_COMPTC", "VL_TOTAL", "VL_QUOTA", "VL_PATRIM_LIQ", "CAPTC_DIA", "RESG_DIA", "NR_COTST"

public class DailyInformFieldSetMapper implements FieldSetMapper<DailyInform> {

    @Override
    public DailyInform mapFieldSet(FieldSet fieldSet) throws BindException {
        final DailyInform dailyInform = new DailyInform();
        dailyInform.setCnpj(fieldSet.readString("CNPJ_FUNDO"));
        dailyInform.setReferenceDate(fieldSet.readDate("DT_COMPTC").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        dailyInform.setTotalValue(fieldSet.readBigDecimal("VL_TOTAL"));
        dailyInform.setQuotaValue(fieldSet.readBigDecimal("VL_QUOTA"));
        dailyInform.setNetWorth(fieldSet.readBigDecimal("VL_PATRIM_LIQ"));
        dailyInform.setTotalDeposits(fieldSet.readBigDecimal("CAPTC_DIA"));
        dailyInform.setTotalWithdrawals(fieldSet.readBigDecimal("RESG_DIA"));
        dailyInform.setNumberOfQuotaHolders(fieldSet.readLong("NR_COTST"));
        return dailyInform;
    }
}
