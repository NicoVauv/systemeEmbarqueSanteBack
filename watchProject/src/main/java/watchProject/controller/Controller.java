package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.*;
import watchProject.objects.*;

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
    public Iterable<Capteurs> getAllHeartRates(){ return capteursDAO.findAll();}

    @GetMapping(value="/capteurs/{id}")
    public Capteurs getHeartRates(@PathVariable long id){ return capteursDAO.findById(id).get();}
}
