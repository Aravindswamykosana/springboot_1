package com.jsp.springboot_1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_1.dto.Student;

@RestController
public class Demo1 {
	@GetMapping("/demo")
	public String demo1() {
//		System.out.println("haooooi");
		return "hai";
	}
	@GetMapping("/demo1")
//	public void demo2(@RequestParam int a,@RequestParam String name) {
//		System.out.println(a+" "+name);
//	}
	public String demo2(@RequestParam("a") int b,@RequestParam String name) {
		return b+" "+name;
	}
	@GetMapping("/stud")
	public Student stud() {
		Student s = new Student(1,"hai","a@gmail.com",565848);
		return  s;
	}
	
	@PostMapping("/stud1")
//	public Student stud(@RequestBody Student stud) {
////		Student s = new Student(1,"hai","a@gmail.com",565848);
//		System.out.println(stud);
//		return  stud;
//	}
	public void stud(@RequestBody Student stud) {
//		Student s = new Student(1,"hai","a@gmail.com",565848);
		System.out.println(stud);
	}
//	http://loclahost:8080/allData/id=10.........(using query string)
	@PostMapping("/allData")
//	public List<Student> allData(@RequestBody List<Student> stud){
//		System.out.println(stud);
//		return stud;
//	}
	public void allData(@RequestBody List<Student> stud){
		System.out.println(stud);
	}
//	http://loclahost:8080/square/4 using pathvariable(url rewriter)
	@PostMapping("/square/{value}")
	public int square(@PathVariable("value") int a) {
		return a*a;
	}
} 
