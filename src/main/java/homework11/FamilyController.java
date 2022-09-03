package homework11;


import java.util.List;

public class FamilyController {
    private FamilyService service;
    public FamilyController(FamilyService service){
        this.service = service;
    }
    public List<Family> getAllfamilies(){
        return service.getAllfamilies();
    }
    public void displayAllFamilies(){
        service.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan (int c){
        return service.getFamiliesBiggerThan(c);
    }


    public List<Family> getFamiliesLessThan (int c) {
        return service.getFamiliesLessThan(c);
    }
    public int getFamiliesWithMemberNumber (int c){
        return service.getFamiliesWithMemberNumber(c);
    }

    public Family createNewFamily(Human mother, Human father){
        return service.createNewFamily(mother,father);
    }

    public void deleteFamilyByIndex(int index){
        service.deleteFamilyByIndex(index);
    }
    public Family adoptChild(Human child, Family family){
        return service.adoptChild(child, family);
    }
    public int deleteAllChildrenOlderThan (int c){
        return service.deleteAllChildrenOlderThan(c);
    }
    public int count(){
        return service.count();
    }
    public Family getFamiliesById(int id){
        return service.getFamiliesById(id);
    }

}
