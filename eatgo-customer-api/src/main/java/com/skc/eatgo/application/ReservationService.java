package com.skc.eatgo.application;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReservationService {

    public void addReservation(Long restaurantId, Long userId, String name,
            String date, String time, Integer partySize) {
        //TODO: 세부 구현해야 함.
    }
}
