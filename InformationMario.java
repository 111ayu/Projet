public class InformationMario {
    private int attaque;
    private int defense;
    private final int prix;
    private int vie;
    private int posX;
    private int posY;

    public InformationMario(int attaque, int defense, int posX, int posY, int vie,int prix){
        this.attaque = attaque;
        this.defense = defense;
        this.posX = posX;
        this.posY = posY;
        this.vie = vie;
      //  this.prix = prix;
    }

    public int getAttaque(){
        return this.attaque;
    }
    //test githubbb
    //test 2

    public int getDefense(){ 
        return this.defense;
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
    public int getvie(){
        return this.vie;
    }
    public int getPrix(){
        return this.prix;
    }
    public void setAttaque(int attaque){
        this.attaque = attaque;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    public void setvie(int vie){
        this.vie = vie;
    }


}
