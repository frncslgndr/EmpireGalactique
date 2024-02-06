public class ManuelDuBonSith {
    int jedi = 9500;

    public void killOldApprentice(){
        return;
    }

    public void chooseNewApprentice() {
        return;
    }

    public void killAllTheJedi() {
        do {
            System.out.println("Il reste "+jedi+" jedi dans la galaxy");
            jedi--;
        }
        while ( jedi > 0);
    }

    public void ChangeRepublicNameToEmpire() {
        if (jedi < 20) {
            System.out.println("Pour garantir la sécurité dans la continuité et la stabilité, la République sera bientôt réorganisée et deviendra la Première Puissance Galactique Impériale ! Pour une société fondée sur l’ordre et la sécurité ! ");
        }
        else return;
    }

}
