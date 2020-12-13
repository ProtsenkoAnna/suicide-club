public class Person {
    private String sName, fName, pName;

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public String getpName() {
        return pName;
    }

    public Person(String sName, String fName, String pName) {
        this.fName = fName;
        this.sName = sName;
        this.pName = pName;
    }

    public Person(String sName, String fName) {
        this.sName = sName;
        this.fName = fName;
    }

    public Person(String sName) {
        this.sName = sName;
    }

    public String getFIO(){
       StringBuilder builder = new StringBuilder(sName);
       if (fName!=null && fName.length()>0){
           builder.append(' ').append(fName.charAt(0)).append('.');
           if (pName!=null && pName.length()>0){
               builder.append(pName.charAt(0)).append('.');
           }
       }
       return builder.toString();
   }
   static public void main(String[] args){
        System.out.println(new Person("Пифагор").getFIO());
        System.out.println(new Person("Bond","James").getFIO());
        System.out.println(new Person("Иванов", "Иван","Иванович").getFIO());
   }
}
