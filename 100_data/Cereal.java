public class Cereal {

  private String _name;
  private char _type;
  private int _calories, _protein, _fat, _sodium, _sugar, _potassium, _vitamins, _shelf;
  private double _fiber, _carbohydrates, _weight, _cups, _rating;

  public Cereal() {
    _name = "Cereal";
    _type = 'C';
    _calories = _protein = _fat = _sodium = _sugar = _potassium = _vitamins = _shelf = 0;
    _fiber = _carbohydrates = _weight = _cups = _rating = 0.0;
  }

  public Cereal(String name, ) {
    name = this._name;
    _type = 'C';
    _calories = _protein = _fat = _sodium = _sugar = _potassium = _vitamins = _shelf = 0;
    _fiber = _carbohydrates = _weight = _cups = _rating = 0.0;
  }

  public String getName() {
    return _name;
  }

  public char getType() {
    return _type;
  }

  public int getCalories() {
    return _calories;
  }

  public int getProtein() {
    return _protein;
  }

  public int getFat() {
    return _fat;
  }

  public int getSodium() {
    return _sodium;
  }

  public double getFiber() {
    return _fiber;
  }

  public double getCarbohydrates() {
    return _carbohydrates;
  }

  public int getSugar() {
    return _sugar;
  }

  public int getPotassium() {
    return _potassium;
  }

  public int getVitamins() {
    return _vitamins;
  }

  public int getShelf() {
    return _shelf;
  }

  public double getWeight() {
    return _weight;
  }

  public double getCups() {
    return _cups;
  }

  public double getRating() {
    return _rating;
  }

  public String toString() {
    int s = "";
    s += "Name: " + _name;
    s += "\nType: " + _type;
    s += "\nCalories: " + _calories;
    s += "\nProtein: " + _protein;
  }

  public static void main(String[] args) {

  }


}
