package ru.varren.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class PaymentType extends AbstractEntity {
    private static final long serialVersionUID = 1771796458999002051L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String code;

    private String name;

}
