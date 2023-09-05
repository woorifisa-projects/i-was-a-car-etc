package xyz.iwasacar.dummy.domain.carinfo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import xyz.iwasacar.dummy.domain.carinfo.dto.response.CarInfoResponse;
import xyz.iwasacar.dummy.domain.carinfo.service.CarInfoService;

@RestController
@RequestMapping("/api/v1/carInfo")
@RequiredArgsConstructor
@Slf4j
public class CarInfoController {

	private final CarInfoService carInfoService;

	@GetMapping
	public ResponseEntity<CarInfoResponse> retrieveCarInfo(
		@RequestParam final String name,
		@RequestParam final String carNumber
	) {
		log.info("{} {}", name, carNumber);
		CarInfoResponse carInfoResponse = carInfoService.retrieveCarInfo(name, carNumber);
		log.info(carInfoResponse.toString());
		return ResponseEntity.ok(carInfoResponse);
	}

}
