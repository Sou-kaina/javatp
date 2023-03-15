package presentation;

import metier.EtuMet;

public class PreEtu {
   // @Autowired
    //@Qualifier("metier")
    //ICreditMetier creditMetier;

    public void afficher_Moyenne(Long id) throws Exception {
        var creditAvecMensualite = EtuMet.calculer_Moyenne(id) ;
        System.out.println(creditAvecMensualite);
    }

    public void setEtuMet(EtuMet metier) {
    }
}
