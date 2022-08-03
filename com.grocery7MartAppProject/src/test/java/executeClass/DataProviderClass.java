package executeClass;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
  @DataProvider(name = "dataProvider")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "adminn", "admin" },
      new Object[] { "admin", "adminn" },
      new Object[] { "adminn", "adminn" },
    };
  }
}
