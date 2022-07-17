package seol.study.multi.api;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seol.study.multi.aws.AwsTest;

@RestController
public class TestController {

	@GetMapping("/index")
	public String echo() {
		return StringUtils.defaultString(null, "야호!!!!!");
	}

}
