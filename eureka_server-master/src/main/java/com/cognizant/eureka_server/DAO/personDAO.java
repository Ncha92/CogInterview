package com.cognizant.eureka_server.DAO;

import com.cognizant.eureka_server.Model.PersonMod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface personDAO extends CrudRepository<PersonMod, Integer> {
//    void save_person( PersonMod p);
//    public String read_person();
}
