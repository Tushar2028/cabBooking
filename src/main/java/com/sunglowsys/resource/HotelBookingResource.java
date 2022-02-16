package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.service.HotelBookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotelBookingResource {

   private final Logger log = LoggerFactory.getLogger(HotelBookingResource.class);

   private final HotelBookingService hotelBookingService;

    public HotelBookingResource(HotelBookingService hotelBookingService) {
        this.hotelBookingService = hotelBookingService;
    }

    @PostMapping("/hotel-bookings")
    public ResponseEntity<HotelBooking> createHotelBooking(@RequestBody HotelBooking hotelBooking) throws URISyntaxException {
        log.debug("REST request to save HotelBooking : {} ",hotelBooking);
        if(hotelBooking.getId() != null){
            throw new RuntimeException("Id should be null in create api call :");
        }
        HotelBooking result = hotelBookingService.create(hotelBooking);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @PutMapping("/hotel-bookings")
    public ResponseEntity<HotelBooking> update(@RequestBody HotelBooking hotelBooking) throws URISyntaxException{
        log.debug("REST  request to update HotelBooking : {} ",hotelBooking);
        if (hotelBooking.getId() == null){
            throw new RuntimeException("Id should not be null in update api call :");
        }
        HotelBooking result = hotelBookingService.update(hotelBooking);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/hotel-bookings")
    public  ResponseEntity<List<HotelBooking>>  getAllHotelBooking(Pageable pageable){
        log.debug("REST request to get HotelBooking : {} ",pageable.toString());
        Page<HotelBooking> result = hotelBookingService.findAll(pageable);
        return ResponseEntity
                .ok()
                .body(result.getContent());
    }

    @GetMapping("/hotel-bookings/{id}")
    public ResponseEntity<?> getHotelBookingById(@PathVariable Long id){
        log.debug("REST request to get hotelBooking : {} ",id);
        Optional<HotelBooking> result = hotelBookingService.findById(id);
        return ResponseEntity
                .ok()
                .body(result.get());
    }

    @DeleteMapping("/hotel-bookings/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        log.debug("REST request to delete HotelBooking : {} ",id);
        hotelBookingService.delete(id);
        return ResponseEntity
                .ok()
                .build();

    }

}
