package com.taxcalculator.entity;

import com.taxcalculator.constant.TaxRegime;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Represents an age bracket in the system
 */
@Data
@Builder
@Entity
public class TaxSlab {
    @Id
    @GeneratedValue
    private Long id;
    private TaxRegime regime;
    private BigDecimal minIncome;
    private BigDecimal maxIncome;
    private BigDecimal baseAmount;
    private BigDecimal aboveAmount;
    private Double percent;
    private Double surcharge;
}
