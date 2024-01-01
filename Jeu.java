import java.util.List;

public class Jeu {
    private Plateau plato;
    private String niveauDeDifficulté;
    private List<Zombie> ennemis;
    private List<Mario> listePlante;

    public Jeu(Plateau plato, String niveauDeDifficulté, List<Zombie> ennemis, List<Mario> listePlante) {
        this.plato = plato;
        this.niveauDeDifficulté = niveauDeDifficulté;
        this.ennemis = ennemis;
        this.listePlante = listePlante;
    }

    public Plateau getPlato() {
        return plato;
    }
    public String getNiveauDeDifficulté() {
        return niveauDeDifficulté;
    }
    public List<Zombie> getEnnemis() {
        return ennemis;
    }
    public List<Mario> getListePlante() {
        return listePlante;
    }

    public static void main(String[] args) {
        
    }
}
