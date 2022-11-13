package homework11.pattern.service;
import homework11.gender.Man;
import homework11.model.Family;
import homework11.model.Human;
import homework11.model.Pet;
import homework11.pattern.dao.FamilyDao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        getAllFamilies().forEach(x->{
            int i=0;
            System.out.printf("%s\n",x);
        });
    }

    public List<Family> getFamiliesBiggerThan(int count){
        return getAllFamilies().stream().filter(f -> f.countFamily() > count).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int count){
        return getAllFamilies().stream().filter(f->f.countFamily()<count).collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int count){
        return getAllFamilies().stream().filter(f->f.countFamily()==count).collect(Collectors.toList()).size();
    }

    public String createNewFamily(Human woman, Human man){
        Family family = new Family(woman,man);
        familyDao.saveFamily(family);
        return "New family created";
    }

    public String deleteFamilyByIndex(int index){
        for(int i = 0;i< getAllFamilies().size();i++){
            if(index == i){
                familyDao.deleteFamily(index);
            }
        }
        return "Family deleted";
    }

    public Family bornChild(Family family,String masculine, String feminine) throws ParseException {
        Random rand = new Random();
        int gender = rand.nextInt(0,2);
        if(gender == 0){
            Human child = new Man(masculine,family.getFather().getSurname(),"27/07/2022");
            family.addChild(child);
        }
        if(gender == 1){
            Human child = new Man(feminine,family.getFather().getSurname(),"27/07/2022");
            family.addChild(child);
        }
        return family;
    }

    public Family adoptChild(Family family, Human adoptChild){
        family.addChild(adoptChild);
        return family;
    }

    public String deleteAllChildrenOlderThan(int age){
        for (int i = 0; i < getAllFamilies().size(); i++){
            for(int j = 0; j < getAllFamilies().get(i).getChildren().size(); j++){
                if(age< getAllFamilies().get(i).getChildren().get(j).getAge()){
                    getAllFamilies().get(i).getChildren().remove(j);
                    j=j-1;
                }
            }
        }return "Deleted";
    }


    public int count(){
        return getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return getAllFamilies().get(index);
    }

    public Set<Pet> getPets(int index){
        return getAllFamilies().get(index).getPet();
    }

    public String addPet(int index, Pet pet){
        getAllFamilies().get(index).getPet().add(pet);
        return "New pet added";
    }
}












