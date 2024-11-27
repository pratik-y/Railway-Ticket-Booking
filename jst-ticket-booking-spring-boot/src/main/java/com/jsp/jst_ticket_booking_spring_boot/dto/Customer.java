package com.jsp.jst_ticket_booking_spring_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	
		@Id
	    private int id;
	    private String name;
	    private String email;
	    private String password;


}
