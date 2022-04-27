public class House extends Building {
  private String houseNumber = "";

  public House(int floor, int people, String houseNumber) {
    super(floor, people);
    this.houseNumber = houseNumber;
  }
  public String getHouseNumber(){
    return this.houseNumber;
  }

}
