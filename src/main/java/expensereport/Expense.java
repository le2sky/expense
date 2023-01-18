package expensereport;

import static expensereport.Expense.Type.BREAKFAST;
import static expensereport.Expense.Type.DINNER;

public class Expense {

  boolean isMeal() {
    return type == BREAKFAST || type == DINNER;
  }

  boolean isOverage() {
    return (type == DINNER && amount > 5000)
        || (type == BREAKFAST && amount > 1000);
  }

  public enum Type {DINNER, BREAKFAST, CAR_RENTAL}

  ;
  public Type type;
  public int amount;

  public Expense(Type type, int amount) {
    this.type = type;
    this.amount = amount;
  }
}
