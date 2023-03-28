package com.broadbil.CustomerService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Embeddable
public class SMSDetails {
    private String mobileOperatorISO;
    private String mobileOperatorCode;
    private String smsNumber;
}
