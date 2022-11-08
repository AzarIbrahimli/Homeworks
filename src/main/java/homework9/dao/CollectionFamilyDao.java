package homework9.dao;


import homework9.dao.FamilyDao;
import homework9.model.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    List<homework9.model.Family> listFamily = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return listFamily;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if(index<listFamily.size()){
            return listFamily.get(index);
        }
        else throw new IllegalArgumentException("Non-exist");
    }

    @Override
    public boolean deleteFamily(int index) {
        if(index<listFamily.size()){
            listFamily.remove(index);
            return true;
        }
        else return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        boolean result = false;
        for(int i = 0;i<listFamily.size(); i++){
            if(family.equals(listFamily.get(i))){
                listFamily.remove(family);
                result = true;
            }
        }
        return result;
//        boolean result = false;
//        for(Family one: listFamily){
//            if(one.equals(family)){
//                listFamily.remove(family);
//                result = true;
//            }
//        } return result;
    }

    @Override
    public List<Family> saveFamily(Family family) {
        listFamily.add(family);
        return listFamily;
    }
}
