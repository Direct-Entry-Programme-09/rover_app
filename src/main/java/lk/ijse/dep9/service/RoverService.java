package lk.ijse.dep9.service;

import lk.ijse.dep9.repository.RoverRepository;
import lk.ijse.dep9.util.Rover;

public class RoverService {
    private RoverRepository roverRepository;
    public void saveRover(Rover rover){
        roverRepository.saveRover(rover);
    }
    public void deleteRover(String id){
        roverRepository.deleteRover(id);
    }
}
