package watchProject.objects;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="capteurs")
public class Capteurs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private String time;
    @Column(name="run_id")
    private long run_id;
    @Column(name="calorie")
    private String calorie;
    @Column(name = "heart_rate")
    private String heart_rate;
    @Column(name = "distance")
    private String distance;
    @Column(name = "body_temperature")
    private String body_temperature;
    @Column(name = "outside_temperature")
    private String outside_temperature;
    @Column(name = "oxygen_level")
    private String oxygen_level;
    @Column(name = "speed")
    private String speed;

    public Capteurs(String time, long run_id, String calorie, String heart_rate, String distance, String body_temperature, String outside_temperature, String oxygen_level, String speed) {
        this.time = time;
        this.run_id = run_id;
        this.calorie = calorie;
        this.heart_rate = heart_rate;
        this.distance = distance;
        this.body_temperature = body_temperature;
        this.outside_temperature = outside_temperature;
        this.oxygen_level = oxygen_level;
        this.speed = speed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getRun_id() {
        return run_id;
    }

    public void setRun_id(long run_id) {
        this.run_id = run_id;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(String heart_rate) {
        this.heart_rate = heart_rate;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getBody_temperature() {
        return body_temperature;
    }

    public void setBody_temperature(String body_temperature) {
        this.body_temperature = body_temperature;
    }

    public String getOutside_temperature() {
        return outside_temperature;
    }

    public void setOutside_temperature(String outside_temperature) {
        this.outside_temperature = outside_temperature;
    }

    public String getOxygen_level() {
        return oxygen_level;
    }

    public void setOxygen_level(String oxygen_level) {
        this.oxygen_level = oxygen_level;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Capteurs{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", run_id=" + run_id +
                ", heart_rate='" + heart_rate + '\'' +
                ", distance='" + distance + '\'' +
                ", body_temperature='" + body_temperature + '\'' +
                ", outside_temperature='" + outside_temperature + '\'' +
                ", oxygen_level='" + oxygen_level + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capteurs capteurs = (Capteurs) o;
        return id == capteurs.id &&
                run_id == capteurs.run_id &&
                Objects.equals(time, capteurs.time) &&
                Objects.equals(heart_rate, capteurs.heart_rate) &&
                Objects.equals(distance, capteurs.distance) &&
                Objects.equals(body_temperature, capteurs.body_temperature) &&
                Objects.equals(outside_temperature, capteurs.outside_temperature) &&
                Objects.equals(oxygen_level, capteurs.oxygen_level) &&
                Objects.equals(speed, capteurs.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, run_id, heart_rate, distance, body_temperature, outside_temperature, oxygen_level, speed);
    }
}