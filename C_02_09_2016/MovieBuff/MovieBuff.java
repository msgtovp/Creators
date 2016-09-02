package com.creators.movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class MovieBuff {
	public MovieBuff() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, ReviewManager> review = new TreeMap<String, ReviewManager>();
		while(true) {
			System.out.print("\t1.Add Review\n\t2.End\n\tYour Wish ? ");
			int ch = Integer.parseInt(bf.readLine());
			switch(ch) {
			case 1:
				System.out.print("\t\t Movie Name : ");
				String name = bf.readLine();
				System.out.print("\t\t Rating : ");
				int rate = Integer.parseInt(bf.readLine());
				if(review.containsKey(name)) {
					ReviewManager rm = review.get(name);
					rm.setTotalReviewers(rm.getTotalReviewers() + 1);
					rm.setTotalReviews(rm.getTotalReviews() + rate);
				} else {
					review.put(name, new ReviewManager(rate, 1));
				}
				break;
			}
			if(ch == 2) {
				for(Map.Entry<String, ReviewManager> each:review.entrySet()) {
					System.out.println(each.getKey()+"\t"+each.getValue());
				}
				break;
			}
		}
	}
}
