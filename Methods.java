public class Methods {
    private String postCode;
    private String barCode = "";
    private String key[] = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    private int split[] = new int[5];
    private int total = 0;

    public Methods(String postCode){
        this.postCode = postCode;

    }


    public String translate(){
        for (int i = 0; i < 5; i++){
          split[i] = Integer.parseInt(postCode.substring(i, i + 1));
          barCode += " "+key[split[i]];
          total += split[i];
        }
        return barCode += " "+key[(total % 10)];
    }
}
