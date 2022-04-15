package com.training.dateapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class TestLatestJava8Date {

	
public static void main(String[] args) {
	
//before Java8
	Date d = new Date ();
	
	System.out.println(d.toString());
	
//from java8
	
	LocalDate ld =  LocalDate.now();
	System.out.println(ld);
	
	ld =  LocalDate.of(2020, Month.JUNE, 01);
	System.out.println(ld);
	
	LocalTime lt =  LocalTime.now();
	System.out.println(lt);
	
	for (String s :ZoneId.getAvailableZoneIds()) {
		System.out.println(s);
		LocalTime lt1 =  LocalTime.now(ZoneId.of(s));
		System.out.println(lt1);
	}
	
	LocalTime lt1 =  LocalTime.now(ZoneId.of("GMT"));
	System.out.println(lt1);
	
Instant i = Instant.now();
System.out.println(i);

//we can do something like this also LocalDate.of(year, month, dayOfMonth)

}
	
	
}
