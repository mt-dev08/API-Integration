package com.c3x.api.service.serviceimpl;

import com.c3x.api.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api.dto.createAirwayBill.AirwayBillResDTO;
import com.c3x.api.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api.dto.trackC3xBill.TrackC3xBillResDTO;
import com.c3x.api.service.serviceinterface.CreateAirwayBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class CreateAirwayBillImpl implements CreateAirwayBill {
    @Autowired
    private RestTemplate restTemplate;

    private final String apiUrl = "https://portal.c3xpress.com/C3XService.svc/CreateAirwayBill";  // Replace with actual API URL

    public AirwayBillResDTO createAirwayBill(AirwayBillReqDTO airwayBillReqDTO) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // Create request entity with headers and body
        HttpEntity<AirwayBillReqDTO> requestEntity = new HttpEntity<>(airwayBillReqDTO, headers);


        // Make API call using RestTemplate
        ResponseEntity<AirwayBillResDTO> responseEntity =
                restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, AirwayBillResDTO.class);

        // Return response body
        return responseEntity.getBody();

    }
}
