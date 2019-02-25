package w3d1.teamWithPersonAndDogs2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private String name;
    private String sport;
    private List<Person> players;
    
    public Team(){
        
    }
    
    public Team(String name, String sport){
        this.name = name;
        this.sport = sport;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return sport;
    }

    public void setType(String type) {
        this.sport = type;
    }
    
    public void setPlayers(List<Person> listOfPlayers){
        
        this.players = listOfPlayers;
        
    }
    public List<Person> getPlayers(){
        return players;
    }
 
    public double getAverageAge(){
        double sum = 0.0;
        double avgAge = 0.0;
        for(int i = 0; i<players.size();i++){
            sum = sum + players.get(i).getAge();
        }
        avgAge = sum/players.size();
        return avgAge;
    }
}
