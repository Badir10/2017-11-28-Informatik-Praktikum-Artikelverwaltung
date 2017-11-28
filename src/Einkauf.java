public class Einkauf {
    private Artikelliste einkaufsliste;

    public Einkauf(){
        einkaufsliste = new Artikelliste();
    }

    public Artikelliste getEinkaufsliste() {
        return einkaufsliste;
    }

    public double getGesamtpreis(){
        double summe = 0;
        for (int i = 0; i < einkaufsliste.count(); i++){
            summe += einkaufsliste.holen(i).getPreis();
        }
        return summe;
    }
}