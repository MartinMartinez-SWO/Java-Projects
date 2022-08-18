public class Droid{
    String name;
    int batteryLevel;
    
    
    
    public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
    }
    
    public String toString(){
      return "This droid is called " + name + "and has a battery % of: " +  batteryLevel;
    }
    
    public void performTask(String task){
      System.out.println(name + "is performing task: " + task);
      batteryLevel-=10;
    }
    
    
      public static void main(String[] args){
        Droid newDroid = new Droid("Codey");
        newDroid.performTask("Laugh");
       System.out.println(newDroid.toString());
      }
    }