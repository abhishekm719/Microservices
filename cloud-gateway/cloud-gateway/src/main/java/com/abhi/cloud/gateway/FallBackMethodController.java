//package com.abhi.cloud.gateway;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
//
//@RestController
//public class FallBackMethodController {
//	
//	@GetMapping("/employeeServiceFallBack")
//	@CircuitBreaker(name = "employeeBreaker", fallbackMethod = "employeeServiceFallBackMethod")
//	public String employeeServiceFallBackMethod() {
//		return "Employee service taking longer time";
//		
//	}
//	@GetMapping("/departmentServiceFallBack")
//	@CircuitBreaker(name = "departmentBreaker", fallbackMethod = "departmentServiceFallBackMethod")
//
//	public String departmentServiceFallBackMethod() {
//		return "Department service taking longer time";
//		
//	}
//
//}
