package com.c3x.api_feign.service.serviceimpl;

import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillResDTO;
import com.c3x.api_feign.service.serviceinterface.TrackC3xBill;
import com.c3x.api_feign.feignClient.TrackC3xBillClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackC3xBillImpl implements TrackC3xBill {

    @Autowired
    private TrackC3xBillClient trackC3xBillClient;

    public TrackC3xBillResDTO trackPackage(TrackC3xBillReqDTO trackC3xBillReqDTO) {
        return trackC3xBillClient.trackPackage(trackC3xBillReqDTO);
    }
}
