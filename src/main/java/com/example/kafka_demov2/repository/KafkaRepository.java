package com.example.kafka_demov2.repository;

import com.example.kafka_demov2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface KafkaRepository extends MongoRepository<User, String> {

}
