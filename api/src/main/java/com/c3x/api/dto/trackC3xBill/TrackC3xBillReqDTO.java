package com.c3x.api.dto.trackC3xBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
public class TrackC3xBillReqDTO {

    @JsonProperty("TrackingAWB")
    private String trackingAWB;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("Password")
    private String password;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("Country")
    private String country;
}
