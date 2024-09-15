package com.c3x.api.service.serviceimpl;

import com.c3x.api.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api.dto.trackC3xBill.TrackC3xBillResDTO;
import com.c3x.api.service.serviceinterface.TrackC3xBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrackC3xBillImpl implements TrackC3xBill {


    @Autowired
    private RestTemplate restTemplate;

    private final String apiUrl = "https://portal.c3xpress.com/C3XService.svc/Tracking";  // Replace with actual API URL

    public TrackC3xBillResDTO trackPackage(TrackC3xBillReqDTO trackC3xBillReqDTO) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // Create request entity with headers and body
        HttpEntity<TrackC3xBillReqDTO> requestEntity = new HttpEntity<>(trackC3xBillReqDTO, headers);

        // Make API call using RestTemplate
        ResponseEntity<TrackC3xBillResDTO> responseEntity =
                restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, TrackC3xBillResDTO.class);

        // Return response body
        return responseEntity.getBody();
    }

}