package homework9;

import java.util.List;

public class FamilyService {
    public FamilyDao familydao;
    public FamilyService(FamilyDao family){
        this.familydao = family;
    }

    public List<Family> getAllfamilies(){
        return familydao.getAllFamilies();
    }

    public Family createNewFamily(Human mother, Human father){
        Family family1 = new Family(mother,father);
        familydao.saveFamily(family1);
        return family1;
    }

    public void deleteFamilyByIndex(int index){
        if(familydao.deleteFamily(index)){
            System.out.println("It's deleted");
        }else{
            System.out.println("Not exist");
        }
    }
}
