package com.kodilla.cards;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/v1/cards", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class CardsController {
	@Autowired
	private CardsService cardsService;

	@GetMapping
	public GetCardsResponse getCards(@RequestParam("customerId") Long customerId) {
		log.info("Get cards for customerId; {}", customerId);
		List<CardDTO> cards = cardsService.getCardsForCustomer(customerId);
		return GetCardsResponse.of(cards);
	}
}
