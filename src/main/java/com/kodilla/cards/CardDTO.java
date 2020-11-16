package com.kodilla.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CardDTO {
	private Long id;
	private Long customerId;
	private String cardType;
}
