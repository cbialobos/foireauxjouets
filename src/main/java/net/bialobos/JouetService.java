package net.bialobos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/jouets")
public class JouetService {

    @Autowired
    private JouetRepository jouetRepository;

    @GetMapping()
    public List<Jouet> listAllJouets() {
        List<Jouet> jouets = new ArrayList<Jouet>();
        jouetRepository.findAll().forEach(j -> jouets.add(j));
        return jouets;
    }
}
