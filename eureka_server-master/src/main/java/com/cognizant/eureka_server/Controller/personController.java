package com.cognizant.eureka_server.Controller;

import com.cognizant.eureka_server.Model.PersonMod;
import com.cognizant.eureka_server.PersonService.personService;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class personController {


    private personService ps;

    @PostMapping("/Create")
    public void save_person(PersonMod p) {
        ps.save_person(p);
    }

    @GetMapping("/Read")
    public String read_person() {
        return ps.read_person();
    }

    @PutMapping("/Update")
    public String update_person(PersonMod p) {
        ps.save_person(p);
        return ("");
    }

    }


