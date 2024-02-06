public class Order64 implements Order{

    private ManuelDuBonSith manuel;

    public Order64(ManuelDuBonSith manuel) {this.manuel = manuel;}

    public void execute() {
        manuel.killOldApprentice();
        manuel.chooseNewApprentice();
    }
}
