package lxs.spring.test;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public void hello() {
		System.out.println("hello world");
	}
}
