public class BonusMilesService {
    public int calculate(int price) {
        int mile = 20;
        int bonusMiles = price / mile;

        return bonusMiles;
    }
}
