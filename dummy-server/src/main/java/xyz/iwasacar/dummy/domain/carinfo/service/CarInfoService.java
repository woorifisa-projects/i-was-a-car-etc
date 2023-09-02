package xyz.iwasacar.dummy.domain.carinfo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import xyz.iwasacar.dummy.domain.carinfo.dto.response.CarInfoResponse;
import xyz.iwasacar.dummy.domain.carinfo.repository.CarInfoRepository;

@Service
@RequiredArgsConstructor
public class CarInfoService {

	private final CarInfoRepository carInfoRepository;

	public CarInfoResponse retrieveCarInfo(final String name, final String carNumber) {

		return carInfoRepository.findCarByCarNumber(name, carNumber);
	}

}
