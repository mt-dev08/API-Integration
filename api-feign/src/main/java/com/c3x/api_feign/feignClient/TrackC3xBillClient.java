package com.c3x.api_feign.feignClient;

import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api_feign.dto.trackC3xBill.TrackC3xBillResDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "trackC3xBillClient", url = "https://portal.c3xpress.com/C3XService.svc")
public interface TrackC3xBillClient {

    @PostMapping("/Tracking")
    TrackC3xBillResDTO trackPackage(@RequestBody TrackC3xBillReqDTO trackC3xBillReqDTO);
}
