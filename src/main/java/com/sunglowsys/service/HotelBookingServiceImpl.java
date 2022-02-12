package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.repository.HotelBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelBookingServiceImpl implements HotelBookingService{

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @Override
    public HotelBooking create(HotelBooking hotelBooking) {
        return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public HotelBooking update(HotelBooking hotelBooking, Long id) {
        HotelBooking hotelBooking1 = findById(id);
        hotelBooking1.setCheck_in_date(hotelBooking.getCheck_in_date());
        hotelBooking1.setCheck_out_date(hotelBooking.getCheck_out_date());
        hotelBooking1.setTotal_guest(hotelBooking.getTotal_guest());
        hotelBooking1.setNo_of_nights(hotelBooking.getNo_of_nights());
        hotelBooking1.setNo_of_rooms(hotelBooking.getNo_of_rooms());
        hotelBooking1.setBooking_amount(hotelBooking.getBooking_amount());
        hotelBooking1.setCustomer_id(hotelBooking.getCustomer_id());
        hotelBooking1.setHotel_id(hotelBooking.getHotel_id());
        hotelBooking1.setRoom_type_id(hotelBooking.getRoom_type_id());
        hotelBooking1.setRate_plan_id(hotelBooking.getRate_plan_id());
        return hotelBookingRepository.save(hotelBooking1);
    }

    @Override
    public HotelBooking findById(Long id) {
        return hotelBookingRepository.findById(id).get();
    }

    @Override
    public List<HotelBooking> findAll() {
        return hotelBookingRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        hotelBookingRepository.deleteById(id);
    }
}
