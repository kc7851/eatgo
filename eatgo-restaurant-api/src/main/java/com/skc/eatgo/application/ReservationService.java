package com.skc.eatgo.application;

import com.skc.eatgo.domain.Reservation;
import com.skc.eatgo.domain.ReservationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getReservations(long restaurantId) {
        return reservationRepository.findAllByRestaurantId(restaurantId);
    }
}
