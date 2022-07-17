package seol.study.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seol.study.multi.aws.AwsTest;
import seol.study.multi.aws.sqs.SqsTest;
import seol.study.multi.commons.CommonUtils;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		CommonUtils.call();
		CommonUtils.call();
		CommonUtils.call();

		AwsTest.awsTest();
		AwsTest.awsTest();
		AwsTest.awsTest();

//		SqsTest.sqsTest();
	}

}
