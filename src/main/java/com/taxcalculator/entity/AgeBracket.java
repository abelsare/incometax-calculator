package com.taxcalculator.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents an age bracket in the system
 */
@Data
@Builder
@Entity
public class AgeBracket {
    @Id
    @GeneratedValue
    private Long id;
    private Integer minAge;
    private Integer maxAge;
}
