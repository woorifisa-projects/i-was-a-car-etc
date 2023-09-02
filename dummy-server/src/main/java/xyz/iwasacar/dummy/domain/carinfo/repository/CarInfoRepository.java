package xyz.iwasacar.dummy.domain.carinfo.repository;

import xyz.iwasacar.dummy.domain.carinfo.dto.response.CarInfoResponse;

public interface CarInfoRepository {

	CarInfoResponse findCarByCarNumber(String name, String carNumber);

}
