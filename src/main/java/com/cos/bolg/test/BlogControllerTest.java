package com.cos.bolg.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //특정 어노테이션이 붙어 있는 클래스파일을 ioc 스프링컨테이너에 관리해준다. 
public class BlogControllerTest {
	@GetMapping("/test/alldo")
	public String Test() {
		return "<h1>Alldo</h1>";
	}
}
