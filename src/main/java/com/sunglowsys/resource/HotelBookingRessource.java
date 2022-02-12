package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.service.HotelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelBookingRessource {

    @Autowired
    private HotelBookingService hotelBookingService;

    @PostMapping("/hotel_bookings")
    public ResponseEntity<?> create(@RequestBody HotelBooking hotelBooking){
        HotelBooking result = hotelBookingService.create(hotelBooking);
        return ResponseEntity.ok().body("HotelBooking is created Successfully : " + result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HotelBooking> update(@RequestBody HotelBooking hotelBooking, @PathVariable("id") Long id){
        HotelBooking result = hotelBookingService.update(hotelBooking,id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping
    public List<HotelBooking> getAll(){
        List<HotelBooking> result = hotelBookingService.findAll();
        return result;
    }

    @GetMapping("/get/{id}")
    public HotelBooking getById(@PathVariable("id") Long id){
            return hotelBookingService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        hotelBookingService.delete(id);
        return ResponseEntity.ok().body("HotelBooking is deleted on this ID : " + id);
    }

}
