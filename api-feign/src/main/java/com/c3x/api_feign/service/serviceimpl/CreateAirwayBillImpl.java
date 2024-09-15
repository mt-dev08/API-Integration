package com.c3x.api_feign.service.serviceimpl;

import com.c3x.api_feign.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api_feign.dto.createAirwayBill.AirwayBillResDTO;
import com.c3x.api_feign.service.serviceinterface.CreateAirwayBill;
import com.c3x.api_feign.feignClient.CreateAirwayBillClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAirwayBillImpl implements CreateAirwayBill {

    @Autowired
    private CreateAirwayBillClient createAirwayBillClient;

    public AirwayBillResDTO createAirwayBill(AirwayBillReqDTO airwayBillReqDTO) {
        return createAirwayBillClient.createAirwayBill(airwayBillReqDTO);
    }
}
