package com.c3x.api.model.trackC3xBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrackingLogDetails {
    @JsonProperty("ActivityDate")
    private String activityDate;

    @JsonProperty("ActivityTime")
    private String activityTime;

    @JsonProperty("DeliveredTo")
    private String deliveredTo;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Remarks")
    private String remarks;

    @JsonProperty("Status")
    private String status;
}

