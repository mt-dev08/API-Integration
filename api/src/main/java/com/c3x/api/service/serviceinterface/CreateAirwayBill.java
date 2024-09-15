package com.c3x.api.service.serviceinterface;

import com.c3x.api.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api.dto.createAirwayBill.AirwayBillResDTO;

public interface CreateAirwayBill {
    public AirwayBillResDTO createAirwayBill(AirwayBillReqDTO airwayBillReqDTO);
}
