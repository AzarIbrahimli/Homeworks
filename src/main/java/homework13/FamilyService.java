package homework13;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    public FamilyDao familydao;
    public FamilyService(FamilyDao family){
        this.familydao = family;
    }

    public List<Family> getAllfamilies(){
        return familydao.getAllFamilies();
    }

    public void displayAllFamilies(){
        getAllfamilies().stream().map(x -> x).forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan (int c){
        return getAllfamilies().stream().filter(x->x.countFamily()>c).collect(Collectors.toList());
    }


    public List<Family> getFamiliesLessThan (int c) {
        return getAllfamilies().stream().filter(x->x.countFamily()<c).collect(Collectors.toList());
    }
    public int getFamiliesWithMemberNumber (int c){
        int[] count ={0};
        getAllfamilies().forEach(x ->{
            if(x.countFamily() == c){
                count[0]++;
            }
        });
        return count[0];
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

    public void dataSave(){
        familydao.save();
    }
    public void dataLoad(){
//        familydao.load();
    }

    }
