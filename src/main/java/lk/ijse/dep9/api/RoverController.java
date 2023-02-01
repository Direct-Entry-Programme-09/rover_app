package lk.ijse.dep9.api;

import lk.ijse.dep9.service.RoverService;
import lk.ijse.dep9.util.Rover;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rover")
public class RoverController {

    private RoverService roverService;
    @PostMapping(consumes = "application/json")
    public void createNewRover(@RequestBody Rover rover){
        System.out.println(rover.getX());
        roverService.saveRover(rover);
    }
    @DeleteMapping
    public void deleteRover(@RequestParam String id){
        roverService.deleteRover(id);
    }

}
