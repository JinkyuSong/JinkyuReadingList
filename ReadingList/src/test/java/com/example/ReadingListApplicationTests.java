package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
/*
 * 뭐 예전같으면 
 * @SpringApplicationConfiguration(classes=ReadingListApplication.class) : 테스트 클래스에서 스프링 부트 컨텍스트 적
 * (부트없이 걍 생 스프링이면 @ContextConfiguration로 불러옴)
 * @WebAppConfiguration : 
 * 이런 식으로 했는데 지금은 걍 @SpringBootTest로 통일된듯?
 * @SpringBootTest가 정확히 뭘 대체하는지 확인 필요.(구글로도 찾기 어렵네..)
 */
public class ReadingListApplicationTests {

	@Test
	public void contextLoads() {
		//아무 내용없이 비워두고 테스트해도 애플리케이션 컨텍스트가 문제없이 로드했는지 테스트 가능
	}

}
