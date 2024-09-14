package com.example.demo.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepositoty;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Autowired
	OrderRepositoty orderRepo;
	
	/*
	 * @Override public void run(ApplicationArguments args) throws Exception { Order
	 * order1=new Order("orderid#101001",LocalDate.of(2024,9, 1),"out"); Order
	 * order2=new Order("orderid#101002",LocalDate.of(2024,9, 2),"shipped"); Order
	 * order3=new Order("orderid#101003",LocalDate.of(2024,9, 3),"received"); Order
	 * order4=new Order("orderid#101004",LocalDate.of(2024,9, 4),"lost"); Order
	 * order5=new Order("orderid#101005",LocalDate.of(2024,9, 13),"damaged");
	 * 
	 * orderRepo.saveAll(Arrays.asList(order1,order2,order3,order3,order4,order5));
	 * }
	 */
	
	
	//save upsert method does insert as above if id exists as inserted above will do update n below step if i change status to received from shipped
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
 //        Order order=new Order("orderid#101001",LocalDate.of(2024,9, 13),"received");
    //     orderRepo.save(order);
	//}
	
	/*
	 * Optional<Order> opt=orderRepo.findById("orderid#101001");
	 * System.out.println("opt is"+opt); if(opt.isPresent()) { Order order =
	 * opt.get(); System.out.println("values are "+ order.getId() +
	 * "  "+order.getStatus()); }
	 */
	
	
	//}
	
	
	
	//sort concept
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * Order order1=new Order("orderid#101001",LocalDate.of(2024,9, 1),"out"); Order
		 * order2=new Order("orderid#101002",LocalDate.of(2024,9, 2),"shipped"); Order
		 * order3=new Order("orderid#101003",LocalDate.of(2024,9, 3),"received"); Order
		 * order4=new Order("orderid#101004",LocalDate.of(2024,9, 4),"lost"); Order
		 * order5=new Order("orderid#101005",LocalDate.of(2024,9, 13),"damaged");
		 * 
		 * orderRepo.saveAll(Arrays.asList(order1,order2,order3,order3,order4,order5));
		 */
		Sort sort=Sort.by("status");//default ascending
		//Sort sort=Sort.by("status").descending();//default ascending
		
		orderRepo.findAll(sort).forEach(System.out::println);
		
	}
	
}
