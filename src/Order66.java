public class Order66 implements Order{
    private ManuelDuBonSith manuel;

    public Order66(ManuelDuBonSith manuel) {this.manuel = manuel;}

    public void execute() {
        manuel.killAllTheJedi();
    }
}