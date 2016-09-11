package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @SpringBootApplication : 스프링 컴포넌트 검색과 스프링 부트 자동 구성 활성화
 * (다음 애너테이션 세개를 묶은 것
 * 	1. 스프링의 @Configuration : 이 애너테이션이 붙은 클래스를 스프링의 자바 기반 구성 클래스로 지정
 * 	2. 스프링의 @ComponentScan : 컴포넌트 검색 기능을 활성화하여 웹 컨트롤러 클래스나 다른 컴포넌트 클래스들을 자동 검색하여 스프링 애플리케이션 컨텍스트에 빈으로 등록시
 * 	3. 스프링 부트의 @EnableAutoConfiguration : 스프링 부트의 자동 구성 마법을 일으키는 애너테이션)							
 */
public class ReadingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);
		
		/*
		 * 만약 스프링 부트의 자동 구성이 제공하는 구성 이외에 추가적인 스프링 구성이 필요하다면,
		 * @Configuration 애너테이션을 포함한 새 클래스를 따서 작성하는게 좋다.
		 * (매우 간단한 추가구성은 걍 이 클래스에 추가해도 무방함. 근데 웬만하면 걍 따로 따는게..)
		 */
	}
}
