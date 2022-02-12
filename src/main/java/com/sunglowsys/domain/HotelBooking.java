package com.sunglowsys.domain;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "HotelBooking_1")
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String check_in_date;

    @NotNull
    private String check_out_date;

    @NotNull
    private Integer total_guest;

    @NotNull
    private Integer no_of_nights;

    @NotNull
    private Integer no_of_rooms;

    @NotNull
    private Integer booking_amount;

    @NotNull
    private Integer customer_id;

    @NotNull
    private Integer hotel_id;

    @NotNull
    private Integer room_type_id;

    @NotNull
    private Integer rate_plan_id;

    public HotelBooking() {
        System.out.println("HotelBooking object is created :");
    }

    public HotelBooking(Long id, String check_in_date, String check_out_date, Integer total_guest, Integer no_of_nights, Integer no_of_rooms, Integer booking_amount, Integer customer_id, Integer hotel_id, Integer room_type_id, Integer rate_plan_id) {
        this.id = id;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.total_guest = total_guest;
        this.no_of_nights = no_of_nights;
        this.no_of_rooms = no_of_rooms;
        this.booking_amount = booking_amount;
        this.customer_id = customer_id;
        this.hotel_id = hotel_id;
        this.room_type_id = room_type_id;
        this.rate_plan_id = rate_plan_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(String check_out_date) {
        this.check_out_date = check_out_date;
    }

    public Integer getTotal_guest() {
        return total_guest;
    }

    public void setTotal_guest(Integer total_guest) {
        this.total_guest = total_guest;
    }

    public Integer getNo_of_nights() {
        return no_of_nights;
    }

    public void setNo_of_nights(Integer no_of_nights) {
        this.no_of_nights = no_of_nights;
    }

    public Integer getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(Integer no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public Integer getBooking_amount() {
        return booking_amount;
    }

    public void setBooking_amount(Integer booking_amount) {
        this.booking_amount = booking_amount;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Integer getRate_plan_id() {
        return rate_plan_id;
    }

    public void setRate_plan_id(Integer rate_plan_id) {
        this.rate_plan_id = rate_plan_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(check_in_date, that.check_in_date) && Objects.equals(check_out_date, that.check_out_date) && Objects.equals(total_guest, that.total_guest) && Objects.equals(no_of_nights, that.no_of_nights) && Objects.equals(no_of_rooms, that.no_of_rooms) && Objects.equals(booking_amount, that.booking_amount) && Objects.equals(customer_id, that.customer_id) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(room_type_id, that.room_type_id) && Objects.equals(rate_plan_id, that.rate_plan_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, check_in_date, check_out_date, total_guest, no_of_nights, no_of_rooms, booking_amount, customer_id, hotel_id, room_type_id, rate_plan_id);
    }


    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", check_in_date='" + check_in_date + '\'' +
                ", check_out_date='" + check_out_date + '\'' +
                ", total_guest=" + total_guest +
                ", no_of_nights=" + no_of_nights +
                ", no_of_rooms=" + no_of_rooms +
                ", booking_amount=" + booking_amount +
                ", customer_id=" + customer_id +
                ", hotel_id=" + hotel_id +
                ", room_type_id=" + room_type_id +
                ", rate_plan_id=" + rate_plan_id +
                '}';
    }
}
