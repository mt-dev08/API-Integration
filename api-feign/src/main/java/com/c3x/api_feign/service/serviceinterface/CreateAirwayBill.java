package com.c3x.api_feign.service.serviceinterface;

import com.c3x.api_feign.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api_feign.dto.createAirwayBill.AirwayBillResDTO;

public interface CreateAirwayBill {
    public AirwayBillResDTO createAirwayBill(AirwayBillReqDTO airwayBillReqDTO);
}
