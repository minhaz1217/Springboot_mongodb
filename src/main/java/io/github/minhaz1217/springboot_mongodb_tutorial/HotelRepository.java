package io.github.minhaz1217.springboot_mongodb_tutorial;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {



}
