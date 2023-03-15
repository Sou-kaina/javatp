package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class Etu {
        private Long id;
        private String name;

    private  List<Double> scores;
    public Etu(String name, List<Double> scores) { this.name = name; this.scores = scores; }
    public String getName() { return name; }
    public static List<Double> getScores() { return scores; }



    @Override
    public String toString(){
        var creditStr = "==================================================================== \n";
        creditStr+= "=> ID                  : " +getId()+ "                        \n";
        creditStr+= "=> Etudiant                  : " +getName()+ "                        \n";
        creditStr+= "-------------------------------------------------------------------- \n";
        creditStr+= "=> Note Final                : "
                + getScores()+"\n";
        creditStr+= "==================================================================== \n";

        return creditStr;
    }


}
