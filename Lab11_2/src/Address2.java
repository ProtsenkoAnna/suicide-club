import java.util.StringTokenizer;

public class Address2 {
    private String country, region, city, street, house, corpus, apart;
    public Address2(String str){
        StringTokenizer st = new StringTokenizer(str, ".,;");
        if(st.countTokens()<7){
            throw new IllegalArgumentException();
        }
        country=st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        house = st.nextToken().trim();
        corpus = st.nextToken().trim();
        apart = st.nextToken().trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getApart() {
        return apart;
    }
}
