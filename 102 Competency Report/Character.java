public class Character{
    
    
    private int lifePoints;
    private int Energy;
    private int attackPoints;
    private int bonusPoints;
    public String Name;

    public void setlifePoints(int lifePoints){
        this.lifePoints=lifePoints;

    }

    public int getlifePoints(){
        return lifePoints;


    }

    public void setEnergy(int Energy){
        this.Energy=Energy;

    }

    public int getEnergy(){
        return Energy;

    }
    public void setattackPoints(int attackPoints){
        this.attackPoints=attackPoints;

    }
    public int getattackPoints(){
        return attackPoints;

    }

    public void setbonusPoints(int bonusPoints){
        this.bonusPoints=bonusPoints;

    }
    public int getbonusPoints(){
        return bonusPoints;
    }

    public void setName(String Name){
        this.Name=Name;

    }

    public String getName(){
        return Name;
    }

    public void printCharacter(){
        System.out.println(Name + " \n Life Points: " + lifePoints + "\n Energy: " + Energy + " \n Attack Points: " + attackPoints);
    }


    public Character(String Name, int lifePoints, int Energy, int attackPoints, int bonusPoints){
        this.Name=Name;
        this.lifePoints=lifePoints;
        this.Energy=Energy;
        this.attackPoints=attackPoints;
        this.bonusPoints=bonusPoints;
    }

    public void attack(Character opponent){
        int opponentLP=opponent.getlifePoints();
        int attackP=getattackPoints();
        
        System.out.println(Name + " is attacking ... " + opponent.getName());

        int newEnergy=opponent.getEnergy()-getattackPoints();
        opponent.setEnergy(newEnergy);
        opponent.printCharacter();
        if(opponent.getEnergy()<=0){
            //System.out.println(Name + " kills ... " + opponent.getName());

            int newLP=opponent.getlifePoints()-1;
            opponent.setlifePoints(newLP);
            opponent.setEnergy(100);
            opponent.printCharacter();
        }

        if(opponent.getlifePoints()==-1){
           if(opponent.getEnergy()==0);{
            System.out.println(Name + " wins. GAME OVER!!!");
            }
            

        }

        //if(opponent.getEnergy()==0);{
         //   System.out.println(Name + " wins. GAME OVER!!!");

           
     }   //}

}      