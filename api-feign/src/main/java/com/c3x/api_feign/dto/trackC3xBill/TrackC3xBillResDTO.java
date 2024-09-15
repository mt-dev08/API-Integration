package com.c3x.api_feign.dto.trackC3xBill;

import com.c3x.api_feign.model.trackC3xBill.AirwayBillTrack;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.*;

@Getter
@Setter
public class TrackC3xBillResDTO {

    @JsonProperty("AirwayBillTrackList")
    private List<AirwayBillTrack> airwayBillTrackList;

    private int code;
    private String description;
}
