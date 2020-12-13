public class Test {
    public static void main(String[] args) {
        Address1 address1 = new Address1("Беларусь, Могилевская область, Могилев, Арханельский переулок, 30, ,5");
        if(!address1.getCity().equals("Могилев"))
            throw new AssertionError();
        Address2 address2 = new Address2("Беларусь; Могилевская область, Могилев, Арханельский переулок.30, ,5");
        if(!address1.getCountry().equals("Беларусь"))
            throw new AssertionError();
        if(!address1.getRegion().equals("Могилевская область"))
            throw new AssertionError();
        if(!address1.getCity().equals("Могилев"))
            throw new AssertionError();
    }
}
