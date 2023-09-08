package xyz.iwasacar.dummy.domain.member;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/members")
@Slf4j
public class MemberController {

	@GetMapping("/identification")
	public ResponseEntity<Void> checkIdentification(
		@RequestParam String name,
		@RequestParam String rrnf,
		@RequestParam String rrnb
	) {
		HttpStatus status = checkRrn(name, rrnf, rrnb) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

		return ResponseEntity.status(status).build();
	}

	private boolean checkRrn(final String name, final String rrnf, final String rrnb) {

		String nameRegex = "[가-힣]{2,10}$";
		String rrnfRegex = "d{2}([0]\\d|[1][0-2])([0][1-9]|[1-2]\\d|[3][0-1])";
		String rrnbRegex = "[1-4]\\d{6}";

		Pattern namePattern = Pattern.compile(nameRegex);
		Pattern front = Pattern.compile(rrnfRegex);
		Pattern back = Pattern.compile(rrnbRegex);

		Matcher matcher = namePattern.matcher(name);
		Matcher frontMatcher = front.matcher(rrnf);
		Matcher backMatcher = back.matcher(rrnb);

		return matcher.find() && frontMatcher.find() && backMatcher.find();
	}

}
