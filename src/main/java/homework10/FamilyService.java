package homework10;



import java.util.ArrayList;
import java.util.List;

public class FamilyService {
    public FamilyDao familydao;
    public FamilyService(FamilyDao family){
        this.familydao = family;
    }

    public List<Family> getAllfamilies(){
        return familydao.getAllFamilies();
    }
    public void displayAllFamilies(){
        for(Family f: getAllfamilies()){
            System.out.println(f);
        }
    }

    public List<Family> getFamiliesBiggerThan (int c){
        List<Family> bigger = new ArrayList<>();
        for(Family a: getAllfamilies()){
            if(a.countFamily()>c){
                bigger.add(a);
            }
        }
        return bigger;
    }


    public List<Family> getFamiliesLessThan (int c) {
        List<Family> less = new ArrayList<>();
        for (Family a : getAllfamilies()) {
            if (a.countFamily() < c) {
                less.add(a);
            }
        }
        return less;
    }
    public int getFamiliesWithMemberNumber (int c){
        int count =0;
        for(Family a: getAllfamilies()){
            if(a.countFamily()==c){
                count+=1;
            }
        }
        return count;
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
    public Family adoptChild(Human child, Family family){
        family.addChild(child);
        child.setFamily(family);
        familydao.saveFamily(family);
        return family;
    }
    public int deleteAllChildrenOlderThan (int c){
        int count =0;
        for(Family a: getAllfamilies()){
            if(a.countFamily()==c){
                count+=1;
            }
        }
        return count;
    }
    public int count(){
        return getAllfamilies().size();
    }
    public Family getFamiliesById(int id){
        return familydao.getFamilyByIndex(id);
    }
    }
