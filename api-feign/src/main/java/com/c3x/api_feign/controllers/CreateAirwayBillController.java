package com.c3x.api_feign.controllers;

import com.c3x.api_feign.dto.createAirwayBill.AirwayBillReqDTO;
import com.c3x.api_feign.dto.createAirwayBill.AirwayBillResDTO;
import com.c3x.api_feign.service.serviceinterface.CreateAirwayBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create")
public class CreateAirwayBillController {


        @Autowired
        private CreateAirwayBill createAirwayBill;

        @PostMapping("/createAirwayBill")
        public ResponseEntity<AirwayBillResDTO> createBill(@RequestBody AirwayBillReqDTO airwayBillReqDTO) {
            try {
                // Call the service to create the AirwayBill
                AirwayBillResDTO airwayBillResDTO = createAirwayBill.createAirwayBill(airwayBillReqDTO);

                // Return the response with 200 OK status
                return new ResponseEntity<>(airwayBillResDTO, HttpStatus.OK);
            } catch (Exception e) {
                // Handle any exception and return 500 Internal Server Error
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
}


