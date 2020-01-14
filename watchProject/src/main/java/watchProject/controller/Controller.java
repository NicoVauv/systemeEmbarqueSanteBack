package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.*;
import watchProject.objects.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class Controller {

    //déclaration des DAO (accès aux Tables de la BDD)
    private final UsersDAO usersDAO;
    private final RunsDAO runsDAO;
    private final CapteursDAO capteursDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO, RunsDAO runsDAO, CapteursDAO capteursDAO) {
        this.usersDAO = usersDAO;
        this.runsDAO = runsDAO;
        this.capteursDAO = capteursDAO;
    }

    @GetMapping(value="/users")
    public Iterable<User> getAllUsers(){ return usersDAO.findAll();}

    @GetMapping(value="/users/{id}")
    public User getUsers(@PathVariable long id){
        return usersDAO.findById(id).get();
    }

    @GetMapping(value="/runs")
    public Iterable<Run> getAllRuns(){ return runsDAO.findAll();}

    @GetMapping(value="/runs/{id}")
    public Run getRuns(@PathVariable long id){ return runsDAO.findById(id).get(); }

    @GetMapping(value="/capteurs")
    public Iterable<Capteurs> getAllCapteurs(){ return capteursDAO.findAll();}

    @GetMapping(value="/capteurs/runs/{run_id}")
    public Iterable<Capteurs> getAllCapteurs(@PathVariable long run_id){
        List<Capteurs> capteursList = new ArrayList<>();
        Iterator<Capteurs> capteursIterator = capteursDAO.findAll().iterator();
        Capteurs capteurTampon;
        while(capteursIterator.hasNext()){
            capteurTampon = capteursIterator.next();
            if(capteurTampon.getRun_id() == run_id){
                capteursList.add(capteurTampon);
            }
        }
        return capteursList;
    }

    @GetMapping(value="/capteurs/{id}")
    public Capteurs getCapteurs(@PathVariable long id){ return capteursDAO.findById(id).get();}
}
