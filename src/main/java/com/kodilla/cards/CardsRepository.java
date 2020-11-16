package com.kodilla.cards;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardsRepository extends CrudRepository<Card, Long> {

	List<Card> findByCustomerId(Long customerId);
}
