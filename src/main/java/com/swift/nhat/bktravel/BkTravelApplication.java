package com.swift.nhat.bktravel;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swift.nhat.bktravel.model.Place;
import com.swift.nhat.bktravel.model.Plan;
import com.swift.nhat.bktravel.model.PlanPlace;
import com.swift.nhat.bktravel.model.User;
import com.swift.nhat.bktravel.repository.PlaceRepository;
import com.swift.nhat.bktravel.repository.PlanRepository;
import com.swift.nhat.bktravel.repository.UserRepository;

@SpringBootApplication
public class BkTravelApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(BkTravelApplication.class);
	
	@Autowired
    private PlaceRepository placeRepository;
	
	@Autowired
    private PlanRepository planRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BkTravelApplication.class, args);
	}
	
	@Override
    @Transactional
    public void run(String... strings) throws Exception {
        // save a couple of books
//        List<Place> places = new ArrayList<>();
//        places.add(new Place("Ha Noi D", "hehehe", 23.44444, -12.3334, new Plan("Plan E")));
////        places.add(new Place("Ha Noi A", "hehehe", 23.44444, -12.3334, new Plan("Plan B")));
////        places.add(new Place("Ha Noi B", "hehehe", 23.44444, -12.3334, new Plan("Plan C")));
////        places.add(new Place("Ha Noi C", "hehehe", 23.44444, -12.3334, new Plan("Plan D")));
//        placeRepository.save(places);

//		Place place = placeRepository.findById(7);
		Place place1 = new Place("Ha Noi Ddddd", "hehehe", 23.44444, -12.3334);
//		Plan plan = new Plan("Thac Ba Na");
//		User user = userRepository.findById(2);
//		plan.setUser(user);
//		plan.setDetail(true);
//		PlanPlace planPlace = new PlanPlace();
//		planPlace.setPlan(plan);
//		planPlace.setPlace(place1);
//		planPlace.setOrder(1);
//		placeRepository.save(place1);
//		planRepository.save(plan);
//		place.setPlan(plan);
		
////		User user = userRepository.findById(2);
//		
//		Plan plan = planRepository.findById(35);
//		
//		logger.debug(plan.getName());
//		
//////		plan.setUser(user);
//		PlanPlace planPlace = new PlanPlace();
//		planPlace.setPlan(plan);
//		planPlace.setPlace(place1);
//		planPlace.setOrder(1);
//		plan.getPlanPlaces().add(planPlace);
//		placeRepository.save(place1);
//		planRepository.save(plan);
		
//		User user = new User("master1", "Nhat Cao", "1234", new Date(), 0, "" );
//		Plan plan = new Plan("Du Lich Ho Chi Minh 1");
//		plan.setDetail(false);
//		plan.setUser(user);
//		user.getPlans().add(plan);
//		userRepository.save(user);
//
//		for(int i = 1; i <= 6; i++){
//			planRepository.delete(i);
//		}
		
//		planRepository.delete(10);
		
//        // fetch all books
//        for (Place place : placeRepository.findAll()) {
//            logger.info(place.toString());
//        }
    }
}
