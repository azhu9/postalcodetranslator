public class Methods {
  private String postCode;
  private String barCode = "", binaryCode = "";
  private String binaryKey[] = {"11000", "00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"};
  private String barKey[] = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
  private int split[] = new int[5];
  private int total = 0;
  private int correctionDigit = 0;

  public Methods(String postCode){
      this.postCode = postCode;
      splitByDigit();
      calculateCorrectionDigit();
  }

  public void splitByDigit(){
    for(int i = 0; i < postCode.length(); i++){
      split[i] = Integer.parseInt(postCode.substring(i, i + 1));
    }
  }

  public String convertToBinaryCode(){
    for(int i = 0; i < split.length; i++){
      if(i == 0){
        binaryCode += binaryKey[split[i]];
      }
      else{
        binaryCode += " "+binaryKey[split[i]];
      }
    }
    return binaryCode;
  }

  public String convertToBarCode(){
    for (int i = 0; i < split.length; i++){
      if(i == 0){
        barCode += barKey[split[i]];
      }
      else{
        barCode += " "+barKey[split[i]];
      }    }
    return barCode;
  }

  public void calculateCorrectionDigit(){
    for(int i = 0; i < split.length; i++){
        total += split[i];
    }
    if(total % 10 != 0){
      correctionDigit = (10 - (total % 10));
    }
    System.out.println(correctionDigit);
  }

  public String compileBinaryCode(){
    return "1" + convertToBinaryCode() + " " + binaryKey[correctionDigit] + "1";
  }

  public String compileBarCode(){
    return "|" + convertToBarCode() + " " + barKey[correctionDigit] + "|";
  }
}

