package com.example.batchprocessing;

import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(indexes = {
        @Index(columnList = "cnpj", name = "cnpj_hidx"),
        @Index(columnList = "referenceDate", name = "reference_date_hidx")},
        uniqueConstraints = @UniqueConstraint(columnNames = { "cnpj", "referenceDate" }))
public class DailyInform implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @CNPJ
    @Column(nullable = false)
    private String cnpj;

    @NotNull
    @Column(nullable = false)
    private LocalDate referenceDate;

    @NotNull
    @Column(nullable = false)
    private BigDecimal totalValue;

    @NotNull
    @Column(nullable = false)
    private BigDecimal quotaValue;

    @NotNull
    @Column(nullable = false)
    private BigDecimal netWorth;

    @NotNull
    @Column(nullable = false)
    private BigDecimal totalDeposits;

    @NotNull
    @Column(nullable = false)
    private BigDecimal totalWithdrawals;

    @NotNull
    @Column(nullable = false)
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
