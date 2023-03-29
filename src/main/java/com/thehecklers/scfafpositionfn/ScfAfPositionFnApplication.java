package com.thehecklers.scfafpositionfn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ScfAfPositionFnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfAfPositionFnApplication.class, args);
	}

	@Bean
	Function<Position, Position> pos() {
		return pos -> {
			System.out.println(" ⌖ " + pos.toString());
			return new Position(pos.getAdshex(), pos.getSquawk(), pos.getFlightno(), pos.getAltitude(), pos.getHeading(), pos.getSpeed());
		};
	}
}
