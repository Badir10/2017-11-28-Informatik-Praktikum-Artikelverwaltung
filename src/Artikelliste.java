import java.util.ArrayList;

public class Artikelliste {

    private ArrayList<Artikel> artikelListe;

    public Artikelliste(){
        artikelListe = new ArrayList<Artikel>();
    }

    public int count(){
        int ctr = 0;
        for(Artikel meinArtikel: artikelListe){
            ctr++;
        }
        return ctr;
    }

    public Artikel holen(int index){
        return artikelListe.get(index);
    }

    public void hinzufuegen(Artikel produkt){
        artikelListe.add(produkt);
    }

    public void entfernen(int index){
        artikelListe.remove(index);
    }

    public Artikel suchen(String artikelnummer){
        for(Artikel meinArtikel : artikelListe){
            if(meinArtikel.getArtikelnummer() == artikelnummer){
                return meinArtikel;
            }
        }
        return null;
    }
}
