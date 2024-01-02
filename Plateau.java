public class Plateau {
    private int numLi;
    private int numCols;
    private Case[][] plato;

    public Plateau(int numLi, int numCols) {
        this.numLi = numLi;
        this.numCols = numCols;
        this.plato = new Case[numLi][numCols];
        creePLato();
    }

    private void creePLato() {
        WallBrick w =new WallBrick();
        for (int li = 0; li < numLi; li++) {
            for (int col = 0; col < numCols; col++) {
                if(col==0){
                    plato[li][col] = new Case(li, col,w);
                }else{
                plato[li][col] = new Case(li, col);}
            }
        }
    }

    public int getNumLi() {
        return numLi;
    }
    public int getNumCols() {
        return numCols;
    }
    public Case[][] getPlato(){
        return this.plato;
    }                   

    public Case getCase(int li, int col) {
        return plato[li][col];
    }

    public void setCase(Case newCase, int li, int col) {
        plato[li][col] = newCase;
    }

    public void placeMario(Mario m, int li, int col) {
        if(this.getCase(li, col).contientMario()){
            System.out.println("Il y a déjà une tour placé dans la case ["+li+","+col+"]");
        }
        if(this.getCase(li, col).contientZombie()){
            System.out.println("Impossible !Un Zombie se trouve dans la case ["+li+","+col+"]");
        }
    
        if(!this.getCase(li, col).contientMario()&&!this.getCase(li, col).contientZombie()){
            m.getInfoActuelle().setPosX(li);
            m.getInfoActuelle().setPosY(col);
            plato[li][col].setMario(m);
        }
    }    
        
    public void placeZombie(Zombie z, int li, int col) {
        if(!this.getCase(li, col).contientMario()&&!this.getCase(li, col).contientZombie()){
            z.getInfoActuelle().setPosX(li);
            z.getInfoActuelle().setPosY(col); 
            plato[li][col].setZombie(z);
        }
    }
    public void removeMario(int li, int col) {
        plato[li][col].setMario(null);
    }
    public void removeZombie(int li, int col) {
        plato[li][col].setZombie(null);
    }

    public void spawnZombie(Zombie z) {
        int li = (int) (Math.random() * numLi);
        int col = numCols - 1;
        while (plato[li][col].contientZombie()) {
            li = (int) (Math.random() * numLi);
            col = numCols - 1;
        }
        placeZombie(z, li, col);
    }

    public void affiche(){
            System.out.print("  ");
            for (int col = 0; col < numCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();   
            for (int row = 0; row < numLi; row++) {
                System.out.print(row + " ");
    
                for (int col = 0; col < numCols; col++) {
                    Case currentCase = plato[row][col];
                    if (currentCase.contientMario()) {
                        System.out.print("X ");
                    } else if (currentCase.contientZombie()) {
                        System.out.print("Z ");
                    } else {
                        System.out.print(". "); 
                    }
                }
                System.out.println(); 
            }
        }
    public static void main(String[] args) {
        Plateau p = new Plateau(5, 5);
        StarMario s = new StarMario();
        Zombie1 z = new Zombie1( 0);
        p.placeMario(s, 0, 0);
        p.placeZombie(z, 0, 1);
        p.affiche();
        System.out.println(s.peutAttaquer(p));
    }
}
