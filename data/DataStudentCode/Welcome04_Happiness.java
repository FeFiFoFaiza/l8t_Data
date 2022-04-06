import core.data.*;

public class Welcome04_Happiness {
  public static void main(String[] args) {
    DataSource ds = DataSource.connect("https://data.world/laurel/world-happiness-report-data");
    ds.load();
  }
}
