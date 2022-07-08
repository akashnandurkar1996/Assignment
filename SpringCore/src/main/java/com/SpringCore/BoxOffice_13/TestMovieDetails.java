package com.SpringCore.BoxOffice_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMovieDetails {
	public static void main(String[] args) {
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("BoxOffice_13.xml");
		MovieDetails md1 = (MovieDetails) ctxobj.getBean("moviebean1");
		MovieDetails md2 = (MovieDetails) ctxobj.getBean("moviebean2");
		MovieDetails md3 = (MovieDetails) ctxobj.getBean("moviebean3");

		List<MovieDetails> movielist = new ArrayList<MovieDetails>();
		movielist.add(md1);
		movielist.add(md2);
		movielist.add(md3);

		for (MovieDetails m : movielist) {
			System.out.println(m.toString());
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie name");
		String mname = sc.next();

		System.out.println("Enter how many people watched this film last week");
		int noOfPeople = sc.nextInt();

		for (MovieDetails m : movielist) {
			if (mname.equals(m.movieName)) {
				double boxOfficeCollection = m.ticketPrice * noOfPeople * 7;
				System.out.println("last week box office collection for " + m.movieName + " movie is: "
						+ boxOfficeCollection + "Rs.");
			}

		}

	}

}
