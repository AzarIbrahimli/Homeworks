package homework13;
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
        family.remove(family.get(index));
        return true;
    }

    @Override
    public boolean deleteFamily(Family f) {
        family.remove(f);
        return true;
    }

    @Override
    public void saveFamily(Family f) {
        family.add(f);
    }

    @Override
    public void save() {
        saveFamily(family);
    }

    @Override
    public void load() {

    }

}
