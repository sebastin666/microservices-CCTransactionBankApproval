package com.itc.trn.mis.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardverification")
public class CardVerificationController {

	private static final Logger logger = LoggerFactory.getLogger(CardVerificationController.class);

	@GetMapping("/transactionapproval/{cardNo}")
	public String verifyCard(@PathVariable("cardNo") String cardNo) {
		logger.info("CardVerificationController-PayLoad::"+cardNo);
		//
		return "APR";
	}
}
