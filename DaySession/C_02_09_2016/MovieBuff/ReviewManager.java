package com.creators.movie;

public class ReviewManager {
	private int totalReviews;
	private int totalReviewers;
	public ReviewManager(int totalReviews, int totalReviewers) {
		super();
		this.totalReviews = totalReviews;
		this.totalReviewers = totalReviewers;
	}
	public int getTotalReviews() {
		return totalReviews;
	}
	public void setTotalReviews(int totalReviews) {
		this.totalReviews = totalReviews;
	}
	public int getTotalReviewers() {
		return totalReviewers;
	}
	public void setTotalReviewers(int totalReviewers) {
		this.totalReviewers = totalReviewers;
	}
	@Override
	public String toString() {
		return "BuffReview [Avg.Review = " + (totalReviews/totalReviewers) + " & " + totalReviewers + " review(s)]";
	}
	
}
