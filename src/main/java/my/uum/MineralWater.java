package my.uum;

public class MineralWater {

    double packPrice1 = 1.00;
    int packQuantity1 = 1;
    double packPrice10 = 8.00;
    int packQuantity10 = 10;
    double packPrice24 = 12.00;
    int packQuantity24 = 24;

    public void calculateAmount(double amount) {
        double totalPrice = 0.0;
        double Price24 = 0.0;
        double Price10 = 0.0;
        double Price1 = 0.0;
        int packs24 = (int) (amount / packPrice24);
        int remainingamount24 = (int) (amount % packPrice24);
        int packs10 = (int) (remainingamount24 / packPrice10);
        int remainingBottles10 = (int) (remainingamount24 % packPrice10);

        Price24 += packs24 * packPrice24;
        Price10 += packs10 * packPrice10;
        Price1 += remainingBottles10 * packPrice1;
        totalPrice = Price24+ Price10+ Price1;
        double balance = amount - totalPrice;
        int totalbottle = (int) (packs24*24 + packs10*10 + remainingBottles10*1);

        System.out.println( "--------------------------------------");
        System.out.println( packs24 + " set24 ("+packs24*24+"  bottles) -> RM"+Price24);
        System.out.println( packs10 + " set10 ("+packs10*10+" bottles) -> RM"+Price10);
        System.out.println( remainingBottles10 + " bottle（s) -> RM"+Price1);
        System.out.println( "Total: RM"+totalPrice);
        System.out.println( "Balance: RM"+balance);
        System.out.println( "Total: bottle(s)"+totalbottle);
        System.out.println( "--------------------------------------");
    }

    public void calculateBottle(int bottle) {
        double totalPrice = 0.0;
        double Price24 = 0.0;
        double Price10 = 0.0;
        double Price1 = 0.0;
        int packs24 = bottle / packQuantity24;
        int remainingBottles24 = bottle % packQuantity24;
        int packs10 = remainingBottles24 / packQuantity10;
        int remainingBottles10 = remainingBottles24 % packQuantity10;

        Price24 += packs24 * packPrice24;
        Price10 += packs10 * packPrice10;
        Price1 += remainingBottles10 * packPrice1;
        totalPrice = Price24+ Price10+ Price1;

        System.out.println( "--------------------------------------");
        System.out.println( packs24 + " set24 ("+packs24*24+"  bottles) -> RM"+Price24);
        System.out.println( packs10 + " set10 ("+packs10*10+" bottles) -> RM"+Price10);
        System.out.println( remainingBottles10 + " bottle（s) -> RM"+Price1);
        System.out.println( "Total: RM"+totalPrice);
        System.out.println( "--------------------------------------");
    }
}
