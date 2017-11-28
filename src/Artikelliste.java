import java.util.ArrayList;

public class Artikelliste {

    private ArrayList<Artikel> artikelListe;

    public Artikelliste(){
        artikelListe = new ArrayList<Artikel>();
    }

    public Artikel holen(int index){
        return artikelListe.get(index);
    }

    public void hinzufuegen(Artikel produkt){
        artikelListe.add(produkt);
    }

    public void hinzufuegen(int index){
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
