public class Artikel {
    private String artikelnummer = "";
    private String bezeichnung = "";
    private double preis = 0;

    public Artikel(String artikelnummer, String bezeichnung, double preis){
        setArtikelnummer(artikelnummer);
        setBezeichnung(bezeichnung);
        setPreis(preis);
    }

    public String getArtikelnummer(){
        return artikelnummer;
    }
    public void setArtikelnummer(String artikelnummer){
        this.artikelnummer = artikelnummer;
    }
    public String getBezeichnung(){
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public double getPreis(){
        return preis;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
}
