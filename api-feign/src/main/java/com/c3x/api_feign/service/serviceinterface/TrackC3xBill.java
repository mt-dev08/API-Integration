package com.c3x.api_feign.service.serviceinterface;

import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillResDTO;

public interface TrackC3xBill {
    public TrackC3xBillResDTO trackPackage(TrackC3xBillReqDTO trackC3xBillReqDTO);

}
