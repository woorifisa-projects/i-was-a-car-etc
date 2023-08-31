package xyz.iwasacar.dummy.domain.carinfo.repository;

import org.springframework.stereotype.Repository;

import xyz.iwasacar.dummy.domain.carinfo.dto.response.CarInfoResponse;
import xyz.iwasacar.dummy.domain.carinfo.dto.response.CarList;

@Repository
public class CarInfoRepositoryImpl implements CarInfoRepository {

	@Override
	public CarInfoResponse findCarByCarNumber(String carNumber) {
		return CarList.getCarInfo(carNumber);
	}

}
