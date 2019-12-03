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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(LocalDate referenceDate) {
        this.referenceDate = referenceDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public BigDecimal getQuotaValue() {
        return quotaValue;
    }

    public void setQuotaValue(BigDecimal quotaValue) {
        this.quotaValue = quotaValue;
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public BigDecimal getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(BigDecimal totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public BigDecimal getTotalWithdrawals() {
        return totalWithdrawals;
    }

    public void setTotalWithdrawals(BigDecimal totalWithdrawals) {
        this.totalWithdrawals = totalWithdrawals;
    }

    public Long getNumberOfQuotaHolders() {
        return numberOfQuotaHolders;
    }

    public void setNumberOfQuotaHolders(Long numberOfQuotaHolders) {
        this.numberOfQuotaHolders = numberOfQuotaHolders;
    }
}
