package com.kodilla.cards;

import org.springframework.stereotype.Component;

@Component
public class CardsMapper {

	public CardDTO mapToCardDTO(Card card) {
		return new CardDTO(card.getId(), card.getCustomerId(), card.getCardType());
	}
}
