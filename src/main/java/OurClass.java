public class OurClass implements OurInterface {

    private String hello;
    private String shalom;

    public OurClass(String hello) {
        this.hello = hello;
    }

    public String getShalom() {
        return shalom;
    }

    public void setShalom(String shalom) {
        this.shalom = shalom;
    }

    public void helloSpring() {
        System.out.println(hello);
    }

    public void shalomSpring() {
        System.out.println(shalom);
    }
}
