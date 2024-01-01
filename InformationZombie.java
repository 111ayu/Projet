public class InformationZombie {
    private int attaque;
    private int defense;
    private int vitesse;
    private int vie;
    private int posX;
    private int posY;

    public InformationZombie(int attaque, int defense, int posX, int posY, int vie,int vitesse){
        this.attaque = attaque;
        this.defense = defense;
        this.posX = posX;
        this.posY = posY;
        this.vie = vie;
        this.vitesse = vitesse;
    }

    public int getAttaque(){
        return this.attaque;
    }
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
    public int getvitesse(){
        return this.vitesse;
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
