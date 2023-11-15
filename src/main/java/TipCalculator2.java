import java.util.ArrayList;
import java.util.List;

/**
 * リファクタリング実施後
 */
public class TipCalculator2 {

    private List<String> names = new ArrayList<>();
    // private int tipPercentage = 0;　削除

    /**
     * ArrayListのaddメソッドのラッパーにすぎないので削除しても良い。
     *
     * @param names
     * @param name
     * @return
     */
    public List<String> addPerson(List<String> names, String name) {

        List<String> updated = new ArrayList<>(names);
        updated.add(name);

        return updated;
    }


    public List<String> getNames(TipCalculator2 cal) {
        List<String> copy = new ArrayList<>(cal.names);
        return copy;
    }

    public static int getTipPercentage(List<String> names) {

        if (names.size() > 5) return 20;

        if (names.size() > 0) return 10;

        return 0;
    }
}
