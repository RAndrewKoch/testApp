package com.akandrewkoch.testApp.Models.Data;

import com.akandrewkoch.testApp.Models.Thing;
import org.springframework.data.repository.CrudRepository;

public interface ThingRepository extends CrudRepository<Thing, Integer> {

}
