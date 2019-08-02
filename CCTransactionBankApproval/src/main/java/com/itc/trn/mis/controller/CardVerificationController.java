package com.itc.trn.mis.controller;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cardverification")
public class CardVerificationController {

	private static final Logger logger = LoggerFactory.getLogger(CardVerificationController.class);

	@GetMapping("/transactionapproval/{cardNo}")
	public String verifyCard(@PathParam("cardNo") String cardNo) {
		logger.info("CardVerificationController-PayLoad::"+cardNo);
		//
		return "APR";
	}
}
