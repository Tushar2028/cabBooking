package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;

import java.util.List;

public interface HotelBookingService {

    HotelBooking create(HotelBooking hotelBooking);

    HotelBooking update(HotelBooking hotelBooking , Long id);

    HotelBooking findById(Long id);

    List<HotelBooking> findAll();

    void delete(Long id);
}
