package com.example.batchprocessing;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DailyInform {
    private String cnpj;
    private LocalDate referenceDate;
    private BigDecimal totalValue;
    private BigDecimal quotaValue;
    private BigDecimal netWorth;
    private BigDecimal totalDeposits;
    private BigDecimal totalWithdrawals;
    private Long numberOfQuotaHolders;

    public DailyInform() {};

    public DailyInform(String cnpj, LocalDate referenceDate, BigDecimal totalValue, BigDecimal quotaValue, BigDecimal netWorth, BigDecimal totalDeposits, BigDecimal totalWithdrawals, Long numberOfQuotaHolders) {
        this.cnpj = cnpj;
        this.referenceDate = referenceDate;
        this.totalValue = totalValue;
        this.quotaValue = quotaValue;
        this.netWorth = netWorth;
        this.totalDeposits = totalDeposits;
        this.totalWithdrawals = totalWithdrawals;
        this.numberOfQuotaHolders = numberOfQuotaHolders;
    }

    @Override
    public String toString() {
        return "DailyInform{" +
                "cnpj='" + cnpj + '\'' +
                ", referenceDate=" + referenceDate +
                ", quotaValue=" + quotaValue +
                '}';
    }
}
