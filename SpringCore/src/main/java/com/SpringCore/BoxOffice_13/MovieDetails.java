package com.SpringCore.BoxOffice_13;

public class MovieDetails {
	
	String movieName;
	String ShowTime;
	double ticketPrice;
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return ShowTime;
	}
	public void setShowTime(String showTime) {
		ShowTime = showTime;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", ShowTime=" + ShowTime + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
	

}
