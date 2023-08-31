package xyz.iwasacar.dummy.domain.carinfo.dto.response;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CarList {

	private static final Random random = new Random();

	private static final List<CarInfoResponse.CarInfoResponseBuilder> list = List.of(
		CarInfoResponse.builder()
			.name("K8")
			.carType("세단")
			.brand("기아")
			.color("검정")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(2021, 8, 29))
			.fuelEfficiency(9.0)
			.displacement(1999.0)
			.accidentHistory(1)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/k8Image.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스"
				),
				"편의", List.of(
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			)),

		CarInfoResponse.builder()
			.name("소나타")
			.carType("세단")
			.brand("현대")
			.color("흰색")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(2020, 1, 1))
			.fuelEfficiency(12.0)
			.displacement(1999.0)
			.accidentHistory(0)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/sonata.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"엠비언트라이트",
					"워크인시트",
					"전동햇빛가리개",
					"통풍시트(뒷자석)"
				),
				"안전", List.of(
					"브레이크 잠김 방지",
					"전자제어서스펜션",
					"미끄럼방지",
					"차체자세제어장치",
					"차선이탈경보장치",
					"도난경보기",
					"타이어공기압감지"
				),
				"편의", List.of(
					"전동트렁크",
					"핸들열선",
					"무선도어 잠금장치",
					"레인센서와이퍼",
					"스탑앤고",
					"무선충전"
				),
				"멀티미디어", List.of(
					"내비게이션",
					"CD플레이어",
					"CD체인저",
					"AV시스템",
					"MP3"
				)
			)),

		CarInfoResponse.builder()
			.name("마티즈")
			.carType("경차")
			.brand("대우")
			.color("황금")
			.transmission("자동5단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(1999, 5, 1))
			.fuelEfficiency(15.0)
			.displacement(999.0)
			.accidentHistory(5)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/matiz.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
				),
				"내장", List.of(
					"파워핸들"
				),
				"안전", List.of(
					"에어백"
				),
				"편의", List.of(
				),
				"멀티미디어", List.of(
					"AUX"
				)
			)),

		CarInfoResponse.builder()
			.name("911")
			.carType("스포츠카")
			.brand("포르쉐")
			.color("은색")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("사륜")
			.year(LocalDate.of(2022, 12, 31))
			.fuelEfficiency(6.0)
			.displacement(2999.0)
			.accidentHistory(0)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/911.png"
			))
			.options(Map.of(
				"외장", List.of(
					"제논라이트",
					"알루미늄 휠",
					"전동접이식미러",
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트",
					"슈퍼비전계기판",
					"패들시프트",
					"하이패스",
					"엠비언트라이트",
					"워크인시트",
					"전동햇빛가리개",
					"통풍시트(뒷자석)"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스",
					"브레이크 잠김 방지",
					"전자제어서스펜션",
					"미끄럼방지",
					"차체자세제어장치",
					"차선이탈경보장치",
					"도난경보기",
					"타이어공기압감지",
					"주차감지센서",
					"전방카메라",
					"자동긴급제동"
				),
				"편의", List.of(
					"스마트키",
					"파워윈도우",
					"자동도어잠금",
					"풀오토에어컨",
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤",
					"전동트렁크",
					"핸들열선",
					"무선도어 잠금장치",
					"레인센서와이퍼",
					"스탑앤고",
					"무선충전"
				),
				"멀티미디어", List.of(
					"내비게이션",
					"AUX",
					"USB",
					"핸즈프리",
					"iPod 단자",
					"뒷자석모니터",
					"스마트폰미러링",
					"블루투스"
				)
			)),

		CarInfoResponse.builder()
			.name("X6")
			.carType("SUV")
			.brand("BMW")
			.color("갈색")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("후륜")
			.year(LocalDate.of(2023, 4, 6))
			.fuelEfficiency(8.0)
			.displacement(2999.0)
			.accidentHistory(3)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/x6.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스"
				),
				"편의", List.of(
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			)),
		CarInfoResponse.builder()
			.name("봉고 EV")
			.carType("트럭")
			.brand("기아")
			.color("흰색")
			.transmission("자동")
			.fuel("전기")
			.drivingMethod("사륜")
			.year(LocalDate.of(2023, 3, 17))
			.fuelEfficiency(3.1)
			.displacement(1999.0)
			.accidentHistory(7)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/bongoev.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등"
				),
				"내장", List.of(
					"열선시트",
					"파워핸들",
					"핸들 리모컨",
					"전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰"
				),
				"편의", List.of(
					"오토라이트"
				),
				"멀티미디어", List.of(
					"AUX",
					"핸즈프리"
				)
			)),
		CarInfoResponse.builder()
			.name("고스트")
			.carType("세단")
			.brand("롤스로이스")
			.color("흰색")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("후륜")
			.year(LocalDate.of(2023, 8, 17))
			.fuelEfficiency(7.0)
			.displacement(5999.0)
			.accidentHistory(0)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/ghost.webp"
			))
			.options(Map.of(
				"외장", List.of(
					"제논라이트",
					"알루미늄 휠",
					"전동접이식미러",
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트",
					"슈퍼비전계기판",
					"패들시프트",
					"하이패스",
					"엠비언트라이트",
					"워크인시트",
					"전동햇빛가리개",
					"통풍시트(뒷자석)"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스",
					"브레이크 잠김 방지",
					"전자제어서스펜션",
					"미끄럼방지",
					"차체자세제어장치",
					"차선이탈경보장치",
					"도난경보기",
					"타이어공기압감지",
					"주차감지센서",
					"전방카메라",
					"자동긴급제동"
				),
				"편의", List.of(
					"스마트키",
					"파워윈도우",
					"자동도어잠금",
					"풀오토에어컨",
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤",
					"전동트렁크",
					"핸들열선",
					"무선도어 잠금장치",
					"레인센서와이퍼",
					"스탑앤고",
					"무선충전"
				),
				"멀티미디어", List.of(
					"내비게이션",
					"AUX",
					"USB",
					"핸즈프리",
					"iPod 단자",
					"뒷자석모니터",
					"스마트폰미러링",
					"블루투스"
				)
			)),
		CarInfoResponse.builder()
			.name("산타페")
			.carType("SUV")
			.brand("현대")
			.color("검정")
			.transmission("자동6단")
			.fuel("디젤")
			.drivingMethod("전륜")
			.year(LocalDate.of(2021, 8, 29))
			.fuelEfficiency(9.0)
			.displacement(1999.0)
			.accidentHistory(2)
			.inundationHistory(true)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/santafe.jpeg"
			))
			.options(Map.of(

				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스"
				),
				"편의", List.of(
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			)),
		CarInfoResponse.builder()
			.name("스타리아")
			.carType("승합차")
			.brand("현대")
			.color("검정")
			.transmission("자동6단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(2021, 8, 29))
			.fuelEfficiency(9.0)
			.displacement(1999.0)
			.accidentHistory(1)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/santafe.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉"
				),
				"내장", List.of(
					"열선시트",
					"파워핸들",
					"핸들 리모컨",
					"전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라"
				),
				"편의", List.of(
					"오토라이트",
					"전자식파킹브레이크",
					"ECM룸밀러"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			)),

		CarInfoResponse.builder()
			.name("스타리아")
			.carType("승합차")
			.brand("현t")
			.color("검정")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(2021, 8, 29))
			.fuelEfficiency(9.0)
			.displacement(1999.0)
			.accidentHistory(1)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/staria.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스"
				),
				"편의", List.of(
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			)),
		CarInfoResponse.builder()
			.name("K5")
			.carType("세단")
			.brand("기아")
			.color("파랑")
			.transmission("자동8단")
			.fuel("가솔린")
			.drivingMethod("전륜")
			.year(LocalDate.of(2020, 3, 6))
			.fuelEfficiency(11.0)
			.displacement(1999.0)
			.accidentHistory(0)
			.inundationHistory(false)
			.images(List.of(
				"https://i-was-a-car.s3.ap-northeast-2.amazonaws.com/k5.jpeg"
			))
			.options(Map.of(
				"외장", List.of(
					"주간주행등",
					"썬루프",
					"루프렉",
					"LED리어램프",
					"하이빔 어시스트"
				),
				"내장", List.of(
					"열선시트",
					"통풍시트",
					"파워핸들",
					"핸들 리모컨",
					"가죽시트",
					"전동시트",
					"뒷자석전동시트"
				),
				"안전", List.of(
					"사이드&커튼에어백",
					"에어백",
					"후방카메라",
					"어라운드뷰",
					"블랙박스"
				),
				"편의", List.of(
					"오토라이트",
					"자동주차시스템",
					"전자식파킹브레이크",
					"헤드업디스플레이",
					"ECM룸밀러",
					"크루즈컨트롤"
				),
				"멀티미디어", List.of(
					"AUX",
					"USB",
					"핸즈프리"
				)
			))
	);

	public static CarInfoResponse getCarInfo(String carNumber) {
		try {
			char c = carNumber.charAt(carNumber.length() - 1);
			int i = Integer.parseInt(String.valueOf(c));

			return list.get(i).info(carNumber).build();
		} catch (Exception e) {
			return list
				.get(random.nextInt(list.size()))
				.info(carNumber)
				.build();
		}
	}

}
