package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.*;
import watchProject.objects.*;

@RestController
public class Controller {

    //déclaration des DAO (accès aux Tables de la BDD)
    private final UsersDAO usersDAO;
    private final RunsDAO runsDAO;
    private final OxygenLevelsDAO oxygenLevelsDAO;
    private final SpeedsDAO speedsDAO;
    private final CaloriesDAO caloriesDAO;
    private final DistancesDAO distancesDAO;
    private final HeartRatesDAO heartRatesDAO;
    private final TemperaturesDAO temperaturesDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO, RunsDAO runsDAO, OxygenLevelsDAO oxygenLevelsDAO, SpeedsDAO speedsDAO, CaloriesDAO caloriesDAO, DistancesDAO distancesDAO, HeartRatesDAO heartRatesDAO, TemperaturesDAO temperaturesDAO) {
        this.usersDAO = usersDAO;
        this.runsDAO = runsDAO;
        this.oxygenLevelsDAO = oxygenLevelsDAO;
        this.speedsDAO = speedsDAO;
        this.caloriesDAO = caloriesDAO;
        this.distancesDAO = distancesDAO;
        this.heartRatesDAO = heartRatesDAO;
        this.temperaturesDAO = temperaturesDAO;
    }

    @RequestMapping("/")
    public String index(){
        return "Coucou la fafa";
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

    @GetMapping(value="/oxygenLevels")
    public Iterable<OxygenLevel> getAllOxygenLevels(){ return oxygenLevelsDAO.findAll();}

    @GetMapping(value="/oxygenLevels/ {id}")
    public OxygenLevel getOxygenLevels(@PathVariable long id){ return oxygenLevelsDAO.findById(id).get();}

    @GetMapping(value="/speeds")
    public Iterable<Speed> getAllSpeeds(){ return speedsDAO.findAll();}

    @GetMapping(value="/speeds/ {id}")
    public Speed getSpeeds(@PathVariable long id){ return speedsDAO.findById(id).get();}

    @GetMapping(value="/calories")
    public Iterable<Calorie> getAllCalories(){ return caloriesDAO.findAll();}

    @GetMapping(value="/calories/ {id}")
    public Calorie getCalories(@PathVariable long id){ return caloriesDAO.findById(id).get();}

    @GetMapping(value="/distances")
    public Iterable<Distance> getAllDistances(){ return distancesDAO.findAll();}

    @GetMapping(value="/distances/ {id}")
    public Distance getDistances(@PathVariable long id){ return distancesDAO.findById(id).get();}

    @GetMapping(value="/heartRates")
    public Iterable<HeartRate> getAllHeartRates(){ return heartRatesDAO.findAll();}

    @GetMapping(value="/heartRates/ {id}")
    public HeartRate getHeartRates(@PathVariable long id){ return heartRatesDAO.findById(id).get();}

    @GetMapping(value="/temperatures")
    public Iterable<Temperature> getAllTemperatures(){ return temperaturesDAO.findAll();}

    @GetMapping(value="/temperatures/ {id}")
    public Temperature getTemperatures(@PathVariable long id){ return temperaturesDAO.findById(id).get();}
}
