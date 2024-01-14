package deneme;

public class TelefonAdapter implements BeyazEsyaArayuzu{
    Telefon telefon;

    public TelefonAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public void BeyazEsyaSarjMethodu() {
        telefon.BesVoltIleSarjEt();
    }
}
