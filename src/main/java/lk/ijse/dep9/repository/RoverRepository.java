package lk.ijse.dep9.repository;

import lk.ijse.dep9.util.Rover;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoverRepository {
    private Connection connection;

    public RoverRepository(Connection connection) {
        this.connection = connection;
    }
    public void saveRover(Rover rover){
        try {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO roverDirection ( x, y) VALUES(?,?)");
            stm.setString(1,String.valueOf(rover.getX()));
            stm.setString(1,String.valueOf(rover.getY()));
            int i = stm.executeUpdate();
            ResultSet generatedKeys = stm.getGeneratedKeys();
            generatedKeys.next();
            PreparedStatement stm2 = connection.prepareStatement("INSERT INTO roverInstruction (roverNum, instruction) VALUES (?,?)");
            stm2.setInt(1,generatedKeys.getInt(1));
            stm2.setString(2,rover.getInstructions());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteRover(String id){
        try {
            PreparedStatement stm = connection.prepareStatement("DELETE FROM roverInstruction WHERE roverNum=?");
            stm.setString(1,id);
            stm.executeUpdate();
            PreparedStatement stm2 = connection.prepareStatement("DELETE FROM roverDirection WHERE roverNumber=?");
            stm2.setString(1,id);
            stm2.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
