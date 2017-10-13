package ru.varren.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
public class Movement extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PaymentType paymentType;

    @Column(nullable = false)
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(nullable = false)
    private Instant currencyDate = Instant.now();


}
