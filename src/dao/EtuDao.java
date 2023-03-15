package dao;

import model.Etu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EtuDao  implements IDao<Etu, Long>{


    //public class CreditDao implements IDao<Credit, Long> {

        public static Etu trouverParID(Long id) {
            System.out.println("Trouver l etdudiant n° : " + id);
            return BDCredits()
                    .stream()
                    .filter(Etu -> Etu.getId() == id)
                    .findFirst()
                    .get();
        }
        public static Set<Etu> BDCredits(){
            return new HashSet<Etu>(
                    Arrays.asList(
                            new Etu(1L,"Soukaina", Arrays.asList(15.0, 12.0, 14.0, 15.0)),
                            new Etu(2L,"Salman", Arrays.asList(10.0, 10.0, 18.0, 15.0)),
                            new Etu(3L,"Kawtar", Arrays.asList(15.0, 15.0, 12.0, 10.0)),
                            new Etu(4L,"Ismail", Arrays.asList(16.0, 12.0, 12.0, 12.0))
                    )
            );
        }
}
