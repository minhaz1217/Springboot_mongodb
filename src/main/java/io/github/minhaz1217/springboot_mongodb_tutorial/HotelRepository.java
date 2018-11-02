package io.github.minhaz1217.springboot_mongodb_tutorial;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {
    Hotel findHotelById(String id);
    List<Hotel> findByPricePerNightLessThan(int max);

    @Query(value = "{'address.city':?0}")
    List<Hotel> findByCity(String city);
}
