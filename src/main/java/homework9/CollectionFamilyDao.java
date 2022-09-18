package homework9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> family = new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        return family;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return family.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (family.size() > index)  // element is already have
        {
            family.remove(family.get(index));
            return true;
        }
        else return false;
    }

    @Override
    public boolean deleteFamily(Family fam) {
        if (fam.equals(family)) {
            family.remove(fam);
            return true;
        }
        else return false;
    }

    @Override
    public void saveFamily(Family fam) {
        if(fam.equals(family)){  // already exist
            family.set(family.indexOf(fam),fam);
        }
        else  family.add(fam);
    }

}
