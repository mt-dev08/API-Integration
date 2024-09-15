package com.c3x.api_feign.dto.createAirwayBill;

import com.c3x.api_feign.model.createAirwayBill.AirwayBillData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirwayBillReqDTO {
    @JsonProperty("AirwayBillData")
    private AirwayBillData airwayBillData;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("Password")
    private String password;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("Country")
    private String country;
}
