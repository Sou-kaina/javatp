package metier;
import dao.EtuDao;

import java.util.List;

public class EtuMet implements IEtuMet {

    public static double calculer_Moyenne(Long id) throws Exception {
        var     Etu = EtuDao.trouverParID(id);

        if (Etu == null)
        {
            throw new Exception("L'id du credit est incorrecte :: [Credit non trouve]");
        }
        else {
        List<Double> notes = Etu.getScores();
        double somme = 0;
        for (Double note : notes) {
            somme += note;
        }
        return somme / notes.size();
        }
    }

    public void setEtuDao(EtuDao dao) {
    }
}
