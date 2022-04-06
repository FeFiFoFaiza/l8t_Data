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

  public Cereal(String name, char type, int calories, int protein, int fat, int sodium,
                double fiber, double carbohydrates, int sugar, int potassium, int vitamins,
                int shelf, double weight, double cups, double rating) {
    this._name = name;
    this._type = type;
    this._calories = calories;
    this._protein = protein;
    this._fat = fat;
    this._sodium = sodium;
    this._sugar = sugar;
    this._potassium = potassium;
    this._vitamins = vitamins;
    this._shelf = shelf;
    this._fiber = fiber;
    this._carbohydrates = carbohydrates;
    this._weight = weight;
    this._cups = cups;
    this._rating = rating;
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
    String s = "";
    s += "Name: " + _name;
    s += "\nType: " + _type;
    s += "\nCalories: " + _calories;
    s += "\nProtein: " + _protein;
    s += "\nFat: " + _fat;
    s += "\nSodium: " + _sodium;
    s += "\nFiber: " + _fiber;
    s += "\nCarbohydrates: " + _carbohydrates;
    s += "\nSugar: " + _sugar;
    s += "\nPotassium: " + _potassium;
    s += "\nVitamins: " + _vitamins;
    s += "\nShelf: " + _shelf;
    s += "\nWeight: " + _weight;
    s += "\nCups: " + _cups;
    s += "\nRating: " + _rating;
    return s;
  }

  public static void main(String[] args) {
    Cereal hundo_bran = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402973);
    System.out.println(hundo_bran);
    System.out.println();

    Cereal hundo_nat_bran = new Cereal("100% Natural Bran", 'C', 120, 3, 5, 15, 2, 8, 8, 135, 0, 3, 1, 1, 33.983679);
    System.out.println(hundo_nat_bran);
    System.out.println();

    Cereal all_bran = new Cereal("All-Bran", 'C', 70, 4, 1, 260, 9, 7, 5, 320, 25, 3, 1, 0.33, 59.425505);
    System.out.println(all_bran);
  }


}
