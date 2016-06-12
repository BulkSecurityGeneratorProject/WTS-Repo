package com.focuslabs.wts.repository;

import com.focuslabs.wts.entity.Availability;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by baba on 6/12/2016.
 */
@Repository
public interface AvailabilityRepository extends MongoRepository<Availability,String> {
}
