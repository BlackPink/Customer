package com.broadbil.CustomerService.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerNumber;
    private String shortName;
    private String isIndividual;
    private String nationality;
    private Integer nationalityNumber;
    private String nationalityDescription;
    private String streetAddress;
    private ArrayList<Object> addressLineTwo;
    private ArrayList<Object> addressLineThree;
    private String townCountry;
    private Long postCode;
    private String country;
    private String countryCode;
    private Integer countryCodeNumber;
    private String dispatchCode;
    @Embedded
    private ContactInformation contactInformation;
}
