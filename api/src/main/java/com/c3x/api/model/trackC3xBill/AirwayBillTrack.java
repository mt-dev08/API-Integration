package com.c3x.api.model.trackC3xBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class AirwayBillTrack {

    @JsonProperty("ActualWeight")
    private String actualWeight;

    @JsonProperty("AirWayBillNo")
    private String airWayBillNo;

    @JsonProperty("ChargeableWeight")
    private String chargeableWeight;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("Dimension")
    private String dimension;

    @JsonProperty("ForwardingNumber")
    private String forwardingNumber;

    @JsonProperty("Origin")
    private String origin;

    @JsonProperty("ShipmentProgress")
    private int shipmentProgress;

    @JsonProperty("ShipperReference")
    private String shipperReference;

    @JsonProperty("TrackingLogDetails")
    private List<TrackingLogDetails> trackingLogDetails;
}
