package xyz.iwasacar.dummy.domain.carinfo.dto.response;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;

@Builder
public record CarInfoResponse(

	String memberName,
	String carName,
	Long carTypeId,
	String carType,
	Long brandId,
	String brand,
	Long colorId,
	String color,
	String info,
	String transmission,
	String fuel,
	String drivingMethod,

	@JsonFormat(pattern = "yyyy-MM-dd")
	LocalDate year,
	Double fuelEfficiency,
	Double displacement,
	Integer accidentHistory,
	Boolean inundationHistory,

	List<String> images,
	Map<String, List<String>> options

) {
}
