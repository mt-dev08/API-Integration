package com.c3x.api_feign.feignClient;

import com.c3x.api_feign.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api_feign.dto.createAirwayBill.AirwayBillResDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "createAirwayBillClient", url = "https://portal.c3xpress.com/C3XService.svc")
public interface CreateAirwayBillClient {

    @PostMapping("/CreateAirwayBill")
    AirwayBillResDTO createAirwayBill(@RequestBody AirwayBillReqDTO airwayBillReqDTO);
}
