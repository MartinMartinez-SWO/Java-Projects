public class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }
  
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
    }
  
    public static void main (String[] args){
      Language french = new Language("French", 2, "Vichy-France", "a-bueno-temecuidas");
      french.getInfo();
  
      Mayan atlasian = new Mayan("Atlassian", 2000);
      atlasian.getInfo();
  
      SinoTibetan ayuco = new SinoTibetan("Auico", 12);
      SinoTibetan tibetan = new SinoTibetan("Tibetan Chinese", 300);
      ayuco.getInfo();
      tibetan.getInfo();
  
    }
  }