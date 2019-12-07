package com.example.batchprocessing;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class FundsInformation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String cnpj;

    @NotNull
    @Column(nullable = false)
    private String socialDenomination;

    @NotNull
    @Column(nullable = false)
    private String fundType;

    @NotNull
    @Column(nullable = false)
    private LocalDate registerDate;

    private LocalDate constitutionDate;

    private LocalDate cancelingDate;

    private String cancelingReason;

    @NotNull
    private String situation;

}
