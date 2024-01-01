public class Case {
    private int li;
    private int col;
    private Personnage p; 

    public Case(int li, int col) {
        this.li = li;
        this.col = col;
        this.p=null;
    }

    public boolean contientMario() {
            return p.getTour();
    }

    public boolean contientZombie() {
            return !p.getTour();
    }

    public Personnage getPersonnage() {
        return this.p;
    }
    public int getLi() {
        return li;
    }
    public int getCol() {
        return col;
    }
    public void setMario (Mario newM) {
        p=newM;
    }
    public void setZombie (Zombie newZ) {
        p=newZ;
    }

}
