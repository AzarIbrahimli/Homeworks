package homework11.pattern.controller;

import homework11.model.Family;
import homework11.model.Human;
import homework11.model.Pet;
import homework11.pattern.service.FamilyService;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController {
    FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count){
        return familyService.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count){
        return familyService.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(int count){
        return familyService.countFamiliesWithMemberNumber(count);
    }

    public String createNewFamily(Human woman, Human man){
        return familyService.createNewFamily(woman,man);
    }

    public String deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family,String masculine, String feminine) throws ParseException {
        return familyService.bornChild(family,masculine,feminine);
    }

    public Family adoptChild(Family family, Human adoptChild){
        return familyService.adoptChild(family,adoptChild);
    }

    public String deleteAllChildrenOlderThan(int age){
        return familyService.deleteAllChildrenOlderThan(age);
    }


    public int count(){
        return familyService.count();
    }

    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }

    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }

    public String addPet(int index, Pet pet){
        return familyService.addPet(index,pet);
    }
}
