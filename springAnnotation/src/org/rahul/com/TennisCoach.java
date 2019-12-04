package org.rahul.com;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Daily Practice for 4 hrs";
	}

}
