package com.broadbil.CustomerService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Embeddable
public class ContactInformation {
    private String communicationChannel;
    private String phoneNumber;
    private String officePhoneNumber;
    private Long faxNumber;
    @Embedded
    private SMSDetails smsDetails;
    private String email;
}
