package com.kodilla.cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardsService {
	@Autowired
	private CardsRepository cardsRepository;
	@Autowired
	private CardsMapper cardsMapper;

	public List<CardDTO> getCardsForCustomer(Long customerId) {
		return cardsRepository.findByCustomerId(customerId)
				.stream()
				.map(card -> cardsMapper.mapToCardDTO(card))
				.collect(Collectors.toList());
	}
}
