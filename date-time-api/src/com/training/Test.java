package com.training;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test {
	
	public static void main(String[] args) {
			
		// LocalDate, LocalTime, LocalDateTime, Duration, Period
		
//		LocalDate date1 = LocalDate.now();
//		System.out.println(date1);
		
//		LocalDate date2 = LocalDate.of(2020, 3, 25);
//		System.out.println(date2);
//		
//		int year = date2.getYear();
//		Month month = date2.getMonth();
//		int day = date2.getDayOfMonth();
//		DayOfWeek weekDay = date2.getDayOfWeek();
//		int totalDays = date2.lengthOfMonth();
//		boolean leap = date2.isLeapYear();
//		
//		System.out.println("Year => " + year);
//		System.out.println("Month => " + month.name());
//		System.out.println("Day of Month => " + day);
//		System.out.println("Day of week => " + weekDay.name());
//		System.out.println("Total days in that month => " + totalDays);
//		System.out.println("Is leap year? " + (leap ? "Yes": "No"));
		
//		LocalDate date3 = LocalDate.parse("2014-03-18");    // "yyyy-MM-dd"
//		System.out.println(date3);
		
		// LocalTime class => Stores a time.
		
//		LocalTime time1 = LocalTime.now();
//		
//		int hour = time1.getHour();
//		int minute = time1.getMinute();
//		int second = time1.getSecond();
//		
//		System.out.println(hour + " : " + minute + " : " + second);
		
//		LocalTime time2 = LocalTime.of(14, 25, 00);
//		System.out.println(time2);
		
//		LocalTime time3 = LocalTime.parse("07:45:00");
//		System.out.println(time3);
		
		
		// LocalDateTime  =>  It stores both date and time.
		
//	    LocalDateTime date5 = LocalDateTime.now();
//	    System.out.println(date5);
		
//		LocalDateTime date6 = LocalDateTime.of(2020, 3, 25, 9, 12);
//		System.out.println(date6);
//		
//		LocalDate d = date6.toLocalDate();
//		LocalTime t = date6.toLocalTime();
//		
//		System.out.println(d);
//		System.out.println(t);
		
		// Duration class => 
		
//		LocalTime t1 = LocalTime.now();
//		LocalTime t2 = LocalTime.of(9,  30);
//		
//		Duration d1 = Duration.between(t2, t1);
//		long minutes = d1.getSeconds() / 60;
//		System.out.println("Duration in seconds => " + d1.getSeconds());
//		System.out.println("Duration in minutes => " + minutes);
//		
//		long minutes2 = ChronoUnit.MINUTES.between(t2, t1);
//		System.out.println("Duration in minutes => " + minutes2);
//		
//		long seconds2 = ChronoUnit.SECONDS.between(t2, t1);
//		System.out.println("Duration in seconds => " + seconds2);
//		
//		long hours = ChronoUnit.HOURS.between(t2, t1);
//		System.out.println("Duration in hours => " + hours);
		
//		LocalDate d1 = LocalDate.now();
//		LocalDate d2 = LocalDate.of(2020, 3, 25);
//		
//		Period p = Period.between(d2, d1);
//		System.out.println("No. of days => " + p.getDays());
//		System.out.println("No. of months => " + p.getMonths());
//		System.out.println("No. of years => " + p.getYears());
		
		LocalDate d1 = LocalDate.now();
		
		// d1.plusDays(5);  // LocalDate object
		
		System.out.println(d1.plusDays(5));
		System.out.println(d1.plusMonths(1));
		System.out.println(d1.plusYears(1));
		
		System.out.println(d1.minusDays(5));
		System.out.println(d1.minusMonths(3));
		System.out.println(d1.minusYears(3));
	}
}
























