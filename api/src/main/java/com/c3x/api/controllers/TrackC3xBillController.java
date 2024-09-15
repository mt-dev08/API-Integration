package com.c3x.api.controllers;

import com.c3x.api.dto.trackC3xBill.TrackC3xBillReqDTO;
import com.c3x.api.dto.trackC3xBill.TrackC3xBillResDTO;
import com.c3x.api.service.serviceimpl.TrackC3xBillImpl;
import com.c3x.api.service.serviceinterface.TrackC3xBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trackc3x")
public class TrackC3xBillController {

    @Autowired
    private TrackC3xBill trackC3xBill;

    @PostMapping("/trackPackage")
    public ResponseEntity<TrackC3xBillResDTO> trackPackage(@RequestBody TrackC3xBillReqDTO trackC3xBillReqDTO) {
        try {
            // Call the service to track the package
            TrackC3xBillResDTO trackC3xBillResDTO = trackC3xBill.trackPackage(trackC3xBillReqDTO);

            // Return the response with 200 OK status
            return new ResponseEntity<>(trackC3xBillResDTO, HttpStatus.OK);
        } catch (Exception e) {
            // Handle any exception and return 500 Internal Server Error
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
