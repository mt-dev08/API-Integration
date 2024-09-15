package com.c3x.api.dto.createAirwayBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirwayBillResDTO {

    @JsonProperty("AirwayBillNumber")
    private String airwayBillNumber;

    @JsonProperty("Code")
    private int code;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DestinationCode")
    private String destinationCode;
}
