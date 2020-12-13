public class Address1 {
    private String country, region, city, street, house, corpus, apart;
    public Address1(String str){
        String[] strings = str.split(",");
        if(strings.length<7){
            throw new IllegalArgumentException();
        }
        country=strings[0].trim();
        region = strings[1].trim();
        city = strings[2].trim();
        street = strings[3].trim();
        house = strings[4].trim();
        corpus = strings[5].trim();
        apart = strings[6].trim();
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
