import com.google.gson.annotations.SerializedName;

public class Moedas {



    @SerializedName("base_code")
    private String moedaOriginal;
    @SerializedName("target_code")
    private String moedaAConverter;
    @SerializedName("conversion_result")
    private double valorConvertido;

    public String getMoedaOriginal() {
        return moedaOriginal;
    }

    public String getMoedaAConverter() {
        return moedaAConverter;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
