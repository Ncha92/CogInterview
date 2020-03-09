package com.cognizant.eureka_server.PersonService;
import com.cognizant.eureka_server.Model.PersonMod;
import com.cognizant.eureka_server.DAO.personDAO;
import org.springframework.stereotype.Service;

@Service
public class personService {

    private personDAO pd;

    public void save_person(PersonMod p) {
        pd.save_person(p);
    }

    public String read_person() {
        return pd.read_person();
    }

    public String update_person(PersonMod p) {
        pd.save_person(p);
        return ("");
    }

}
