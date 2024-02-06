public class GalacticEmpireCommand {

    public static void main(String[] args) {
        //Moi
        Palpatine palpatine = new Palpatine();

        //Mes Stormtrooper
        Stormtrooper stormtrooper = new Stormtrooper();
        Deathtrooper deathtrooper = new Deathtrooper();

        //Le contenu du manuel
        ManuelDuBonSith manuel = new ManuelDuBonSith();

        //J'importe le contenu de mes ordres
        Order64 order64 = new Order64(manuel);
        Order66 order66 = new Order66(manuel);
        Order67 order67 = new Order67(manuel);

        ////Ma semaine
            //Lundi, je change de padawan
            palpatine.Execute(order64);

            //Mardi, je fais un coup d'état
            stormtrooper.Execute(order66);
            deathtrooper.Execute(order66);
                //Penser aussi à faxer l'ordre 66 au dela de la bordure exterieure
                //Penser aussi à rappeler l'ordre 66 à DkV

            //Mercredi, je rebrand l'organisation
            palpatine.Execute(order67);

    }


}
